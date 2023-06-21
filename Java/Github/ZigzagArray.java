package Java.Github;

public class ZigzagArray {
    /*
     *   In Zigzag array the elements are in this pattern
     *   let size is 6
     *   so arr[0] < arr[1] > arr[2] < arr[3] > arr[4] < arr[5]
     * 
     */
    static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void zigzag(int [] arr,int n){

        int flag = 0;  //This is for arr[0] < arr[1];
        //if flag = 1 = arr[1] > arr[2]

        for(int i = 0;i<n-1;i++){
            if(flag == 0){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i + 1);
                    
                }
                flag = 1;
            }else{
                if(arr[i] < arr[i+1]){
                    swap(arr, i, i + 1);
                    
                }
                flag = 0;
            }
        }

    }
    static void printArr(int [] a){
        for(Integer i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {4,3,7,8,6,2,1};
        int n = arr.length;
        zigzag(arr, n);
        printArr(arr);
    }
}
