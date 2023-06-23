package Java.ClassesObjectsPackages.TravelDetails;

public class Bus {

    private int ticketno;
    private float ticketprice;
    private float ticketAmount;
    private Person person;

    public int getTicketno() {
        return ticketno;
    }
    public void setTicketno(int ticketno) {
        this.ticketno = ticketno;
    }
    public float getTicketprice() {
        return ticketprice;
    }
    public void setTicketprice(float ticketprice) {
        this.ticketprice = ticketprice;
    }
    public float getTicketAmount() {
        return ticketAmount;
    }
    public void setTicketAmount(float ticketAmount) {
        this.ticketAmount = ticketAmount;
    }
    public Person getPerson() {
        System.out.println("Person Name " + person.getName());
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public void calculateTotal(){
        int age = person.getAge();
        char gender = person.getGender();
        float amount = 0;

        if(age < 16){

            amount = (ticketprice * 50)/100;
            ticketAmount = ticketprice - amount;

        }else if(age >= 60){

            amount = (ticketprice * 25)/100;
            ticketAmount = ticketprice - amount;


        }
        else if(age >= 16 && age <= 60){

            if(gender == 'f' || gender == 'F'){
                amount  = (ticketprice * 10)/100;
                ticketAmount = ticketprice - amount;
            }else{
                ticketAmount = ticketprice;
            }

        }else{

            ticketAmount = ticketprice;

        }

        setTicketAmount(ticketAmount);

    }
    
}
