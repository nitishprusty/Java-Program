public class sumofdigitsrec {
    public static void main(String[] args) {
        //1234
        //10
        //using recursion
        int num = 336;
        int sum = 0;
        printsum(num, sum);
    }
    static void printsum(int num,int sum){
        if(num <= 0) {  //base case
            System.out.println(sum);
            return;
        }
        int remainder = num%10;
        sum += remainder;
        printsum(num/10, sum);
    }
}
