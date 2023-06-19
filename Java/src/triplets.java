import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class triplets {
    public static void main(String[] args) {
        int [] arr = {1,2,-3,4,-2,-1};
        int sum = 1;
        System.out.println(findtriplets(arr, sum));
    }
    static List<List<Integer>> findtriplets(int [] arr,int sum){
        List<List<Integer>> arrlist = new ArrayList<>();
        Arrays.sort(arr); //-3,-2,-1,1,2,4
        for(int i = 0;i<arr.length-2;i++){
            int targetsum = sum - arr[i];
            int high = arr.length-1;
            int low = i+1;
            while(low <= high){
                if(arr[low] + arr[high] == targetsum){
                    arrlist.add(Arrays.asList(arr[low],arr[high],arr[i]));  //arr[i] + arr[low] + arr[high] = sum 
                    low++;                                                  //arr[low] + arr[high] = sum - arr[i]
                    high--;                                                 //targetsum = sum - arr[i]
                }else if(arr[low] + arr[high] < targetsum){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return arrlist;
    }
}
