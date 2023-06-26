package Java.Control_structures;

import java.util.Scanner;

public class HighesPlacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the students placed in CSE Branch - ");
        int CSE = sc.nextInt();
        System.out.println("Enter the students placed in Mechanical Branch - ");
        int Mech = sc.nextInt();
        System.out.println("Enter the Students placed in Electrical Branch");
        int ECE = sc.nextInt();

        if(CSE == 0 && Mech == 0 && ECE == 0){
            System.out.println("No students got placed");
        }else if(CSE == ECE  && Mech < CSE){
            System.out.println("Both CSE and ECE got highesh placement");
        }else if(ECE == Mech && CSE < ECE){
            System.out.println("Both ECE and MECH got highest placement");
        }else if(CSE == Mech &&  ECE < CSE){
            System.out.println("Both CSE and MECH got highest placement");
        }else if(CSE > Mech && CSE > ECE){
            System.out.println("CSE Branch got highesh placement");
        }else if(Mech > CSE && Mech > ECE){
            System.out.println("Mech got Highesh placment"); //practically Not Possible haha
        }else if(ECE > CSE && ECE > Mech){
            System.out.println("ECE got highesh placement");
        }else{
            System.out.println("All three branches got same number of placements");
        }
        sc.close();
    }
}
