package Java.ClassesObjectsPackages.Grade;

import java.util.Scanner;

public class Studentsmain {
    public static void main(String[] args) {

        Students obj = getStudentDetails();
        obj.Average();
        obj.Grade();

        System.out.println(obj.getid());
        System.out.println(obj.getName());
        System.out.println(obj.getAvg());
        System.out.println(obj.getGrade());

    }

    static Students getStudentDetails() {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the student id ");
            int id = sc.nextInt();
            System.out.println("Enter the Name of the Student");
            String Name = sc.next();
            System.out.println("Enter Total Subjects");
            int tot = sc.nextInt();
            int[] sub = new int[tot];
            System.out.println("Enter the marks");
            for (int i = 0; i < tot; i++) {
                System.out.println("Enter marks for sub " + (i + 1) + ":");
                sub[i] = sc.nextInt();
            }
            Students st = new Students(id, Name, sub);
            return st;

        }

    }
}
