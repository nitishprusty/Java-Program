package Java.Strings;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five words per line and Total Number of lines is 5");
        char [] vowels = {'A','E','I','O','U'};
        int [][] vowelscount = new int[5][5];
        int [] score = new int[5];
        for(int i = 0;i<5;i++) {
            String [] input = sc.nextLine().split(" ");
            for(int j = 0;j<5;j++) {
                int count = 0;
                for(char vowel : vowels) {
                    for(char ch : input[j].toUpperCase().toCharArray()) {
                        if(ch == vowel){
                            count++;
                        }
                    }
                }
                vowelscount[i][j] = count;
                score[i] += Calculate(count);
            }
        }
        print(vowelscount);
        int maxScore = 0;
        String winner = "";
        for(int i = 0;i<5;i++) {
            if(score[i] > maxScore) {
                maxScore = score[i];
                winner = "Winner is Student " + (i + 1) + " with score " + maxScore;
            }else if(score[i] == maxScore) {
                winner += "Winner is Student " + (i + 1);
            }
        }
        if(maxScore > 0) {
            System.out.println(winner);
        }else{
            System.out.println("No one wins");
        }
        sc.close();
        
    }
    static int Calculate(int count) {
        if(count <= 1) {
            return 0;
        }else if(count == 2 ) {
            return 1;
        }else if(count == 3) {
            return 3;
        }else if(count == 4) {
            return 4;
        }else if(count == 5 ) {
            return 6;
        }
        return 8;
    }
    static void print(int [][] vowelscount) {
        for(int i = 0;i<5;i++) {
            for(int j = 0;j<5;j++) {
                System.out.print(vowelscount[i][j] + " ");
            }
            System.out.println();
        }
    }
}
