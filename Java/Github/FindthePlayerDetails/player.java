package Java.Github.FindthePlayerDetails;

public class player {
    private int playerid;
    private String playerName;
    private long phoneNumber;
    private int age;

    

    //getters and setters
    public void setid(int id){
        this.playerid = id;
    }
    public int getid(){
        return playerid;
    }


    public void setName(String Name){
        this.playerName = Name;
    }
    public String getName(){
        return playerName;
    }

    public void setphone(long Num){
        this.phoneNumber = Num;
    }
    public long getPhone(){
        return phoneNumber;
    }

    public void setage(int age){
        this.age = age;
    }

    public int getage(){
        return age;
    }

    public player(int id,String Name,long phone,int age){
        super();
        this.playerid = id;
        this.playerName = Name;
        this.phoneNumber = phone;
        this.age = age;
    }
}
