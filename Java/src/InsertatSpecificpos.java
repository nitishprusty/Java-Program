public class InsertatSpecificpos {
    public static int count  = 5;
    /*
     * Write a java prog to insert an element to a specific position of an array
     * arr = {45,1,23,5,66}
     * element  = 10
     * insert the element at pos 3
     * newarr = {45,1,10,23,5,66}
     */
    public static void main(String[] args) {
         int [] arr = {45,1,23,5,66};
         System.out.println("array before inserting");
         print(arr);
         System.out.println("Array after inserting");
         insert(arr, 3, 10);
         print(arr);
    }
    static void print(int [] arr){
        for(int i = 0;i<count;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void insert(int [] arr,int pos,int element){
        
        for(int i = count - 1;i>=(pos - 1);i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = element;
        
        
    }
}
