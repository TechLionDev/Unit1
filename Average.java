import java.util.Scanner;
class Average{
    public static void calculateAverage(){
        System.out.print("Please Enter The First Number To Be Averaged: ");
        Scanner input = new Scanner(System.in);
        double firstNumber = input.nextDouble();
        System.out.print("Please Enter The Second Number To Be Averaged: ");
        double secondNumber = input.nextDouble();
        input.close();
        double average = (firstNumber + secondNumber) / 2;
        System.out.println("The Average Of The Numbers Is: " + average);
    }
}