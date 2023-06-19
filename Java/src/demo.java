import java.util.Stack;

public class demo{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i = 1;i<=5;i++){
            st.push(i);
        }
        System.out.println("Original stack is " + st);
        reverse(st);
        System.out.println("Reversed stack is " + st);
    }
    static void reverse(Stack<Integer> st){
        if(st.isEmpty() || st.size() == 1){
            return;
        }
        int topelement = st.pop();
        reverse(st);
        insertAtBottom(st, topelement);

    }
    static void insertAtBottom(Stack<Integer> st,int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int topelement = st.pop();
        insertAtBottom(st, val);
        st.push(topelement);
    }
}