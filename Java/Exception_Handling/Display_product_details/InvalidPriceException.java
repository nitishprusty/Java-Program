package Java.Exception_Handling.Display_product_details;

public class InvalidPriceException extends Exception{
    
     public InvalidPriceException(String s){
        //custom exception
        super(s);
     }
}
