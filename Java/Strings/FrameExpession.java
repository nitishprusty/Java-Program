package Java.Strings;

import java.util.Scanner;

public class FrameExpession {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression");
        String expression = sc.nextLine();
        String [] arr = expression.split("[-+*/=%^?<>_()!@#]");
        int a  = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int result = Integer.parseInt(arr[2]);
        char operator = '%';
        for(int i = 0;i<expression.length();i++) {
            char c = expression.charAt(i);
            if(c == '+' || c == '-' || c == '*' || c == '/' ){
                operator = c;
                break;
            }
        }
        boolean isValid = false;
        switch(operator) {
            case '+' :
            if(a + b == result) {
                isValid = true;
                
            }else{
                isValid = false;
            }
            break;
            case '-' :
            if(a - b == result) {
                isValid = true;
                
            }else{
                isValid = false;
            }
            break;
            case '*' :
            if(a * b == result){
                isValid = true;
                
            }else{
                isValid = false;
            }
            break;
            case '/':
            if(a /b == result) {
                isValid = true;
               
            }
            else{
                isValid = false;
            }
             break;
            default:
            isValid = true;
            break;
        }
        if(isValid) {
            System.out.println(a + " " + operator + " " +b + " = " + result);
        }else{
            System.out.println("Invalid");
        }
        sc.close();
    }
}
