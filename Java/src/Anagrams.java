import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "car";
        String str2 = "arc";

        char [] arr1 = str1.toCharArray();
        char [] arr2  = str2.toCharArray();
        Arrays.sort(arr1, 0, arr1.length);
        Arrays.sort(arr2, 0, arr2.length);

        int c1 = 0;
        int c2 = 0;
        boolean flag = false;

        while(c1 < arr1.length && c2 < arr2.length){
            if(arr1[c1] == arr2[c2]){
                flag = true;
            }
            c1++;
            c2++;
        }
        if(flag){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
