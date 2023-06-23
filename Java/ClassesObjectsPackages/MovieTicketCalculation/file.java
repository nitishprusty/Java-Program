package Java.ClassesObjectsPackages.MovieTicketCalculation;

import java.util.Scanner;

public class file {

    static Movie getMovieDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the MovieName");
        String movieName = sc.nextLine();
        System.out.println("Enter Movie Category");
        String movieCategory = sc.next();
        sc.close();

        return new Movie(movieName, movieCategory);
    }

    static String getCircleDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie Circle");
        String Circle = sc.next();
        sc.close();
        
        return Circle;
    }

    public static void main(String[] args) {
        Movie obj = getMovieDetails();
        String circle = getCircleDetails();
        obj.CalculateMovieTicket(circle);
        int cost = obj.getTicketcost();

        System.out.println("Movie Name is " + obj.getMovieName());
        System.out.println("Movie Category is " + obj.getMovieCategory());

        if(cost == -1){
            System.out.println("Sorry Circle is not available");
        }else if(cost == -3){
            System.out.println("You have to choose one Category");
        }else
            System.out.println("The Movie fare for " + obj.getMovieName() + " is " + cost);
        }



    }

