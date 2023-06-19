import java.util.HashSet;
import java.util.Set;

public class IntersectionbetLinkedlist {
    Node head;
    class Node{
        int data;
        Node next;
    
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public IntersectionbetLinkedlist(){
        this.head = null;
    }
    /*
     * Write a prog to find the intersection between linkedlist
     */
    public static void main(String[] args) {
        
    }
    static Node getIntersection(Node a,Node b){
        Node temp1 = a;
        Node temp2 = b;
        Set<Node> hs = new HashSet<>();
        while(temp1 != null){
            hs.add(temp1);
            temp1 = temp1.next;
        }
        while(temp2 != null){
           if(hs.contains(temp2)){
              return temp2;
           }
           temp2 = temp2.next;
        }
        return null;
    }

}
