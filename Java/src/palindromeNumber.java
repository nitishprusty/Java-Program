import java.util.Scanner;
public class palindromeNumber {
    public static void main(String[] args) {
        //check a Number is palindrome or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        sc.close();
        int temp = num;
        int rev = 0;
        while(temp > 0){
            int remainder = temp%10;        //This is rev the number
            rev  = rev*10 + remainder;
            temp = temp/10;
        }

        //check if the rev number and the number entered by the user is same or not 
        //if same the number is plaindrome
        //else the num is not palindrome

        if(rev == num){
            System.out.println("The Number is palindrome");
        }else{
            System.out.println("The Number is not palindrome");
        }
    }
}
