package Java.Collection_Generics_StreamAPI.Contact_Manipulation;

import java.util.ArrayList;
import java.util.List;

public class information {
     private List<contact> conlist = new ArrayList<>();

    public void setconlist(List<contact> obj){
        this.conlist = obj;
    }
    public List<contact> getconlist(){
        return conlist;
    }
    public void addContact(contact con) {
        conlist.add(con);
    }
    public contact getContactofspecificphoneNo(long phone){
        contact con = new contact();
        for(int i = 0;i<conlist.size();i++){
            if(conlist.get(i).getConNumber() == phone){
                con = conlist.get(i);
            }
        }
        return con;
    }

    public boolean removeContact(long phone){
        boolean flag = false;
        for(int i = 0;i<conlist.size();i++){
             if(conlist.get(i).getConNumber() == phone){
                conlist.remove(i);
                flag = true;
                break;
             }
        }
        return flag;  
    }
}
