package Java.ClassesObjectsPackages.VolumeCalculator;

public class volume {

    public double CalculateVolume(double radius,double height){
        double volume;
        volume = (3.14*radius*radius*height);
        double ans = Math.round(volume * 100)/100;
        return ans;
    }

    public double CalculateVolume(double length,double breadth,double height){
        double volume;
        volume = (length*breadth*height);
        double ans = Math.round(volume * 100)/100;
        return ans;
    }
}
