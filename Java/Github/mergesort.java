package Java.Github;

public class mergesort{
    public static void main(String[] args) {
        int [] arr = {45,12,36,98,5};
        int left = 0;
        int right = arr.length-1;
        Divide(arr,left,right);
        printArr(arr);
    }
    static void Divide(int [] arr,int left,int right){

        if(left < right){
            int mid = (left + right)/2;
            Divide(arr, left,mid);
            Divide(arr, mid + 1, right);
            merge(arr,left,mid,right);
        }
        
    }
    static void merge(int [] arr,int left,int mid,int right){
          int i = left;
          int j = mid + 1;
          int k = left;
          int [] temp = new int[arr.length];
          while(i <= mid && j <= right){
            if(arr[i] < arr[j]){
               temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
          }
          if(i > mid){
            while(j <= right){
                temp[k++] = arr[j++];
            }
          }else{
            while(i <= mid){
                temp[k++] = arr[i++];
            }
          }
          for(k = left;k<=right;k++){
            arr[k]=  temp[k];
          }
    }
    static void printArr(int [] arr){
        for(Integer i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}