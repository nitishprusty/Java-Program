import java.util.Scanner;
import java.util.Stack;
public class Reverseastring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");  //Nitish
        String inputstr = sc.next();
        sc.close();
       /*  char [] chrarray = inputstr.toCharArray(); //['N','i','t','i','s','h']
        int low = 0;
        int high = chrarray.length - 1;
        char temp;
        while(low <= high){    //This will reverse the chararrray
            temp = chrarray[low];
            chrarray[low] = chrarray[high];
            chrarray[high] = temp;
            low++;
            high--;
        }
        //['h','s','i','t','i','N']

        String reversedstr = toString(chrarray); //the char array will be converted into string hsitiN 
        System.out.println("The reversed string is " + reversedstr); //This will print hsitiN*/


        //Reverse str using Stack
        Stack<Character> s = new Stack<>();
        for(int i = 0;i<inputstr.length();i++){
            s.push(inputstr.charAt(i));
        }

        while(!s.empty()){
            System.out.print(s.pop());
        }

    }
    // public static String toString(char [] arr){
    //     String str = new String(arr);
    //     return str;
    // }
}