package Java.Github;

import java.util.Scanner;

class Node{
    int data;
    Node nextNode;

    public Node(int data){
        this.data = data;
        this.nextNode = null;

    }
}
public class Linkedlist {
    public int size;
    Node headNode;
    public Linkedlist(){
        this.headNode = null;
    }
    public void insertdata(int val){
        Node newnode = new Node(val);
        if(headNode == null){
            headNode = newnode;
            size++;
            return;
        }
        newnode.nextNode = headNode;
        headNode = newnode;
        size++;
    }
    public void InsertAtend(int val){
        
        Node newnode = new Node(val);
        if(headNode == null){
            headNode = newnode;
            size++;
            return;
        }
        Node currNode = headNode;
        while(currNode.nextNode != null){
            currNode = currNode.nextNode;
        }
        currNode.nextNode = newnode;
        size++;
    }
    public int count(int var_Search){
        int count = 0;
        Node currNode = headNode;
        while(currNode != null){
           if(currNode.data == var_Search){
            count++;
           }
           currNode = currNode.nextNode;
        }
        return count;
    }
    public void printdata(){
        Node currenrNode = headNode;
        while(currenrNode != null){
            System.out.print(currenrNode.data + " -> ");
            currenrNode = currenrNode.nextNode;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int n = sc.nextInt();
        int [] a = new int[100];
        if(n == 0 || n < 0){
            System.out.println("Invalid size");
        }else{
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
                list.InsertAtend(a[i]);
            }
        }
        System.out.println("Printing the list");
        list.printdata();
        System.out.println("Enter the key you want to find occurence");
        int k = sc.nextInt();
        sc.close();
        System.out.println(k + " Ocuurs for " + list.count(k) + " times");

    }
}
