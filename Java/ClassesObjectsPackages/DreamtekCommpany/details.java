package Java.ClassesObjectsPackages.DreamtekCommpany;

public class details {

    private int candidateid;
    private String employeeName;
    private String workstatus;

    
    public details(int cid,String Ename){
        super();
        this.candidateid = cid;
        this.employeeName = Ename;
    }


    public int getCandidateid() {
        return candidateid;
    }
    public void setCandidateid(int candidateid) {
        this.candidateid = candidateid;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getWorkstatus() {
        return workstatus;
    }
    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
    }

    public void trackCandidatestatus(int days){
        if(days >= 1 && days <= 20){
            setWorkstatus("Training Modules");
        }else if(days >= 21 && days <= 40){
            setWorkstatus("Advanced Modules");
        }else if(days >= 41 && days <= 60){
            setWorkstatus("Project Phase");
        }else{
            setWorkstatus("Deployed in project");
        }
    }
    
}
