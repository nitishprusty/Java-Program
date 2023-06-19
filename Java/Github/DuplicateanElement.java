package Java.Github;

import java.util.Scanner;

public class DuplicateanElement {
    /*
     * Java Program to duplicate an Element
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        if (size > 0) {

            int[] arr = new int[size + 1]; // size + 1 because we have to duplicate an element so we need a extra space

            for (int i = 0; i < size; i++) {
                System.out.println("Enter the element for " + i + " position ");
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the position you want to replicate");

            int pos = sc.nextInt();

            if (pos < size) {

                arr[size] = arr[pos];
                System.out.println("Array after replicating");

                for (Integer i : arr) {
                    System.out.print(i + " ");
                }
                System.out.println();

            } else {
                System.out.println("Cannot Replicate");
            }

        } else {
            System.out.println("Inavlid array s");
        }

        sc.close();

    }
}
