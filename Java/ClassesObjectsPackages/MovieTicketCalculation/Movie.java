package Java.ClassesObjectsPackages.MovieTicketCalculation;

public class Movie {
    private String MovieName;
    private String MovieCategory;
    private int ticketcost;

    public Movie() {

    }

    public Movie(String MovieName, String movieCategory) {
        super();
        this.MovieName = MovieName;
        this.MovieCategory = movieCategory;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getMovieCategory() {
        return MovieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        MovieCategory = movieCategory;
    }

    public int getTicketcost() {
        return ticketcost;
    }

    public void setTicketcost(int ticketcost) {
        this.ticketcost = ticketcost;
    }

    public void CalculateMovieTicket(String circle) {
        
        int price  = 0;
        if ((!circle.equalsIgnoreCase("GOLD")) || (!circle.equalsIgnoreCase("SILVER"))) {
            price = -1; // For invalid circle input
        }
        if ((!this.MovieCategory.equalsIgnoreCase("2D") || (!this.MovieCategory.equalsIgnoreCase("3D")))) {
            price = -3; // For invalid Moview catergory input
        } 

        if (circle.equalsIgnoreCase("GOLD")) {
                price = (this.MovieCategory.equalsIgnoreCase("3D")) ? 500 : 300;
             
            }

        if (circle.equalsIgnoreCase("SILVER")) {
                price = (this.MovieCategory.equalsIgnoreCase("3D")) ? 400 : 250;
                
        }

        setTicketcost(price);

    }

};