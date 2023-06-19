package Java.Github.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {
    /*
     * Java prog to read a file
     */
    public static void main(String[] args) {
        try{

            File myFile = new File("myFile.txt");
            Scanner sc = new Scanner(myFile);

            while(sc.hasNextLine()){
                String txt = sc.nextLine();
                System.out.println(txt);
            }

            sc.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
