public class sortzeroonetwo {
    public static void main(String[] args) {
        int [] arr = {1,2,0,0,1,2,0,1};
        sort(arr);
        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

    }
    static int [] sort(int[] arr){
        int zercount = 0;
        int Onecount = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                zercount++;
            }
            if(arr[i] == 1){
                Onecount++;
            }
        }
        for(int i = 0;i<zercount;i++){
            arr[i] = 0;
        }
        for(int i = zercount;i<(zercount+Onecount);i++){
            arr[i] = 1;
        }
        for(int i = (zercount + Onecount);i<arr.length;i++){
            arr[i] = 2;
        }

        return arr;

    }
}
