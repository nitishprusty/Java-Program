package Java.Github;

public class checkPalindrome {

    class Node{
        int data;
        Node next;

        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    Node head;
    checkPalindrome(){
        this.head = null;
    }

    public void add(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public Node reverse(Node head){
        if(head == null){
            return null;
        }
         Node prev = null;
         Node current = head;
         Node nextNode = null;
         while(current != null){
            nextNode = current.next;
            current.next = prev;

            prev = current;
            current = nextNode;
         }
         return prev;
    }


    public void display(){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();

    }

    public Node middleNode(Node headNode){
        Node slow = headNode;
        Node fast = headNode;
        

        while( fast.next != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(){
        if(head == null){
            return true;
        }
        Node original = head;
        Node mid = middleNode(head);
        Node revhead = reverse(mid);
        boolean flag = true;
        while(revhead != null){
            if(original.data != revhead.data){
                flag = false;
                break;
            }
            original = original.next;
            revhead = revhead.next;
        }
        return flag;
    }

    public static void main(String[] args) {
          checkPalindrome obj = new checkPalindrome();
          obj.add(1);
          obj.add(2);
          obj.add(3);
          obj.add(2);
          obj.add(1);

          boolean ans = obj.isPalindrome();

          String yes = "Linked list is palindrome";
          String no = "Linked list is not palindrome";
          
          String res = (ans) ? yes : no;
          System.out.println(res);
    }
}
