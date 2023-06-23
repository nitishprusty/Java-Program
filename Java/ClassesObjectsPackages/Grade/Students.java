package Java.ClassesObjectsPackages.Grade;

public class Students {
    private int id;
    private String Name;
    private char grade;
    private int [] marks;
    private int average;

    public Students(int id,String name,int [] marks){
         super();
         this.id = id;
         this.Name = name;
         this.marks = marks;
    }

    public void setid(int id){
        this.id = id;
    }

    public int getid(){
        return id;
    }

    public void setName(String n){
        this.Name = n;
    }

    public String getName(){
        return Name;
    }

    public void setGrade(char grade){
        this.grade = grade;
    }
    public char getGrade(){
        return grade;
    }

    public void setMarks(int [] marks){
        this.marks = marks;
    }

    public int [] getmarks(){
        return marks;
    }

    public void setAverage(int avg){
        this.average = avg;
    }

    public float getAvg(){
        return average;
    }

    public void Average(){
        int sum = 0; 
        for(int i = 0;i<this.marks.length;i++){
            sum += marks[i];
        }
        int avg = (sum)/this.marks.length;
        setAverage(avg);
    }

    public void Grade(){
        
        if(getAvg() < 50){
            setGrade('F');
        }else if(getAvg() <= 100 && getAvg() >= 90){
            setGrade('A');
        }else if(getAvg() <= 89 && getAvg() >= 60){
            setGrade('B');
        }else{
            setGrade('C');
        }
    }
}
