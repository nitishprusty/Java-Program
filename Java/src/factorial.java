public class factorial {
    public static void main(String[] args) {

        int num = 5;
        int ans = printfact(num);
        System.out.println(ans);
        
    }
    static int printfact(int n){
        if(n == 1){
            return 1;
        }
        return n *printfact(n - 1);
    }
}
