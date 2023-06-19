public class selectionsort {
    public static void main(String[] args) {
        int [] arr = {10,45,2,1,65,25};    //2,45,10,1,65,25
        int temp,min;
        for(int i = 0;i<arr.length;i++){
            min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                       min = j; //min = 3
                }
            }
            //swap
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
