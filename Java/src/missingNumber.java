public class missingNumber {
    /*
     * Test Case 1
     * arr = {1,2,3,4,5,7,8,9,10}
     * output = 6
     * 
     * Test Case 2 
     * arr = {2,3,4,5,6,7,8,9,10}
     * output = 1
     * 
     * Test Case 3
     * arr = {1,2,3,4,5,6,7,8,9}
     * output = 10
     * 
     * Test Case 4
     * arr = {1,2,3,4,5,6,7,8,9,10}
     * output = null
     * There is no missing element
     */
    public static void main(String[] args) {
         int [] arr = {1,2,3,4,6,7,8,9,10};
         int missingNumber = 0;
         if(arr[0] != 1){
            missingNumber = 1;
         }
         if(arr[arr.length - 1] != 10){
            missingNumber = 10;
         }
         for(int i = 1 ;i < arr.length;i++){
            if(arr[i - 1] != arr[i] - 1){
                missingNumber =  (arr[i-1] + 1);
            }
         }
         if(missingNumber == 0){
            System.out.println("There is no missing element");
         }else{
         System.out.println("The missing Number is " + missingNumber);
         }
    }
}
