import java.util.Arrays;

public class findmissing {
    public static void main(String[] args) {
        int [] arr = {4,7,8,9,10,5,3,1};
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i+1] != arr[i] + 1){
                System.out.println("the missing Number is " + (arr[i] + 1));
            }
        }
    }
}
