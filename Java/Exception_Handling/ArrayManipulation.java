package Java.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayManipulation {
    static int [] arr;
    public static void main(String[] args) {
        ArrayManipulation obj = new ArrayManipulation();
        String str = obj.getElement();
        System.out.println(str);
    }
    String getElement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements into array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index you want to fetch");
        int index = sc.nextInt();
        
        sc.close();
        try{
            return "The element at " + index + " is " + arr[index];
        }catch (ArrayIndexOutOfBoundsException e){
            return "Array index was out of range";
        }catch (InputMismatchException e){
            return "Input mismatched try to enter an integer";
        }
    }
}
