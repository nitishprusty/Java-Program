package Java.Github;

/*
 * This program will generate the maximum difference between the elements inside an Array
 * And finally return its index
 */

public class MaxDiff {
    public static void main(String[] args) {
        int [] arr = {31,45,3,56,95,78};
        int maxdiff = arr[1] - arr[0];
        int min= arr[0];
        int first = 0;
        int second = -1;
        for(int i = 1;i<arr.length;i++){
            if((arr[i] - min) > maxdiff){
                maxdiff = arr[i] - min;
                second = i;
            }
            if(arr[i] < min){
                min = arr[i];
                first = i;
            }
        }
        System.out.println("{" + first + "," + second + "}");
    }
}
