package Java.ClassesObjectsPackages.EmployeeSalaryCalculation;

import java.util.Scanner;

public class file {
     static Employee getemployeeDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id");
        int empid = sc.nextInt();
        System.out.println("Enter employee Name");
        String empName = sc.nextLine();
        System.out.println("Enter employee salary");
        int empSalary = sc.nextInt();

        sc.close();

        return new Employee(empid, empName, empSalary);
        
     }
     static int getpfpercentage(){

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter pfpercentage");
        int pfpercentage = sc1.nextInt();
        sc1.close();
        return pfpercentage;

     }

     public static void main(String[] args) {
        Employee obj = getemployeeDetails();
        obj.calculateNetsalary(getpfpercentage());

        System.out.println("Emp Name - " + obj.getEmployeeName());
        System.out.println("Emp Id - " + obj.getEmployeeid());
        System.out.println("Emp salary - " + obj.getSalary());
        System.out.println("Emp netSalary - " + obj.getNetsalary());
     }
}
