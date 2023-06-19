public class reverseAnarray {
    public static void main(String[] args) {

        int [] arr = {7,8,9,45,6,4};
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for(int i =  0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
