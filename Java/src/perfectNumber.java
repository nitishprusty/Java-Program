import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int sum = 0;
        sc.close();
        if(num < 0){
            System.out.println("Enter a positive Number");
        }
        for(int i = 1;i<num;i++){
            if(num % i == 0){
                sum+=i;    
            }
        }
        if(num == sum){
            System.out.println(num + " is perfect square Number");
        }else{
            System.out.println(num + " is not a perfect square number");
        }
    }
}
