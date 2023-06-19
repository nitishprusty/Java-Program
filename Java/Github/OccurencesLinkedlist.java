package Java.Github;
public class OccurencesLinkedlist {
    class Node{
        int data;
        Node next;
    
        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    Node head;
    public OccurencesLinkedlist(){
        this.head = null;
    }
    public void add(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            return;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public void DeleteFirst(){
        if(head == null){
            System.out.println("Cannot delete from linkedlist");
            return;
        }
        head = head.next;
    }
    public void DeleteParticular(int pos){
        Node temp = head;
        Node prev = head;                 //1 -> 2 -> 3 -> 4 -> 5
        for(int i = 1;i<(pos - 1);i++){
            prev = prev.next;
        }
        for(int i = 1;i<pos;i++){
            temp = temp.next;
        }
        prev.next = temp.next;
    }
    public void deletelast(){
        Node temp = head;
        while(temp.next.next != null){
            temp  = temp.next;
        }
        temp.next = null;
        return;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        OccurencesLinkedlist obj = new OccurencesLinkedlist();
        for(int i = 1;i<=5;i++){
            obj.add(i);
        }
        System.out.println("Original Linkedlist");
        obj.display();
        // System.out.println("After deleting first element");
        // obj.DeleteFirst();
        // obj.display();
        // System.out.println("After Deleting last element");
        // obj.deletelast();
        // obj.display();
        // System.out.println("After deleting position 3");
        // obj.DeleteParticular(2);
        // obj.display();


    }
}
