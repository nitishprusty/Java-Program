package Java.Github;

public class Quicksort{
    public static void main(String[] args) {
        int [] arr = {45,6,98,53,65,5};
        int low = 0;
        int high = arr.length - 1;
        quicksort(arr, low, high);
        printarr(arr);
    }
    static void quicksort(int [] arr,int low,int high){
        if(low < high){
             int pivotIndex = partition(arr,low,high);
             quicksort(arr, low, pivotIndex - 1);
             quicksort(arr, pivotIndex + 1, high);
        }
    }
    static int partition(int [] arr,int low,int high){
         int pivot = arr[high];  //pivot = 65
         int i = low - 1;  //-1
         for(int j = low;j<=high;j++){  //45,6,98,53,65
            if(arr[j] < pivot){
                i++; 
                swap(arr, i, j);
            }
         }
         i++;
         swap(arr, i, high);
         return i;  
    }
    static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printarr(int [] arr){
        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}