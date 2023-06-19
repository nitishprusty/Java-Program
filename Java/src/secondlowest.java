public class secondlowest {
    public static void main(String[] args) {
        int [] arr = {12,78,6523,45,85};
        //The min in array is 1
        //The secondmin in array is 2

        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] < min){  
                secondmin = min; //second min - 2145789
                min = arr[i]; //min - 12
            }

            if(arr[i] < secondmin && arr[i] > min){
                secondmin = arr[i]; //second min - 78
            }

        }
        System.out.println("the min in arrray is " + min);
        System.out.println("The second min in array is " + secondmin);
    }
}
