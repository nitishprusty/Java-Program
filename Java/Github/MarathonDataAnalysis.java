package Java.Github;

import java.text.DecimalFormat;

/*
 * This is a 2D Array Program which displays the Analystics of Marathon Race
 * There are total of 4 participant
 * This Marthon occur for 1 week = 7Days
 * This program will display the Total distance covered by each player at the end of the week
 * and The distance covered by all players in each day
 */

import java.util.Scanner;

public class MarathonDataAnalysis {
    static double [][] arr2d = new double[4][7];
    static String [] names = {"John","Bob","Michael","Raechal"};
    static double [] totaldistance = new double[4];  
    static double [] avg = new double[7];
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in);)
       {
        for(int i = 0;i<4;i++){
            for(int j = 0;j<7;j++){
                arr2d[i][j] = sc.nextInt();
                totaldistance[i] += arr2d[i][j];
                avg[j] += arr2d[i][j];
            }
        }
       }
    }
    void totaldistance(){
        for(int i = 0;i<4;i++){
            System.out.println(names[i] + " - " + formatdecimal(totaldistance[i]) + " kms ");
        }
    }
    void displayavg(){

        for(int i = 0;i<7;i++){
            System.out.println("Day " + (i + 1) + formatdecimal(avg[i] / 4) + " kms");
        }
        
    }
    String formatdecimal(double val){
        return new DecimalFormat("0.00").format(val);
    }
}