package Java.Control_Structures_iteration;

import java.util.Scanner;

public class Bambootree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the tree");
        int feet = sc.nextInt();
        if(feet <=0 || feet > 10000) {
            System.out.println("Invalid input");
        }else{
            int i = 3;
            int count  = 0;
            while(i < feet){
                i = i*2;
                count++;
            }
            if(count == feet) {
                System.out.printf("The bamboo will take %d years to grow %feet" , count,feet);
            }else{
                System.out.println("Invalid input");
            }
            sc.close();
        }
    }
}
