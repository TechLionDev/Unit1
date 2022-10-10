import java.util.Scanner;
public class Geometry {
    public static double findVolume(double r){
        double vol = (4/3)*Math.PI*Math.pow(r,3);
        return vol;
    }
    public static double findSurfaceArea(double r){
        double area = 4*Math.PI*Math.pow(r,2);
        return area;
    }
    public static void solveSphere() {
        Scanner Userinput = new Scanner(System.in);
        double r;
        System.out.print("Radius Of The Sphere: ");
        r = Userinput.nextDouble();
        double vol = findVolume(r);
        double area = findSurfaceArea(r);
        System.out.println("The Surface Area Of A Sphere With A Radius Of "+ r +" is "+ area);
        System.out.println("And The Volume Of A Sphere With A Radius Of "+ r +" is "+ vol);
    }
}