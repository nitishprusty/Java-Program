package Java.Github;

import java.util.Arrays;
import java.util.Scanner;

public class CountryWisePopulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int [] population = new int[size];
        String [] country = new String[size];

        System.out.println("Enter the country Names");
        for(int i = 0;i<size;i++){
            country[i] = sc.next();
        }

        System.out.println("Enter the population");
        for(int i = 0;i<size;i++){
            population[i] = sc.nextInt();
        }

        sc.close();

        int [] temp = Arrays.copyOf(population, size);
        //sort the population
        Arrays.sort(population);

        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                if(population[i] == temp[j]){
                    System.out.println(country[j]);
                }
            }
        }

        for(Integer i : population){
            System.out.print(i + " ");
        }
        System.out.println();
    }
 }
