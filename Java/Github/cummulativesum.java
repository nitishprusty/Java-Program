package Java.Github;

public class cummulativesum {
    public static void main(String[] args) {
        int [] arr = {78,56,4,89,61};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
