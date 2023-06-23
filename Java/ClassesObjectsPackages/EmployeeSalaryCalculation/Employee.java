package Java.ClassesObjectsPackages.EmployeeSalaryCalculation;

public class Employee {
    
    private int employeeid;
    private String employeeName;
    private double salary;
    private double netsalary;
    

    public Employee(int empid,String empName,double salary){

        super();
        this.employeeid = empid;
        this.employeeName = empName;
        this.salary = salary;
        
    }

    public int getEmployeeid() {
        return employeeid;
    }
    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getNetsalary() {
        return netsalary;
    }
    public void setNetsalary(double netsalary) {
        this.netsalary = netsalary;
    }

    public void calculateNetsalary(int pfpercentage){

        double pfamount;
        pfamount = salary * pfpercentage/100;
        setNetsalary(salary - pfamount);

    }

}
