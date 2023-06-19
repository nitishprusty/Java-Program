package Java.Github;

import java.util.Scanner;

/*
 * This java program will swap the elements between two array
 */

public class InterchangeElements {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size1, size2;

            System.out.println("Enter the Number of elements for first array");

            size1 = sc.nextInt();
            if (size1 <= 0) {
                System.out.println("Invalid range");
                return;
            }

            int[] a = new int[size1];
            System.out.println("Enter the elements for First Array");
            for (int i = 0; i < size1; i++) {
                a[i] = sc.nextInt();
                if (a[i] <= 0) {
                    System.out.println("Invalid Range");
                }
            }

            System.out.println("Enter the Number of elements for Second Array");

            size2 = sc.nextInt();

            if (size2 <= 0) {
                System.out.println("Invalid range");
                return;
            }

            if (size1 != size2) {
                System.out.println("Unable to swap elements");
                return;
            }

            int[] b = new int[size2];

            System.out.println("Enter the elements for Second Array");
            for (int i = 0; i < size2; i++) {
                b[i] = sc.nextInt();

                if (b[i] <= 0) {
                    System.out.println("Invalid range");
                    return;
                }
            }

            // before swap
            System.out.println("Before Swapping");
            System.out.println("Array 1 - ");
            display(a);
            System.out.println("Array 2");
            display(b);

            System.out.println("After Swapping");
            swap(a, b);
            System.out.println("Array 1 - ");
            display(a);
            System.out.println("Array 2 -");
            display(b);

            sc.close();
        }

    }

    static void display(int[] arr) {
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void swap(int[] a, int[] b) {
        // As in this program the size of both array is same so the iteration will occur
        // till a.length
        // we can also take i < b.length
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + b[i];
            b[i] = a[i] - b[i];
            a[i] = a[i] - b[i];
        }
    }
}
