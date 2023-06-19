import java.util.Stack;

public class queue{
    public static void main(String[] args) {
        queue Queue = new queue();
        Queue.enqueue(1);
        Queue.enqueue(2);
        Queue.enqueue(3);

        Queue.dequeue();
    }
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int val){
        stack1.push(val);
    }
    public void dequeue(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                System.out.println("Cannot perform dequeue operation");
            }else{
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
        }
        System.out.println(stack2.pop());
    }
}