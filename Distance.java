import java.util.Scanner;

public class Distance {
    public static void findDistance(){
        double x1,x2,y1,y2;
        Scanner Userinput = new Scanner(System.in);
        System.out.print("Please Enter x1: ");
        x1 = Userinput.nextDouble();
        System.out.print("Please Enter x2: ");
        x2 = Userinput.nextDouble();
        System.out.print("Please Enter y1: ");
        y1 = Userinput.nextDouble();
        System.out.print("Please Enter y2: ");
        y2 = Userinput.nextDouble();
        Userinput.close();
        double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("Distance: " + distance);
    }
}
