public class count1inNumber {
    public static void main(String[] args) {
        int num = 13;   //1 -> cnt = 1 ->10 ->1 11 -> 2  12 -> 1 13 -> 1 Total cnt = 1+1+2+1+1 = 6
        int cnt = 0;
        for(int i = 1;i<=num;i++){
            cnt = cnt + checkOne(i);
        }
        System.out.println(cnt);
    }
    static int checkOne(int num){
        int temp = num;
        int count  = 0;
        while(temp > 0){
            temp = temp/10;
            count++;
        }
        int [] digit = new int[count];
        int z = 0;
        while(num > 0){
            digit[z] = num%10;
            z++;
            num = num/10;
        }
        int finalcount = 0;
        for(int i = 0;i<digit.length;i++){
            if(digit[i] == 1){
                finalcount++;
            }
        }

        return finalcount;

    }
}
