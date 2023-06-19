package Java.Github.FileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        try{

            File myFile = new File("demo.docx");
        
        if(myFile.delete()){
            System.out.println("Successfully deleted " + myFile.getName());
        }else{
            System.out.println("Some error occurred!");
        }

        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
