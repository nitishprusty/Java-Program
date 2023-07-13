package Java.Control_Structures_iteration;

import java.util.Scanner;

public class Count_at_cow_barn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total Number of heads");
        int heads = sc.nextInt();
        System.out.println("Enter the total Number of legs");
        int legs = sc.nextInt();

        int cow = heads;
        int men = 0;
        
        /*Multipling 4 to heads bcoz cows have 4 legs */
        if(legs > (heads*4)) {
            System.out.println("Innvalid input");
        }else if(legs == (heads*4)) {
            System.out.println("Total Number of cows " + heads);
            System.out.println("Total Number of men : 0");
        }else{
            while(cow > 0) {
                if(legs < (cow*4)) {
                    cow--;
                    legs-=2;
                    men++;
                }
                else if(legs == (cow*4)) { /*WE have found the perfect legs for cows */
                    break;
                }
            }
        }
        System.out.println("Total Number of cows " + cow);
        System.out.println("Total Number of men " + men);
        sc.close();
    }
}
