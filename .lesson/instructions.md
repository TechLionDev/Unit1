# Instructions  
### Help with the Scanner class below*
## 1. Lincoln.java
	Create a new version of the Lincoln application from Chapter 1 with quotation marks around the quotation.

## 2. Average.java
*Use the __Scanner__ class to read in the three numbers from the user*
	
	Write an application that reads three numbers and prints their average.

## 3. SumDiffProd.java
*Use the __Scanner__ class to read in the two numbers from the user*

	Write an application that reads two floating point numbers and prints their sum, difference, and product.

## 4. TempConverter.java
*Use the __Scanner__ class to read in the temperature from the user*

	Create a revised version of the TempConverter application to convert from Fahrenheit to Celsius. Read the Fahrenheit temperature from the user.

 ## 5. MilesKilometers.java
*Use the __Scanner__ class to read in the miles from the user*

	Write an application that converts miles to kilometers. (One mile equals 1.60935 kilometers.) Read the miles value from the user as a floating point value.

## 6. InSeconds.java
*Use the __Scanner__ class to read in the hours, minutes, and seconds from the user*

	Write an application that reads values representing a time in hours, minutes, and seconds. Then print the same time in seconds.
(For example, 1 hour, 28 minutes, and 42 seconds is equal to 5322 seconds.)

## 7. HourMinSec.java
*Use the __Scanner__ class to read in the seconds from the user*

	Create a new version of InSeconds.java that works in reverse. That is, read a value representing a number of seconds, then print the same amount of time in hours, minutes, and seconds. (For example, 9999 seconds is equal to 2 hours, 46 minutes, and 39 seconds.)


## 8. Distance.java
*Use the __Scanner__ class to read in the coordinates from the user*

	Write an application that reads the (x,y) coordinates for two points. Compute the distance between the two points using the following formula: 
	
				 Distance = √((x2-x1)2 + (y2-y1)2)

## 9. Geometry.java
*Use the __Scanner__ class to read in the radius from the user*

	Write an application that reads the radius of a sphere and prints its volume and surface area. Use the following formulas. Print the output to four decimal places. r represents the radius. 
	 
					Volume = 43r3 
					Surface area = 4r2
 

## 10. MPG.java
*Use the __Scanner__ class to read in the odometer start and odometer end readings*

	Write an application that computes the number of miles per gallon (mpg) of gas for a trip. The total amount of gas used should be a floating point number. Also accept two numbers representing the odometer readings at the start and end of the trip.

# Scanner Class help
 The link below shows how to use Java's Scanner Class.

It's only important to know nextInt() and nextLine() for our purposes.

https://www.w3schools.com/java/java_user_input.asp

## Template 

```java
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a name: ");
		String name = scan.nextLine();

		System.out.println(name);
	}
}
```


# ANSWER FOR AVERAGE.JAVA

```java
import java.util.Scanner;

class Average {
	public static void main(String[] args) {
		// Declare 3 int variables
		int num1, num2, num3;
		// Make Scanner object called scan
		Scanner scan = new Scanner(System.in);
		// Ask for first number
		System.out.println("Enter an Integer & hit ENTER: ");
		// Save the number the user gave us
		num1 = scan.nextInt();

		// Ask for second number
		System.out.println("Enter a second Integer & hit ENTER: ");
		// Save the number the user gave us
		num2 = scan.nextInt();

		// Ask for third number
		System.out.println("Enter a third Integer & hit ENTER: ");
		// Save the number the user gave us
		num3 = scan.nextInt();

		// Display Average
		System.out.println("The average is: " +(num1+num2+num3)/3);

	}
}
```