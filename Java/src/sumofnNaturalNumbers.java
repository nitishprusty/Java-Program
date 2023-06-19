public class sumofnNaturalNumbers {
    public static void main(String[] args) {
        int num = 5;
        findsum(num, 0);
    }
    static void findsum(int n,int sum){

        if(n == 0){
            sum += n;
            System.out.println(sum);
            return;
        }
        
        sum += n;
        findsum(n - 1, sum);
        
    }
}
