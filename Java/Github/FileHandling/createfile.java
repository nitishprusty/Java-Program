package Java.Github.FileHandling;

import java.io.File;
import java.io.IOException;

public class createfile {
    /*
     * Java program to create a file
     */
    public static void main(String[] args) {
        try{
            
            File obj = new File("demo.docx");
            obj.createNewFile();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
