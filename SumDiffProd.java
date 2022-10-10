import java.util.Scanner;

class SumDiffProd {
    public int num1;
    public int num2;

    public static void solve() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please Enter First Number: ");
        int num1 = userInput.nextInt();
        System.out.print("Please Enter Second Number: ");
        int num2 = userInput.nextInt();
        userInput.close();
        System.out.println("The sum of the numbers is: " + (num1 + num2));
        System.out.println("The difference of the numbers is: " + (num1 - num2));
        System.out.println("The product of the numbers is: " + (num1 * num2));
    }
}