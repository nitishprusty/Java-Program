public class Buyandsellstock {
    /*
     * Best Time to buy and sell sock
     * Given an array arr = {7,1,5,8,9,6}
     * max profit can be made is 8
     * if we buy stock on day 1 that is arr[1] = 1
     * and sell it on day 4 that is arr[4] = 9
     * 9 - 1 = 8
     * Output = 8
     * this is nothing but getting the max difference between two elements in array 
     */
    public static void main(String[] args) {
        int [] arr = {7,1,5,8,9,6};
        int res = maxprofit(arr);
        System.out.println(res);
    }
    static int maxprofit(int [] arr){
        int min = arr[0];  //7
        int maxdiff = arr[1] - arr[0]; //-6
        for(int i = 1;i<arr.length;i++){
            if((arr[i] - min) > maxdiff){
                maxdiff = arr[i] - min;
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return maxdiff;
    }
}
