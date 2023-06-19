import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(50);
        st.push(90);

        st.pop();
        int top = st.peek();
        int var = st.search(20);
        System.out.println(st);
        System.out.println(top);
        System.out.println(var);

    }
}
