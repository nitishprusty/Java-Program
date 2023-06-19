import java.util.Scanner;
public class Countwords {
    public static void main(String[] args) {
        //input - "Java programming questions"
        //output - 24
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = sc.nextLine();
    sc.close();

    int wordcount = 0;
    for(int i = 0;i<str.length();i++){
        if(str.charAt(i) != ' '){
            wordcount++;
        }
    }

    System.out.println("The Number of words in string is " + wordcount);

    }
}
