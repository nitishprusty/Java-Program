public class Mergetwosorted {
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 6, 7, 12};
        int[] arr2 = { 2, 5, 8, 9, 11};

        int [] res = merge(arr1, arr2);
        for(Integer i : res){
            System.out.print(i + " ");
        }
        System.out.println();

    }
    static int [] merge(int [] arr1,int [] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int [] temp = new int[n1+n2];

        int i = 0;
        int j = 0;
        int k = 0;

        

        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                temp[k] = arr1[i];
                k++;
                i++;
            }else{
                temp[k] = arr2[j];
                k++;
                j++;
            }
        }

        while(i < n1){
            temp[k++] = arr1[i++];
        }
        while(j < n2){
            temp[k++] = arr2[j++];
        }

        return temp;
    }
}
