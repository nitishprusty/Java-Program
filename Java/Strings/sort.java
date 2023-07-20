package Java.Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        sc.close();
        String [] strArr = str.split("");
        Arrays.sort(strArr,Collections.reverseOrder());
        for(int i = 0;i<strArr.length;i++) {
            if(i == 0) {
                System.out.print(strArr[i]);
            }else if(strArr[i].equals(strArr[i-1])){
                continue;
            }else{
                System.out.print(strArr[i]);
            }
        }
        System.out.println();
    }
}
