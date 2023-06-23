package Java.ClassesObjectsPackages.TicketPriceCalculation;

public class Ticket {
    public int getTicketid() {
        return ticketid;
    }
    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }
    private int ticketid;
    public int getPrice() {
        return price;
    }
    public void setPrice(int totalcost) {
        this.price = totalcost;
    }
    private int price;
    public int getAvailabletickets() {
        return availabletickets;
    }
    public void setAvailabletickets(int availabletickets) {
        this.availabletickets = availabletickets;
    }
    private int availabletickets;


    public int totalfarecost(int no_of_tickets){
        if(availabletickets > no_of_tickets){
            availabletickets = availabletickets - no_of_tickets;
            return no_of_tickets*price;
        }
        return -1;
    }





}
