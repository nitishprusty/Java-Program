package Java.ClassesObjectsPackages.EmployeeRating;

public class Employee {

    private int Employeeid;
    private double salary;
    public String[] certification;
    private int rating;

    public Employee(){
        
    }

    public Employee(int eid, double salary, String[] certification) {
        super();
        this.Employeeid = eid;
        this.salary = salary;
        this.certification = certification;
    }

    public void setEmployeeid(int eid) {
        this.Employeeid = eid;
    }

    public int getEmployeeid() {
        return Employeeid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void findrating() {
        rating = 0;
        for (int i = 0; i < this.certification.length; i++) {
            if (certification[i].equals("JAVA") || certification[i].equals("ORACLE") || certification[i].equals("GCUX")
                    || certification[i].equals("CCNA") || certification[i].equals("AWS")) {
                rating++;
            }
        }
    }

    public int getrating() {
        findrating();
        return rating;
    }

    public double calculateIncrement() {
        double increment = 0.0;
        this.findrating();

        switch (rating) {
            case 1:
                increment = salary * 2 / 100;
                salary = salary + increment;
                break;

            case 2:
                increment = salary * 3.5 / 100;
                salary = salary + increment;
                break;

            case 3:
                increment = salary * 5 / 100;
                salary = salary + increment;
                break;

            case 4:
                increment = salary * 7.5 / 100;
                salary = salary + increment;
                break;

            case 5:
                increment = salary * 10 / 100;
                salary = salary + increment;
                break;

            default:

                break;

        }
        return increment;
    }

}
