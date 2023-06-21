package Java.Github;

import java.util.Scanner;

public class Allsortingalogorithm {
    static void Bubblesort(int [] arr){
        int temp;
        for(int i = 0;i<arr.length;i++){
            int flag = 0;
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
    }
    static void Insertionsort(int [] arr){
        int temp,j;
        for(int i = 1;i<arr.length;i++){
            temp = arr[i];
            j = i;
            while(j > 0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
    static void Selectionsort(int [] arr){
        int temp,min;
        for(int i = 0;i<arr.length;i++){
            min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    static void Divide(int [] arr,int low,int high){
        if(low < high){
            int mid = (low + high)/2;
            Divide(arr, low, mid);
            Divide(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }
    static void merge(int [] arr,int low,int mid,int high){
        int i = low;
        int j = mid + 1;
        int k = low;
        int [] temp = new int[arr.length];
        while(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }else{
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        if(i > mid){
            while(j <= high){
                temp[k++] = arr[j++];
            }
        }else{
            while(i <= mid){
               temp[k++] = arr[i++]; 
            }
        }
        for(k = low;k<=high;k++){
            arr[k] = temp[k];
        }
    }
    static void Quicksort(int [] arr,int low,int high){
        if(low < high){
            int pidx = partition(arr,low,high);
            Quicksort(arr, low, pidx - 1);
            Quicksort(arr,pidx+1,high);
        }
    }
    static int partition(int [] arr,int low,int high){
        int i = -1;
        int pivot = arr[high];
        for(int j = low;j<=high;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr,i,high);
        return i;

    }
    static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArr(int [] a){
        for(Integer i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Bubble sort \n 2 for Selection sort \n 3 for Insertion sort \n 4 for merge sort \n 5 for quicksort");
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        if(size < 0){
            System.out.println("Invalid size");
        }
        int [] a = new int[size];
        System.out.println("Enter elements into an array");
        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int choice = sc.nextInt();
        if(choice == 1){
            //bubblesort
            System.out.println("Bubble sort");
            System.out.println("Array Before Sorting :- ");
            printArr(a);
            System.out.println("Array After sorting :- ");
            Bubblesort(a);
            printArr(a);
        }else if(choice == 2){
            //selection sort
            System.out.println("Selection sort");
            System.out.println("Array Before Sorting :- ");
            printArr(a);
            System.out.println("Array After sorting :- ");
            Selectionsort(a);
            printArr(a);
        }else if(choice == 3){
            //Insertion sort
            System.out.println("Insertion sort");
            System.out.println("Array Before Sorting :- ");
            printArr(a);
            System.out.println("Array After sorting :- ");
            Insertionsort(a);
            printArr(a);
        }else if(choice == 4){
            //merge sort
            System.out.println("Merge sort");
            System.out.println("Array Before Sorting :- ");
            printArr(a);
            System.out.println("Array After sorting :- ");
            Divide(a, 0, a.length-1);
            printArr(a);
        }else if(choice == 5){
            //Quicksort
            System.out.println("Quicksort");
            System.out.println("Array Before Sorting :- ");
            printArr(a);
            System.out.println("Array After sorting :- ");
            Quicksort(a, 0, a.length-1);
            printArr(a);
        }
        sc.close();
    }
}
