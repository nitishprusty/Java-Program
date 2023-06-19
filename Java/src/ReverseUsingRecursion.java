public class ReverseUsingRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int low = 0;
        int high = arr.length - 1;
        reverseArr(arr, low, high);
        printArr(arr);
        
    }
    static void reverseArr(int [] arr,int start,int end){
        if(start>=end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArr(arr, start + 1, end - 1);

    }
    static void printArr(int [] arr){
        for(Integer ar: arr){
            System.out.print(ar + " ");
        }
        System.out.println();
    }
}
