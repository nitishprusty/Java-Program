public class powofNumber {
    /*
     * Write a program to calculate power of a Number using recursion
     * 3^3 = 27
     */
    public static void main(String[] args) {
        int num = 3;
        int pow = 0;
        int res = calculatepow(num,pow);
        System.out.println(res);
    }
    static int calculatepow(int n,int m){
        if(m == 0){
            return 1;
        }
        if(m == 1){
            return n*1;
        }
        return 1 * n* calculatepow(n, m - 1);
    }
}
