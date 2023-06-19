import java.util.Scanner;
public class firstandlast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {6,8,8,8,8,9,10,11,11,11};

        System.out.println("Enter the target element");
        int element = sc.nextInt(); 
        sc.close(); 

        int start = -1;
        int end = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == element && start == -1){
                start = i;
            }
            if(arr[i] == element && start != -1){
                end = i;
            }
        }

        System.out.println("The starting index is " + start);
        System.out.println("The ending index is " + end);


        
        
    }
}
