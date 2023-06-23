package Java.ClassesObjectsPackages.Student;

public class student {

    private int studentid;
    private String studentName;
    private String Address;
    private String collegename;

    // making a constructor for student class with a default collegeName NIT
    public student(int sid, String sname, String Address) {
        super();
        this.studentid = sid;
        this.studentName = sname;
        this.Address = Address;
        this.collegename = "NIT";
    }

    public student(int sid, String sname, String Address, String collegename) {
        this(sid, sname, Address);
        this.collegename = collegename;
    }

    public student() {

    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

}
