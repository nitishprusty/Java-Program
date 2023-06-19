
public class Intersection {
    public static void main(String[] args) {
        
        int [] arr1 = {12,13,15,46,89};
        int [] arr2 = {10,12,15,23,56};

        //expected output = 12,15

        int k = 0;
        int l = 0;
        while(k < arr1.length && l < arr2.length){
            if(arr1[k] == arr2[l]){
                System.out.println(arr1[k]);
                k++;
                l++;
            }else if(arr1[k] > arr2[l]){
                l++;
            }else{
                k++;
            }
        }
    }
}
