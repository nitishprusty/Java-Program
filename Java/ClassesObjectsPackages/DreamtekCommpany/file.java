package Java.ClassesObjectsPackages.DreamtekCommpany;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cadidate id");
        int candiadteid = sc.nextInt();
        System.out.println("Enter the candidate name");
        String candidateName = sc.next();
        System.out.println("Enter the Number of days");
        int days = sc.nextInt();

        details obj = new details(candiadteid, candidateName);

        obj.trackCandidatestatus(days);

        System.out.println("Candidate Name :- " + obj.getEmployeeName());
        System.out.println("Candidate Id :- "  + obj.getCandidateid());
        System.out.println("Candidate workstatus :- " + obj.getWorkstatus());

        sc.close();
    }
}
