package Java.Github;

public class ArraySquare {
    public static void main(String[] args) {
        int size = 5;
        int [] arr1 = new int[size];
        for(int i = 0;i<size;i++){
            arr1[i] = i + 1;
        }
        int [] arr2 = new int[size];
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                if( i!= j){
                    arr2[i] += arr1[j] * arr1[j];
                }
            }
        }
        for(Integer k : arr2){
             System.out.print(k + " ");
        }
        System.out.println();
    }
}
