import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number"); //190
        int num = sc.nextInt();
        sc.close();
        int count = 0;
        while(num > 0){
            num = num/10; //num = 19/10 = 1
            count++; //c = 3
        }
        System.out.println(count); //3
        
    }
}
