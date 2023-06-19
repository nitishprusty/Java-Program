package Java.Github.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    /*
     * Java prog to write something in a file
     */
    public static void main(String[] args) {
        try{

            FileWriter fileWriter = new FileWriter("myFile.txt");
            fileWriter.write("This is a demo text \n Okay now bye");
            fileWriter.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
