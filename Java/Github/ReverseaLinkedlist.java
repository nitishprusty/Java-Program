package Java.Github;
import java.util.Scanner;

public class ReverseaLinkedlist {
    public class Node{
        int data;
        Node next;

        public Node(int val){
            this.data = val;
            this.next = null;
        }
    } 
    Node head;
    public ReverseaLinkedlist(){
        this.head = null;
    }
    public void add(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }
    //reverse
    public void reverse(){
        if(head == null || head.next == null)
        {
            return;
        }
        Node prev = head;
        Node currentNode = head.next;
        while(currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prev;

            prev = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prev;
    }
    public void display(){


        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.print("null");
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseaLinkedlist obj = new ReverseaLinkedlist();
        do{
            System.out.println("Enter a Number");
            int num = sc.nextInt();
            obj.add(num);
            System.out.println("Do you want to add more elements type (Yes to continue/No to close)");
            sc.nextLine();
        }while(sc.nextLine().equalsIgnoreCase("Yes"));
        sc.close();
        obj.display();  

        System.out.println("After Reverse");
        obj.reverse();
        obj.display();
        
        
    }
}
