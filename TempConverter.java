import java.util.Scanner;
class TempConverter {
    public static void FtoC(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a temperature in Fahrenheit: ");
        double temp = userInput.nextDouble();
        double tempC = (temp - 32) * 5 / 9;
        System.out.println("The temperature in Celsius is: " + tempC);
        userInput.close();
    }
}