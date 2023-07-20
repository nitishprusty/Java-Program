package Java.Strings;

import java.util.Scanner;

public class decrytion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Entryption text");
        String text = sc.nextLine();
        System.out.println("Enter the key");
        int key = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for(char ch : text.toCharArray()){
            if(Character.isUpperCase(ch)){
                char chr = (char)('A' + (ch - 'A' + key + 26)%26);
                result.append(chr);
            }else if(Character.isLowerCase(ch)) {
                char chr = (char)('a' + (ch - 'a' + key + 26) % 26);
                result.append(chr);
            }else{
                result.append(ch);
            }
        }
        System.out.println(result);
        sc.close();
        
    }
}
