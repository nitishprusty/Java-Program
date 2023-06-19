import java.util.Scanner;
public class seconddhighest {
    public static void main(String [] args){

        //int arr = {10,12,78,4,5}
        //The max in array is 78
        //The second max in array is 12
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n  = sc.nextInt();
        int [] arr = new int[n];

        //This loop is for user input so lets not include this for time complexity
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            }
            if(arr[i]> secondmax && arr[i] < max){
                secondmax = arr[i];
            }
        }

        //Time Complexity - O(n)

        System.out.println("The maximum in array is " + max);
        System.out.println("The second maximum in array is " + secondmax);

    }
}
