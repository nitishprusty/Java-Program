import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        String newstr = "";
        for(int i = str.length()-1;i>=0;i--){
            newstr += str.charAt(i);
        }

        if(newstr.equals(str)){
            System.out.println("The entered String is palindrome");
        }else{
            System.out.println("The entered string is not palindrome");
        }
    }
}
