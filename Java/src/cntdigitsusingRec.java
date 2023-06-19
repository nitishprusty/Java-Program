import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cntdigitsusingRec{
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //This is program to count number of digits using recursion
        //1234
        //count - 4
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a Number");
            int num = Integer.parseInt(br.readLine());
            int ans = cntDigit(num);
            System.out.println(ans);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * @param num
     * @return
     */
    static int cntDigit(int num){
        if(num == 0){
             return 0;
        }
        if(num == 1){
             return 1;
        }
        return 1 + cntDigit(num/10);
    }
}
