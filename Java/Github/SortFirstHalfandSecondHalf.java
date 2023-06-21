package Java.Github;

import java.util.Arrays;
import java.util.Scanner;

public class SortFirstHalfandSecondHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();

        if (n > 0) {
            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] arr1 = Arrays.copyOfRange(arr, 0, n / 2);
            int[] arr2 = Arrays.copyOfRange(arr, n / 2, n);

            sortAscending(arr1);
            sortDescending(arr2);

            int[] res = new int[n];
            System.arraycopy(arr1, 0, res, 0, arr1.length);
            System.arraycopy(arr2, 0, res, arr1.length, arr2.length);
            print(res);
        } else {
            System.out.println("Array size should be greater than 0");
        }
        sc.close();
    }

    static void sortAscending(int[] arr) {
        int min, temp;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    static void sortDescending(int[] arr) {
        int max, temp;
        for (int i = 0; i < arr.length; i++) {
            max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

    static void print(int[] arr) {
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
