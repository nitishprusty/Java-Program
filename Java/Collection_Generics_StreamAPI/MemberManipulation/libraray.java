package Java.Collection_Generics_StreamAPI.MemberManipulation;

import java.util.ArrayList;

public class libraray {
    ArrayList<member> memberlist = new ArrayList<>();

    public void setmemberlist(ArrayList<member> m){
        this.memberlist = m;
    }

    public ArrayList<member> getmemberlist(){
        return memberlist;
    }

    public void addMembers(member obj){
        memberlist.add(obj);
    }
    public ArrayList<member> viewallmember(){
        return memberlist;
    }
    public boolean isempty(){
        boolean flag = false;
        if(memberlist.isEmpty()) {
            flag = true;
        }
        return flag;
    }

    public ArrayList<member> viewByAdress(String address){
        ArrayList<member> al = new ArrayList<>();
        for(int i = 0;i<al.size();i++){
            if(al.get(i).getMemberAddress().equalsIgnoreCase(address)) {
                al.add(al.get(i));
            }
        }
        return al;
    }
}
