package Java.ClassesObjectsPackages.VolumeCalculator;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        volume obj = new volume();
        System.out.println("Enter your choice");
        System.out.println("1.For cylinder\n2.For Cuboid");

        int choice = sc.nextInt();
        if(choice == 1){
            //cylinder
            System.out.println("Enter Height of cylinder");
            double height = sc.nextDouble();
            System.out.println("Enter Radius of cylinder");
            double radius = sc.nextDouble();

            double ans = obj.CalculateVolume(radius, height);
            System.out.println(ans);

        }else if(choice == 2){

            //cuboid
            System.out.println("Enter length");
            double length = sc.nextDouble();
            System.out.println("Enter Breadth");
            double breadth = sc.nextDouble();
            System.out.println("Enter Height");
            double height = sc.nextDouble();

            double ans = obj.CalculateVolume(length, breadth, height);
            System.out.println(ans);

        }
        sc.close();
    }
}
