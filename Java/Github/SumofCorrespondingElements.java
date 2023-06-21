package Java.Github;

import java.util.Scanner;

public class SumofCorrespondingElements {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the size of an array");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid size");
            } else {
                int[] a = new int[n];
                System.out.println("Enter the elements into first array");
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                System.out.println("Enter the size of second array");
                int n1 = sc.nextInt();
                if (n1 <= 0) {
                    System.out.println("Invalid size");
                } else {
                    int a1[] = new int[n1];
                    System.out.println("Enter the elements into second array");
                    for (int i = 0; i < n1; i++) {
                        a1[i] = sc.nextInt();
                    }
                    if (n == n1) {
                        for (int i = 0; i < n; i++) {
                            System.out.println(a[i] + a1[i]);
                        }
                    } else if (n > n1) {
                        for (int i = 0; i < n1; i++) {
                            System.out.println(a[i] + a1[i]);
                        }
                        for (int i = n1; i < n; i++) {
                            System.out.println(a[i]);
                        }
                    } else if (n1 > n) {
                        for (int i = 0; i < n; i++) {
                            System.out.println(a[i] + a1[i]);
                        }
                        for (int i = n1; i < n; i++) {
                            System.out.println(a1[i]);
                        }
                    }
                }
            }
        }
    }
}
