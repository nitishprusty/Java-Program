package Java.ClassesObjectsPackages.EmployeeRating;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id");
        int eid = sc.nextInt();
        System.out.println("Enter employee salary");
        int salary = sc.nextInt();

        System.out.println("Enter total certification");
        int tot = sc.nextInt();
        String [] certification = new String[tot];
        if(tot > 0){
            System.out.println("Enter certication names");
            for(int i = 0;i<certification.length;i++){
                certification[i] = sc.next();
            }
        }

        Employee obj = new Employee(eid, salary, certification);

        sc.close();
        System.out.println("Your Rating is " + obj.getrating());
        System.out.println("Increment amount is " + String.format("%.2f",obj.calculateIncrement()));
        System.out.println("Your salary is " + String.format("%.2f",obj.getSalary()));


    }
    
}
