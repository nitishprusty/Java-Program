import java.util.Scanner;

public class printPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting Number");
        int lower = sc.nextInt();
        System.out.println("Enter the ending Number");
        int higher = sc.nextInt();

        sc.close();
        // traverse
        for (int i = lower; i <= higher; i++) {
            if (checkprime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean checkprime(int num) {
        boolean flag = true;
        if (num == 1) {
            flag = false;
            return flag;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
            }
        }
        return flag;
    }
}
