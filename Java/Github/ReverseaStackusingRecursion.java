package Java.Github;
/*
 * Write a Java program to reverse a stack using recursion
 */

import java.util.Stack;

public class ReverseaStackusingRecursion {
    public static void main(String[] args) {
         Stack<Integer> st = new Stack<>();
         st.push(1);
         st.push(2);
         st.push(3);
         st.push(4);

         System.out.println("Original Stack is " + st);
         reverse(st);
         System.out.println("Reversed stackk is " + st);
    }
    static void reverse(Stack<Integer> st){
        if(st.isEmpty() || st.size()  == 1){
            return;
        }
        int topelement = st.pop();
        reverse(st);
        insertAtbottom(st, topelement);
    }
    static void insertAtbottom(Stack<Integer> st,int val){  //1,2,3,4   5
        if(st.isEmpty()){

            st.push(val);
            return;
            
        }

        int topelement = st.pop();
        insertAtbottom(st, val);
        st.push(topelement);
    }
}
