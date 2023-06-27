package Java.Exception_Handling.Registeracandidate;

import java.util.Scanner;

public class file {
    static candidate validate() throws invalidSalaryException { 
        candidate c = new candidate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the candidate");
        String Name = sc.next();
        c.setName(Name);
        System.out.println("Enter the gender of the candidate");
        String gender = sc.next();
        c.setGender(gender);
        System.out.println("Enter the salary of the candidate");
        int salary = sc.nextInt();
        sc.close();
        if(salary < 10000){
            throw new invalidSalaryException("Invalid salary Amount");
        }else{
            c.setSalary(salary);
        }
        return c;

    }
    public static void main(String[] args) {
        try {
            candidate obj = validate();
            System.out.println("Successfully registered for the application");
            System.out.println("Here are your Details you provided");
            System.out.println("Name - " + obj.getName());
            System.out.println("Gender - " + obj.getGender());
            System.out.println("Salary - " + obj.getSalary());
        }catch (invalidSalaryException e){
            System.out.println(e.getMessage());
        }
        

    }
}
