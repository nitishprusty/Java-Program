import java.util.Scanner;

public class Moveallzeroes {
    public static void main(String[] args) {
        //arr = {18,5,0,65,45,0,10,3}
        //output = {18,5,65,45,10,3,0,0};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int [] temp = new int[arr.length];
        int [] digitarr = new int[arr.length];

        int [] finalarr = new int[arr.length];

        int zerocount = 0;
        int nonzerocount = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                temp[zerocount] = arr[i];
                zerocount++;
            }else{
                digitarr[nonzerocount] = arr[i];
                 nonzerocount++;
            }
        }

        System.arraycopy(digitarr, 0, finalarr, 0, nonzerocount);
        System.arraycopy(temp,0,finalarr,nonzerocount,zerocount);
        printArr(finalarr);
    }
    static void printArr(int [] arr){
        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
