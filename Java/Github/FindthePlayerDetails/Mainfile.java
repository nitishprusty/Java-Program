package Java.Github.FindthePlayerDetails;

import java.util.*;

public class Mainfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        player [] obj = new player[4];
        obj[0] = new player(1, "Nitish Kumar Prusty", 7608947640l, 22);
        obj[1] = new player(2, "Sarthak Nissan Nayak", 8249856423l, 21);
        obj[2] = new player(3,"Soumya Ranjan Raj",7077108605l,21);
        obj[3] = new player(4,"Harsh",8988446526l,21);

        System.out.println("Enter the id you want to serach");;
        int playerid = sc.nextInt();

        playerUtillity pu = new playerUtillity();
        player res = pu.findplayerDetails(obj, playerid);

        if(res != null){
            System.out.println("Name of player is " + res.getName());
            System.out.println("Phone Number of player is " + res.getPhone());
            System.out.println("Age of player is " + res.getage());
        }else{
            System.out.println("Players Details Not Found");
        }
        sc.close();
    }
}
