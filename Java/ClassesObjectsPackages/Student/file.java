package Java.ClassesObjectsPackages.Student;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id");
        int sid = sc.nextInt();
        System.out.println("Enter student Name");
        String sname = sc.next();
        System.out.println("Enter student Address");
        String Address = sc.next();
        System.out.println("Enter CollegeName");
        String collegeName = sc.next();

        sc.close();

        student obj = new student(sid, sname, Address);
        student s1 = new student(sid, sname, Address, collegeName);

        System.out.println(obj.getCollegename());
        System.out.println(s1.getCollegename());

    }
}
