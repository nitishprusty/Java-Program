package Java.Github;

public class StackOperation {
    public static int top = -1;
    int [] stack = new int[100];

    //push
    public void push(int val){
       stack[++top] = val;
    }
    //pop
    public int pop(){
       return stack[top--];
    }

    public int findMiddle(){
        //if total elements is even
        if((top + 1)%2 == 0){
            return stack[(int)top/2];
        }else{
            //odd
            return stack[(int)(top + 1)/2];
        }
    }
    public static void main(String[] args) {
         StackOperation obj = new StackOperation();
         for(int i = 1;i<=6;i++){
            obj.push(i);
         }
         int middle = obj.findMiddle();
         System.out.println(middle);
         System.out.println(obj.pop());
    }
}
