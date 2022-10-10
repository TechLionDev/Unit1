import java.util.Scanner;
class InSeconds {
    public static void calculateHoursToSeconds(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of hours: ");
        int hours = input.nextInt();
        System.out.println("Enter the number of minutes: ");
        int minutes = input.nextInt();
        System.out.println("Enter the number of seconds: ");
        int seconds = input.nextInt();
        System.out.println("The Number Of Seconds is: " + ((hours*60)*(minutes*60)+seconds));
        input.close();
    }
};