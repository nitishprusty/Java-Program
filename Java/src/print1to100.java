public class print1to100 {
    static void printNum(int num){
        if(num <= 100){
            System.out.print(num + " ");
            
            printNum(num + 1);
        }
        
    }
    public static void main(String [] args){
        //print 1 to 100 without using loops
        printNum(1);
    }
}
