import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Helpers.clear();
        System.out.println("Welcome to my Unit 1 Programs!");
        System.out.println("Here Are The Programs That Are Included In This Package:");
        System.out.println("1. An Abraham Lincoln Quote");
        System.out.println("2. Average Calculator");
        System.out.println("3. Sum, Difference, and Product of 2 numbers");
        System.out.println("4. Fahrenheit to Celsius");
        System.out.println("5. Miles To Kilometers");
        System.out.println("6. Hours To Seconds");
        System.out.println("7. Seconds To Hours");
        System.out.println("8. Distance Between 2 Points");
        System.out.println("9. Volume And Surface Area Calculator");
        System.out.println("10. Miles Per Gallon Calculator");
        System.out.print("Please Enter The Number Of The Program You Would Like To Run: ");
        Scanner Userinput = new Scanner(System.in);
        int choice = Userinput.nextInt();
        switch(choice){
            case 1:
                Helpers.clear();
                System.out.println("The Abraham Lincoln Quote is:");
                Lincoln.printQuote();
                break;
            case 2:
                Helpers.clear();
                Average.calculateAverage();
                break;
            case 3:
                Helpers.clear();
                SumDiffProd.solve();
                break;
            case 4:
                Helpers.clear();
                TempConverter.FtoC();
                break;
            case 5:
                Helpers.clear();
                MilesKilometers.convertMilesToKilometers();
                break;
            case 6:
                Helpers.clear();
                InSeconds.calculateHoursToSeconds();
                break;
            case 7:
                Helpers.clear();
                HourMinSec.secondsToHours();
                break;
            case 8:
                Helpers.clear();
                Distance.findDistance();
                break;
            case 9:
                Helpers.clear();
                Geometry.solveSphere();
                break;
            case 10:
                Helpers.clear();
                MPG.calc();
                break;
            default:
                System.out.println("Please Select A Valid Number!");
        }
    }
}