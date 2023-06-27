package Java.Exception_Handling.Calculator;

public class calculator {
    
    public int number1;
    public int number2;
    private char operation;

    public calculator(){

    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public int calculation(){
        int result = 0;
        try{
            switch(operation) { 
                case  '+' :
                    result = number1 + number2;
                    break;
                case '-':
                    result = Math.abs(number1 - number2);
                    break;
                case 'x' :
                    result = number1*number2;
                    break;
                case '/':
                    result = number1/number2;
                    break;
                default:
                    result = 0;
            }
            
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            return -1;
        }finally{
            number1 = 0;
            number2 = 0;
        }
        return result;
    }


}
