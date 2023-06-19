import java.util.Scanner;

public class Moveallchr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        sc.close();
        String charwitha = "";
        String charwithouta = "";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) != 'a'){
                charwithouta += str.charAt(i);
            }else{
                charwitha += str.charAt(i);
            }
        }
        String newstr = charwithouta + charwitha;
        System.out.println(newstr);
    }
}