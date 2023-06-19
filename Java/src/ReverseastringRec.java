import java.util.Scanner;
public class ReverseastringRec {
     public static void main(String[] args) {
        //write a java prog to reverse a string using recursion
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        sc.close();
        int start = 0;
        int last = str.length()-1;
        recursion(str, start, last, "");
     }
     static void recursion(String str,int first,int last,String rev){
        if(first>=last){
            rev += str.charAt(last);
            System.out.println(rev);
            return;
        }
        rev += str.charAt(last);
        recursion(str, first, last - 1, rev);
     } 
}
