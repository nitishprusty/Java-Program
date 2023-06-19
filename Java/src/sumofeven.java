public class sumofeven {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 100;
        int sum = 0;
        int sumodd = 0;
        while(num1 <= num2){
            if(num1 % 2 == 0){
                sum += num1;
            }else{
                sumodd += num1;
            }
            num1++;
        }
        System.out.println("The sum of even numbers between 1 to 100 is " + sum);
        System.out.println("The sum of odd numbers between 1 to 100 is " + sumodd);
    }
}
