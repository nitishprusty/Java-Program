package Java.Github;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ScoreCardDriver {
     public static int maxSize = 100;
    // private int front = 0;
    // private int rear = 0;
    // private int [] queueArray = new int[maxSize];

    // public boolean isEmpty(){
    //     return front == rear;
    // }
    // //enqueue
    // public void enQueue(int val){
    //     if(rear - front == 5){
    //         dequeue();
    //     }
    //     queueArray[rear] = val;
    //     rear++;
    // }
    // //dequeue
    // public void dequeue(){
    //     if(isEmpty()){
    //         return;
    //     }
    //     front++;
        
    // }
    // public void display(){
    //     for(int i = front;i<rear;i++){
    //         System.out.print(queueArray[i] + " ");
    //     }
    //     System.out.println();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ScoreCardDriver obj = new ScoreCardDriver();
        System.out.println("Enter the size of the score card");
        int size = sc.nextInt();
        if(size > 0 && size <= maxSize){

            // for(int i = 0;i<size;i++){
            //     System.out.println("Enter the hurdle race score " + (i+1) + ":");
            //     obj.enQueue(sc.nextInt());
            //     System.out.println();
            // }
            // System.out.println("Latest hurdle score is ");
            // obj.display();

            Queue<Integer> que = new LinkedList<>();

            for(int i = 0;i<size;i++){
                if(i >= 5){
                    que.remove();
                }
                System.out.println("Enter the hurdle race score " + (i+1) + ":");
                que.add(sc.nextInt());
            }
            System.out.println("Latest hurdle score is");
            for(Integer i : que){
                System.out.print(i + " ");
            }
            System.out.println();


            
        }else{
            System.out.println("Invalid score Card size");
        }
        sc.close();
    }
}
