import java.util.Scanner;

public class Nextgreaterelement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element");
        int element = sc.nextInt();
        sc.close();

        // problem statement - We have to find the next greatest element in array;
        // arr - {10,45,12,89,5,63};
        // input - 10 -> 45
        // input - 45 -> 89
        // input - 12 -> 89
        // input - 89 -> null

        int[] arr = { 10, 45, 12, 89, 5, 63 };
        int secondhighestelement = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                while (i < arr.length) {
                    if (arr[i] > element) {
                        secondhighestelement = arr[i];
                        // flag = false;
                        break;
                    }
                    i++;
                }
            }

        }

        if (secondhighestelement == 0) {
            System.out.println("The next greater element in array is " + null);

        } else {

            System.out.println("The next greater element in array is " + secondhighestelement);

        }

    }

}
