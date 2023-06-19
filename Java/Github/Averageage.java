package Java.Github;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Averageage {
    /*
     * Java program to find the average age employees
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.println("Enter the total no of Employees");

        int Tot_emp = sc.nextInt();

        int[] employees = new int[Tot_emp];

        System.out.println("Enter age for " + Tot_emp + " employees");

        for (int i = 0; i < Tot_emp; i++) {
            int temp = sc.nextInt();

            if (temp >= 28 && temp <= 41) {
                employees[i] = temp;
            } else {
                System.out.println("Inavlid age encountered");
                flag++;
                break;
            }
        }

        sc.close();

        if (flag == 0) {
            DecimalFormat obj = new DecimalFormat("####.00");
            System.out.println("The Average age group of employees is " + obj.format(calAverage(employees)));
        }

    }

    static double calAverage(int[] per) {
        int sum = 0;
        int n = per.length;
        for (int i = 0; i < n; i++) {
            sum += per[i];
        }

        double average = (double) (sum / n);
        return average;

    }
}
