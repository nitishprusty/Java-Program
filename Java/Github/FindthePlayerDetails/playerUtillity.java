package Java.Github.FindthePlayerDetails;

public class playerUtillity {
    public player findplayerDetails(player [] arr,int playeridtosearch){
        for(int i = 0;i<arr.length;i++){
            if(arr[i].getid() == playeridtosearch){
                return arr[i];
            }
        }
        return null;
    }    
}
