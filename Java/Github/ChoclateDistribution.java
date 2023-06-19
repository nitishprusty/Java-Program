package Java.Github;
/*
 *Given an array of choclate of size n and th number of student is m
  find the minimum difference of choclate distributed among the students.
  Ex,ample- 
     arr = {45,1,55,8,6,9,81}
     //sort the array 
     {1,6,8,9,45,55,81}
     let the number of students that is m = 3
     //so in the first cycle
     //by default the min diff is intialised with Integer.MAX_VAL;
     that is 1,6,8 min is 1 and max is 8 diff is 8 - 1 = 7 < min_diff so min_diff = 7
     //2nd cycle
     that is 6,8,9 min is 6 and max is 9 diff is 9 - 6 = 3 < 7 min_diff = 3
     //3rd cycle
     8,9,45 => 45 - 8 > min_diff
 */

import java.util.Arrays;

public class ChoclateDistribution {
    public static void main(String[] args) {
        int [] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        int n = arr.length;
        System.out.println(printMindifference(arr, n, m));
    }
    static int printMindifference(int [] arr,int n,int m){
        if(n == 0 || m == 0){
            return 0;
        }
        int mindiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0;(i + m-1) < n;i++){
            if(arr[i+m-1] - arr[i] < mindiff){
                mindiff = arr[i+m-1] - arr[i];
            }
        }
        return mindiff;
    }
}
