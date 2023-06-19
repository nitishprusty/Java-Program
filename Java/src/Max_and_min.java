import java.util.Scanner;
public class Max_and_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter elements into array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();    //78 5 15 23 6 45
        }
        sc.close();
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            }
            if(arr[i] > secondmax && arr[i] < max){
                secondmax = arr[i];
            }
            if(arr[i] < min){
                secondmin = min;
                min = arr[i];
            }
            if(arr[i] < secondmin && arr[i] > min){
                secondmin = arr[i];
            }
        }
        System.out.println("The max in array is " + max);   //78
        System.out.println("The secondmax in array is " + secondmax);  //45
        System.out.println("The min in array is " + min); //5
        System.out.println("The secondmin in array is " + secondmin);  //6
    }
}
