import java.util.Scanner;
public class ReverseEachWord {
    public static void main(String[] args) {
        //input - "Java Prog"
        //out - "avaJ gorP"
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sen");
        String inputstr = sc.nextLine();
        sc.close();

        String [] words = inputstr.split(" "); //['Java','Prog']
        String rev = "";
        for(int i = 0;i<words.length;i++){

            String Word = words[i]; //Prog
            String revelement = "";

            for(int j = Word.length()-1;j>=0;j--){
                revelement += Word.charAt(j);  //revelemet  = gorP
            }

            rev = rev + revelement + " "; //avaJ gorP
            
        }
        System.out.println(rev);


    }
   
}
