package Java.Github;

import java.util.Scanner;

public class SearchaCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the course");
        int course_size = sc.nextInt();
        if(course_size < 0){
            System.out.println("Invalid size");
        }else{
            String [] courses = new String[course_size];
            for(int i = 0;i<course_size;i++){
                System.out.println("Enter " +  (i + 1) + " course");
                courses[i] = sc.next();
            }
            System.out.println("Enter the course to be searched");
            String course_to_serach = sc.next();
            int flag = 0;
            for(int i = 0;i<course_size;i++){
                if(courses[i].equals(course_to_serach)){
                    flag++;
                    break;
                }
            }
            if(flag != 0){
                System.out.println(course_to_serach + " is available");
            }else{
                System.out.println(course_to_serach + " is not available");
            }
        }
        sc.close();
    }
}
