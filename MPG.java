import java.util.Scanner;
public class MPG {
    public static void calc(){
        Scanner userTerminalInput = new Scanner(System.in);
        double odoS,odoEnd,numGalls,milesTrav, mpg;
        System.out.println("What Was The Odometer Reading At the Start Of The Trip?");
        odoS = userTerminalInput.nextDouble();
        System.out.println("What Was The Odometer Reading At The End Of The Trip?");
        odoEnd = userTerminalInput.nextDouble();
        System.out.println("What Were The Number Of Gallons That You Refilled On The Trip?");
        numGalls = userTerminalInput.nextDouble();
        milesTrav = odoEnd-odoS;
        mpg = milesTrav/numGalls;
        System.out.println("Your MPG is: "+mpg);
    }
}