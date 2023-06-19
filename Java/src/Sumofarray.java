import java.util.Scanner;
public class Sumofarray {
    public static void main(String[] args) {
        //write a java prog to print the sum of elements using recursion
        //input - [10,5,6,77,9];
        //output - 10+5+6+77+9 = 107
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements into array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        int start = 0;
        int end = arr.length-1;
        System.out.println("The sum of elements is");
        printsum(arr, start, end, sum);
    }
    static void printsum(int [] arr,int start,int end,int sum){
        if(end <= start){  //base case
            sum += arr[start];
            System.out.println(sum);
            return;
        }
        sum += arr[start];
        printsum(arr, start + 1, end, sum);
    }
}
