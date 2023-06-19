import java.util.Stack;

public class Nextgreater{
    public static void main(String[] args) {
        int [] arr = {15,4,56,23,89,5};
        findgreater(arr);
    }
    static void findgreater(int [] arr){
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<arr.length;i++){
            if(st.isEmpty()){
                st.push(arr[i]);
            }else{
                while(!st.isEmpty() && arr[i] > st.peek()){
                    System.out.println("Next greater element of " + st.peek() + " is " + arr[i]);
                    st.pop();
                }
                st.push(arr[i]);
            }
        }
        while(!st.isEmpty()){
            System.out.println("The next greater element of " + st.peek() + " is " + null);
            st.pop();
        }
    }
}