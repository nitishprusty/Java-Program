public class minelement {
    public static void main(String[] args) {
        int [] arr = {78,45,3,5,65,1,12};
        int res = findmin(arr);
        System.out.println(res);
    }
    static int findmin(int [] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
