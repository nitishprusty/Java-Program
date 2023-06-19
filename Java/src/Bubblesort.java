public class Bubblesort {
    public static void main(String[] args) {
        int [] arr = {10,4,78,5,69};
        int temp;
        for(int i = 0;i<arr.length;i++){ 
            for(int j = 0;j<arr.length-1-i;j++){
                int flag = 0;
                if(arr[j] > arr[j+1]){ //4 5 10 69 78
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
                if(flag == 0){
                    break;
                }
            }
            
        }
        printArr(arr);
    }
    static void printArr(int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
