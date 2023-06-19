package Java.Github.AvgGrade;

import java.util.Scanner;

public class Studentsmain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Student Id");
        int id = sc.nextInt();

        System.out.println("Enter Student Name");
        String Name = sc.next();

        System.out.println("Enter total Subjects");
        int sub = sc.nextInt();
        int [] marks = new int[sub];

        for(int i = 0;i<sub;i++){
            System.out.println("Enter marks of sub " + (i + 1));
            marks[i] = sc.nextInt();
        }

        sc.close();

        //make a instance of student class
        Students obj = new Students();
        obj.setId(id);
        obj.setName(Name);
        obj.setMarks(marks);
        obj.findAverage();
        obj.findgrade();

        System.out.println("The id of student is " + obj.getId());
        System.out.println("The Name of student is " + obj.getName());
        System.out.println("The marks of student is " + obj.getMarks());
        System.out.println("The average of student is " + obj.getAverage());
        System.out.println("The grade of student is " + obj.getGrade());  
    }

}
