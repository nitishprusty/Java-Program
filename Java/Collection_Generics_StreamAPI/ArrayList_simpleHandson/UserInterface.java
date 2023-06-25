package Java.Collection_Generics_StreamAPI.ArrayList_simpleHandson;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * This is a simple java program to add an array of type strings into an arraylist and then print it
 */

public class UserInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size= sc.nextInt();

        String [] str = new String[size];

        for(int i = 0;i<size;i++) {
            str[i] = sc.next();
        }

        sc.close();
        ArrayList<String> fruit = new ArrayList<>();

        for(String s : str){
            fruit.add(s);
        }

        System.out.println(fruit);

        for(int i = 0;i<size;i++){
             System.out.println(fruit.get(i));
        }
        
    }
}
