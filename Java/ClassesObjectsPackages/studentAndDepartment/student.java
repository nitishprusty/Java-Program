package Java.ClassesObjectsPackages.studentAndDepartment;

public class student {

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    private int studentid;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private String studentName;
    private Department department;

    public Department getDepartment(){
        System.out.println("Department id : " + department.getDispartmentid());  
        System.out.println("Department Name : " + department.getDepartmentName());


        return department;
    }

    public void setDepartment(Department d){
        this.department = d;
    }


}
