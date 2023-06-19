package Java.Github;

public class apown {
    static int calc(int a,int n){
        if(n == 0){
            return 1;
        }
        return 1*a*calc(a, n - 1);
    }
    public static void main(String[] args) {
         int a = 3;
         int n = 2;
         int ans = calc(a, n);
         System.out.println(ans);
    }
}
