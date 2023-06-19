import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class addMatrices {
    public static void main(String[] args) throws IOException{
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the rows");
            int rows = Integer.parseInt(br.readLine());
            System.out.println("Enter the cols");
            int cols = Integer.parseInt(br.readLine());

            //declare 2D array
            int [][] matrix1 = new int[rows][cols];
            //System.out.println("Enter elements into 2d array");
            System.out.println("Enter the value for matrix1");
            for(int i = 0;i<rows;i++){
                for(int j = 0;j<cols;j++){
                    matrix1[i][j] = Integer.parseInt(br.readLine());
                }
            }

            System.out.println("Enter the elements for matrix2");
            int [][] matrix2 = new int[rows][cols];
            for(int i = 0;i<rows;i++){
                for(int j = 0;j<cols;j++){
                    matrix2[i][j] = Integer.parseInt(br.readLine());
                }
            }

            int [][] result = new int[rows][cols];
            for(int i = 0;i<rows;i++){
                for(int j = 0;j<cols;j++){
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            //printing the result
            System.out.println("The result of matrix1 and matrix2 is");
            for(int i = 0;i<rows;i++){
                for(int j = 0;j<cols;j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }



        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
