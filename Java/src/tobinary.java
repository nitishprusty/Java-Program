import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tobinary {
    public static void main(String[] args)throws IOException {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a Number");
            int num = Integer.parseInt(br.readLine());
            int [] arr = new int[20];
            int count = 0;
            while(num > 0){
                arr[count++] = num%2;
                num /= 2;
            }
            reverse(arr);
            printarr(arr);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    static void reverse(int [] arr){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    static void printarr(int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
