package Java.Github.AvgGrade;

public class Students {
    private int id;
    private String Name;
    private int [] marks;
    private float average;
    private char grade;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.Name = name;
    }

    public String getName(){
        return this.Name;
    }

    public void setMarks(int [] marks){
        this.marks = marks;
    }

    public int [] getMarks(){
        return this.marks;
    }

    public void setAverage(float avg){
        this.average = avg;
    }

    public void findAverage(){
        float sum = 0;
        for(int i = 0;i<this.marks.length;i++){
            sum += this.marks[i];
        }
        average = (float)(sum)/(this.marks.length);
        setAverage(average);
    }

    public void findgrade(){
        int flag = 0;
        if(this.average < 50){
            flag++;
        }
        if(flag > 0){
            grade ='F';
        }else{
            if(this.average <= 100 && this.average >= 90){
                grade = 'O';
            }else if(this.average <= 89 && this.average >= 80){
                grade = 'A';
            }else if(this.average <= 79 && this.average >= 71){
                grade = 'B';
            }else if(this.average <= 70 && this.average >= 65){
                grade = 'C';
            }else if(this.average <= 64 && this.average >= 58){
                grade = 'D';
            }else if(this.average <= 57 && this.average >= 50){
                grade = 'E';
            }else{
                grade = 'F';
            }
        }
        setGrade(grade);
    }

    public float getAverage(){
        return this.average;
    }

    public void setGrade(char grade){
        this.grade = grade;
    }

    public char getGrade(){
        return this.grade;
    }
}
