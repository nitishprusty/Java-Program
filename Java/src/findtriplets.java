import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findtriplets {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int sum = 9;
        System.out.println(findindexes(arr,sum)); 
    }
    static  List<List<Integer>> findindexes(int [] arr,int sum){
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(arr);

        for(int i = 0;i<arr.length-2;i++){
            // i +  j + k = sum
            //targetsum = sum - i;
            int low = i+1;
            int high = arr.length-1;
            int targetsum = sum - arr[i];
            while(low <= high){
                if(arr[low] + arr[high] == targetsum){
                    lst.add(Arrays.asList(arr[low],arr[high],arr[i]));
                    low++;
                    high--;
                }
                else if(arr[low] + arr[high] < targetsum){
                     low++;
                }else if(arr[low] + arr[high] > targetsum){
                    high--;
                }
            }
            
        } 
        return lst;  
    }
    
}
