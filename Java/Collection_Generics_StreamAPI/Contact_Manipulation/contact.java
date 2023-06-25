package Java.Collection_Generics_StreamAPI.Contact_Manipulation;

public class contact {
    
    private String Name;
    private long ConNumber;
    private String email;

    public contact(){

    }
    public contact(String Name,long ConNumber,String email){
        super();
        this.Name = Name;
        this.ConNumber = ConNumber;
        this.email = email;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public long getConNumber() {
        return ConNumber;
    }
    public void setConNumber(long conNumber) {
        ConNumber = conNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
