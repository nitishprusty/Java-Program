package Java.Collection_Generics_StreamAPI.MemberManipulation;

public class member {

    private int memberid;
    private String memberName;
    private String memberAddress;

    public member(){

    }
    
    public member(int id,String memberName,String memberAddress){
        this.memberid = id;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
    }

    public int getMemberid() {
        return memberid;
    }
    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getMemberAddress() {
        return memberAddress;
    }
    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }
    
}
