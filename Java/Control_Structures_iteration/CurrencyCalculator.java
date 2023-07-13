package Java.Control_Structures_iteration;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] countrycodes = {"CAD","HKG","USD","SGD"};
        // String [] countryName = {"Cannada","Hong Kong","USA","Singapore"};
        double [] exchangevalue = {52.08, 8.86, 51.29, 69.55};
        int flag = 0;
        System.out.println("Enter country code");
        String input = sc.next().toUpperCase();
        for(int i = 0;i<countrycodes.length;i++) {
            if(input.equals(countrycodes[i])) {
                System.out.println("Enter the amount");
                int amt = sc.nextInt();
                double ans = amt * exchangevalue[i];
                DecimalFormat df = new DecimalFormat("#######.00");
                System.out.println(df.format(ans));
                flag++;
            }
        }
        if(flag == 0) {
            System.out.println("Country code not found");
        }
        sc.close();
    }
}
