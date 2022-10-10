import java.util.Scanner;
class MilesKilometers {
    public static void convertMilesToKilometers(){
        System.out.println("Enter miles: ");
        Scanner input = new Scanner(System.in);
        double miles = input.nextDouble();
        double km = miles * 0.621371;
        System.out.println("Miles: " + miles + " Kilometers: " + km);
        input.close();
    }

}