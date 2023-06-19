package Java.Github;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        
        // Queue data structure follows First in first out 

        Queue<Integer> q1 = new LinkedList<>();
        //adding the element

        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);

        //printing the element
        System.out.println(q1);

        //removing the element 
        //the element that is inserted first should be removed first

        System.out.println(q1.poll());
        System.out.println(q1);

        //peek element
        System.out.println(q1.peek());


    } 
}
