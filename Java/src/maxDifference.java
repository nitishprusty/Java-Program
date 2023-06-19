public class maxDifference {
    /*
     * Find the maximum difference between two array elements
     *  input - {2,5,15,6,4}
     *  output - 13 => 15 - 2
     */
    public static void main(String[] args) {
        int [] arr = {7,9,5,6,13,2};

        /* 
        1.Brute Force approach
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++) {
            int current = arr[i];
            for(int j = i + 1;j<arr.length;j++) {
                if((arr[j] - current) > max){
                    max = arr[j] - current;
                }
            }
        }
        System.out.println("The max different between two array elements is " + max);
        TimeComplexity - O(n^2)
        */

        int res = printVal(arr);
        System.out.println(res);

    }
    static int printVal(int [] arr){
        //let us assume the max diff is arr[1] - arr[0]
        int maxDiff = arr[1] - arr[0];
        //let us assume the min element is arr[0]
        int minelement = arr[0];
        //traverse through array
        for(int i = 1;i<arr.length;i++){
            //check whether the currentelement - minelement is greater than default maxdiff
            if((arr[i] - minelement) > maxDiff){
                //if true then initialize maxdiff as currentelement - minelement
                maxDiff = arr[i] - minelement;
            }
            //check whether current element is less than minelement if true then initialize minelement as currentelement
            if(arr[i] < minelement){
                minelement = arr[i];
            }
        }
        return maxDiff;
        /*Time Complexity - O(n) */
    }
}
