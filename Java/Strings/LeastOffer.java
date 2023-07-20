package Java.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeastOffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total offers on products");
        int tot = sc.nextInt();
        int mindis = Integer.MAX_VALUE;

        List<String> al = new ArrayList<>();
        for(int i = 0;i<tot;i++) {
            String input = sc.next();
            String [] arr = input.split("[,]");
            int discount = (Integer.parseInt(arr[2]) * Integer.parseInt(arr[1]))/100;
            if(discount < mindis) {
                mindis = discount;
                al.add(arr[0]);
            }else if(discount == mindis){
                al.add(arr[0]);
            }
        }
        for(String str : al) {
            System.out.print(str + " ");
        }
        System.out.println();
        sc.close();
    }
}
