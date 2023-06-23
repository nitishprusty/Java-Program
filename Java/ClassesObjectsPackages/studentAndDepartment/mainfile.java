package Java.ClassesObjectsPackages.studentAndDepartment;

import java.util.Scanner;

public class mainfile {

    static student studentdetails(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id");
        int sid = sc.nextInt();
        System.out.println("Enter student Name");
        String sname = sc.next();

        student st = new student();
        st.setStudentid(sid);
        st.setStudentName(sname);

        System.out.println("Enter Department Id");
        int did = sc.nextInt();
        System.out.println("Enter Department Name");
        String dname = sc.next();

        sc.close();

        Department d = new Department();
        d.setDepartmentName(dname);
        d.setDispartmentid(did);

        st.setDepartment(d);

        return st;


    }
    public static void main(String[] args) {
         student obj = studentdetails();
         System.out.println("Student id " + obj.getStudentid());
         System.out.println("Student Name " + obj.getStudentName());
         obj.getDepartment();
    }
    
}
