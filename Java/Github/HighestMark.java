package Java.Github;

public class HighestMark {
    public static void main(String[] args) {

        int [] marks = {3,54,6,7,88};
        int [] res = findHighest(marks);
        int highest = res[0];
        int secondhighest = res[1];
        System.out.println(highest);
        System.out.println(secondhighest);
        
    }
    static int[] findHighest(int [] marks){   //3,54,6,7,88
        int highest = Integer.MIN_VALUE;
        int secondhighest = Integer.MIN_VALUE;
        int [] markscard = new int[2];
        for(int i = 0;i<marks.length;i++){
            if(marks[i] > highest){
                secondhighest = highest;
                highest = marks[i];
            }

            if(marks[i] > secondhighest && marks[i] < highest){
                secondhighest = marks[i];
            }
        }
        markscard[0] = highest;
        markscard[1] = secondhighest;

        return markscard;
    }
}
