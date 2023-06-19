import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {10,2,5,6,6,8,9};
        //output = 2,5,6,8,9,10

        Arrays.sort(arr);
        //2,5,6,6,8,9,10

        int [] temp = new int[arr.length];
        int b = 0;

        for(int i = 0;i<arr.length-1;i++){ //6 < 6

            if(arr[i] != arr[i+1]){
                temp[b] = arr[i];
                b++;
            }

        }
        temp[b] = arr[arr.length-1];
        printArr(temp);
        
    }
    static void printArr(int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
