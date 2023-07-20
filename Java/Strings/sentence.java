package Java.Strings;

/*
 * Input - Hey How are you?
 * Output - hEY hOW aRE yOU?
 */
import java.util.Scanner;

public class sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        sc.close();
        String Output = "";
        String [] arr = sentence.split(" ");
        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr[i].length();j++) {
                if(j == 0 && Character.isAlphabetic(arr[i].charAt(j))) {
                    if(Character.isUpperCase(arr[i].charAt(j))) {
                        Output = Output + Character.toLowerCase(arr[i].charAt(j));
                    }else{
                        Output = Output + arr[i].charAt(j);
                    }
                }else{
                    if(Character.isLowerCase(arr[i].charAt(j))) {
                        Output = Output + Character.toUpperCase(arr[i].charAt(j));
                    }else{
                        Output = Output + arr[i].charAt(j);
                    }
                }
            }
            Output = Output + " ";
        }
        System.out.println(Output);
    }
}
