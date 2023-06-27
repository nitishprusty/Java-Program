package Java.Exception_Handling;

import java.util.Scanner;

public class DividetwoNum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter First Number");
         int n1 = sc.nextInt();
         System.out.println("Enter Second Number");
         int n2 = sc.nextInt();
         System.out.println(getres(n1, n2));  
         sc.close();
    }
    static String getres(int num1,int num2){
        String str = "";
        int res;
        try{
            res = num1/num2;
            str = "The result is " + Integer.toString(res);
        }catch(ArithmeticException e){
            str = "Division by zero is not possible";
        }finally{
            str = str.concat(". Thank you for using our application.");   
        }
        return str;
    }
}
