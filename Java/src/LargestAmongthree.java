import java.util.Scanner;
public class LargestAmongthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Another Number");
        int num2 = sc.nextInt();
        System.out.println("Enter third Number");
        int num3 = sc.nextInt();
        sc.close();
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is greatest among three");
        }else if(num2 > num1 && num2>num3){
            System.out.println(num2 + " is greatest among three");
        }else{
            System.out.println(num3 + " is greatest among three");
        }
    }
}
