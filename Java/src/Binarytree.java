import java.util.LinkedList;
import java.util.Queue;

public class Binarytree {
    
    /*
     * Binary tree is a hierarchial data structure.        
     * Binary tree has two children node                   
     * left child node and right child node             
     *                1
     *               / \
     *              2   3                                   
     *             / \   \
     *            4   5   6
     *           / \       \
     *          7   8       9
     *  Basic question of tree
     *  Children of 2 - 4,5
     *  No of leaves - Total no of leaves is 4 => 7,8,5,9
     *  Parent of 3 - 1
     *  Level of 5 - Level 3 
     *  Subtree of 2 and 6 - 
     *  subtree of 2 = (4,7,8)leftsubtree and (5)Rightsubtree
     *  subtree of 6 = (9)Rightsubtree and ledtsubtree is null
     *  Ancestors of 4 = 2 and 1                          
     */
    
     static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
     }
     static class binaryTree{
        static int idx = -1;
        public  Node buildree(int [] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            //The data get stores in left and right child recursively
            newnode.left = buildree(nodes);
            newnode.right = buildree(nodes);

            return newnode;
        }
     }
     public static void preOrder(Node root){
        //dfs
         if(root == null){
            return;
         }
         System.out.print(root.data + " ");
         preOrder(root.left);
         preOrder(root.right);
     }
     //inorder traversal
     //leftsubtree data will be printed then root then rightsubtree data will be printed

     public static void Inorder(Node root){
        //dfs
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
     }

     public static void postOrder(Node root){
        //dfs
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
     }
     public static void levelorder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currentNode = q.remove();
            if(currentNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currentNode.data + " ");
                if(currentNode.left != null){
                    q.add(currentNode.left);
                }
                if(currentNode.right != null){
                    q.add(currentNode.right);
                }
            }
        }
     }
     
    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildree(nodes);
        preOrder(root);
        System.out.println();
        Inorder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelorder(root);
        
    }
}
