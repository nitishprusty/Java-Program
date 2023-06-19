public class linkedlist{

    Node head;
    class Node{
        int data;
        Node next;
        
        private Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public linkedlist(){
        this.head = null;
    }

    public int size;
    
    //addFirst
    public void addFirst(int val){

        Node newnode = new Node(val);
        if(head == null){
             head = newnode;
             size++;
             return;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }

    //InsertAtend
    public void InsertAtend(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            size++;
        }else{
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            //assign the value
            currentNode.next = newNode;
            size++;
        }
    }

    public void printElement(){

        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    //delete first
    /*
     * logic
     * 1 -> 2 -> 3 -> 4 -> null;
     * head = 1;
     * if we make head the next element
     * then head = 2
     * 2 -> 3 -> 4 -> null
     * Delete first is successful
     */

    public void deleteFirst(){

        if(head == null){
            System.out.println("Cannot perform delete Operation");
            return;
        }

        head = head.next;
        size--;

    }

    public int getsize(){

        return size;

    }

    //delete last
    /*
     * logic
     * linkedlist = 1 -> 2 -> 3 -> 4 -> null
     * if we made our second last element.next = null
     * then our last element will get deleted
     */

    public void deletelast(){

        if(head == null){
            System.out.println("Cannot delete elements");
            return;
        }

        if(head.next == null){
            head = null;
            size--;
            return;
        }
         
        //1 -> 2 -> 3 -> 4 -> null

        Node secondlast = head;
        Node last = head.next;
        while(last.next != null){
            secondlast = secondlast.next;
            last = last.next;
        }
        secondlast.next = null;
        size--;
    }

    public int getlengthusingrecusion(Node temp){
        if(temp == null){   //1 -> 2 -> 3 -> 4 -> null
            return 0;
        }else{
            return 1 + getlengthusingrecusion(temp.next);
        }
    }

    public void findMiddle(){
        // --approach 1-- 
        // int count = 0;
        // Node temp = head;
        // while(temp != null){
        //     count++;
        //     temp = temp.next;
        // }
        // Node secondtemp = head;
        // for(int i = 0;i<count/2;i++){
        //     secondtemp = secondtemp.next;
        // }
        // System.out.println(secondtemp.data);

        // --approach2 --
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("The middle element is " + slow.data);
    }
    
    public boolean isPresent(int val){
        boolean flag = false;
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        return flag;
    }

    public static void main(String[] args) {
         linkedlist lst = new linkedlist();
         lst.addFirst(2);
         lst.addFirst(1);
         lst.InsertAtend(3);
         lst.InsertAtend(4);
         lst.InsertAtend(5);
         lst.InsertAtend(6);
         lst.InsertAtend(7);
        //  lst.InsertAtend(5);
         lst.printElement();
        //  System.out.println("The len of linkedlist is " + lst.getsize());
        //  lst.deleteFirst();
        //  lst.printElement();
        //  System.out.println("The len of linkedlist is " + lst.getsize());
        //  lst.deletelast();
        //  lst.printElement();
        //  System.out.println("The len of linkedlist is " + lst.getsize());
        // System.out.println("The length of linkedlist using recursion is " + lst.getlengthusingrecusion(lst.head));
        // System.out.println("The middle element of linkedlist is");
        lst.findMiddle();

        boolean res = lst.isPresent(10);
        if(res){
            System.out.println("Val is present in Linkedlist");
        }else{
            System.out.println("Val is not present in Linkedlist");
        }

        
    }
}