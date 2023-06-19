/*
 * Write a java program to reverse a stack
 */
package Java.Github;

import java.util.Stack;

public class ReverseaStack{
    static void reverse(Stack<Integer> stack){
         Stack<Integer> rev = new Stack<>();
         while(!stack.isEmpty()){
            rev.add(stack.pop());
         }
         stack.addAll(rev);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i = 1;i<=5;i++)
        {
            st.add(i);
        }
        System.out.println("Original stack is " + st);
        reverse(st);
        System.out.println("After rev "  + st);
    }
}