import java.util.Stack;

public class minelementstack {
    /*
     * Write a prog to find the min element in a stack
     * Stack.push(45);
     * Stack.push(14);
     * Stack.push(2);
     * Stack.push(65);
     * 
     * min element is 2
     * return the 2
     */
    public static void main(String[] args) {
         minelementstack obj = new minelementstack();
         obj.push(13);
         obj.push(45);
         obj.push(8);
         obj.push(16);
         obj.getminimum();
         obj.popElements();
         obj.popElements();
         obj.getminimum();
    }
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int data){
        stack1.push(data);
        if(minStack.isEmpty()){
            minStack.push(data);
        }
        if(data < minStack.peek()){
            minStack.push(data);
        }
    }

    public void popElements(){
        int val = stack1.pop();
        if(val == minStack.peek()){
            minStack.pop();
        }
        
    }
    public void getminimum(){
        if(minStack.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        int min = minStack.peek();
        System.out.println("The minimum element in stack is " + min);
    }
}
