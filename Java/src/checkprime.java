import java.util.Scanner;
public class checkprime {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        sc.close();
        boolean flag = true;
        //Handling special cases
        if(num == 1){
            flag = false;
        }
        for(int i = 2;i<num;i++){
            if(num % i == 0){
                flag = false;
            }
        }

        if(flag){
            System.out.println(num + " is a prime Number");
        }else{
            System.out.println(num + " is not a prime Number");
        }

    }
}
