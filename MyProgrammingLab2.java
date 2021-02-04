// @Author Tobechi Onwenu
// Chapter 2 Introduction to programming
// Topics covered: Scanner input of one or multiple, variables, constants, naming conventions, 
// 					primitive data types(byte, short, int, long, float, and double), using operators (+, -, *, /, and % ),
//					Current time obtaining, Increment types (++i || i++), casting and round-off.

// Chapter 2 introduction to java
// Exercise and labs

import java.util.Scanner;  // Scanner is in the java.util package

public class MyProgrammingLab2 
{

	public static void main(String[] args) 
	{
		// 2.1 Test
		
//		double i = 50.0;
//		double k = i + 50.0;
//		double j = k + 1;
//		
//		System.out.println("j is " + j + " and k is " + k);
//		
//		// 2.2 Console input
//		// Create a Scanner object
//		Scanner input = new Scanner(System.in);
//		
//		// prompt the user to enter a radius
//		System.out.print("Enter a number for radius: ");
//		double radius = input.nextDouble();
//		
//		// Compute area
//		double area = radius * radius * 3.14159;
//		
//		// Display results
//		System.out.println("The area for the circle of radius " + radius + " is " + area);
		
		// 2.3 Getting multiple inputs
		
//		Scanner input = new Scanner(System.in);
//		
//		// Prompt the user to enter three numbers
//		System.out.print("Enter three numbers: ");
//		double number1 = input.nextDouble();
//		double number2 = input.nextDouble();
//		double number3 = input.nextDouble();
//		
//		// Compute average
//		double average = (number1 + number2 + number3) / 3;
//		
//		// Display results
//		System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
		
		// 2.4 Named Constants
		
//		final double PI = 3.14159; // Declare a Constant
//		
//		// Create a Scanner object
//		Scanner input = new Scanner(System.in);
//		
//		// Prompt the user to enter a radius
//		System.out.print("Enter a number for radius: ");
//		double radius = input.nextDouble();
//		
//		// Compute area
//		double area = radius * radius * PI;
//		
//		// Display result
//		System.out.println("The area for the circle of radius " + radius + " is " + area);
		
		// 2.5 DisplayTime.java
		
		// Create a Scanner object
//		Scanner input = new Scanner(System.in);
//		
//		// Prompt the user to enter a radius
//		System.out.print("Enter a integer for seconds: ");
//		int seconds = input.nextInt();
//		
//		int minutes = seconds / 60; // Find minutes in seconds
//		int remainingSeconds = seconds % 60; // Seconds remaining
//		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
//		
//		// 2.9 Exponential Operations
//		// using the Math.pow(a, b) method to compute a^b
//		
//		System.out.println(Math.pow(2,  3)); // displays 8.0
//		System.out.println(Math.pow(4,  0.5)); // displays 2.0
//		System.out.println(Math.pow(2.5,  2)); // displays 6.25
//		System.out.println(Math.pow(2.5,  -2)); // displays 0.16
		
		// 2.11
//		System.out.println(56 % 6);
//		System.out.println(78 % -4);
//		System.out.println(-34 % 5);
//		System.out.println(-34 % -5);
//		System.out.println(5 % 1);
//		System.out.println(1 % 5);
//		
		// 2.12
		// Day of the week
		// Sunday = 0, Monday = 1, Tuesday = 2, ...
		// use the formula : ( dayOfWeekValue + afterDays ) % 7 
		
		// If today is Tuesday, what will be the day in 100 days?
		
		// Compute area
//		int dayOfWeek = (2 + 100) % 7;
//		
//		String weekDay = " ";
//		
//		switch (dayOfWeek) 
//		{
//			case 0:
//			weekDay = "Sunday";
//			break;
//			case 1:
//			weekDay = "Monday";
//		    break;
//		    case 2:
//		    weekDay = "Tuesday";
//		    break;
//		    case 3:
//		    weekDay = "Wednesday";
//		    break;
//		    case 4:
//		    weekDay = "Thursday";
//		    break;
//		    case 5:
//		    weekDay = "Friday";
//		    break;
//		    case 6:
//		    weekDay = "Saturday";
//		    break;
//		 
//		 }
//		
//		// display result
//		System.out.println("If today is Tuesday, it will be " + weekDay + " in 100 days");
//		
//		// 2.16 Write a statement to display 2 ^ 3.5
//		
//		System.out.println(Math.pow(2, 3.5));
		
		// 2.6 Fahrenheit ToCelsius.java
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter a degree in Fahrenheit: ");
//		double fahrenheit = input.nextDouble();
//		
//		// convert Fahrenheit to Celcius
//		double celsius = (5.0 / 9) * (fahrenheit - 32);
//		System.out.println("Farenheit " + fahrenheit + " is " + celsius + " in Celsius");
//		
//		// Listing 2.7 ShowcurrentTime.java
//		// Obtain the total milliseconds since midnight, jan 1, 1970
//		long totalMilliseconds = System.currentTimeMillis();
//		
//		// Obtain the total seconds since midnight, jan 1, 1970
//		long totalSeconds = totalMilliseconds / 1000;
//		
//		// Compare the current second in the minute in the hour
//		long currentSecond = totalSeconds % 60;
//		
//		// Obtain the total minutes
//		long totalMinutes = totalSeconds / 60;
//		
//		// Compare the current minute in the hour
//		long currentMinute = totalMinutes % 60;
//		
//		// Obtain the total hour
//		long totalHour = totalMinutes / 60;
//		
//		// Compare the current hour
//		long currentHour = totalHour % 24;
//		
//		// Display results
//		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
//		
//		// 2.14 Increment and Decrement operators
//		
//		int i = 3, j = 3;
//		i++; // i becomes 4
//		j--; // j becomes 2
//		
//		// Note i++ is different from ++i
//		// example
//		
//		int a = 6;
//		int b = a++;
//		System.out.println(a);
//		System.out.println(b);
//		a = 6;
//		b = ++a;
//		System.out.println(a);
//		System.out.println(b);
		
		// Listing 2.9 ComputeLoan.java
		// 
		//	Create an Application to calculate the totalPayment based on the InterestRate, numberOfYears and loanAmaount.
		//
		//	monthlyPayment =     loanAmount * monthlyInterestRate 
		//					____________________________________
		//									 1
		//					1 -  ________________________________
		//						 (1 + monthlyInterestRate)^numberOfYears * 12
		//
		//	totalPayment =  monthlyPayment * numberOfYears * 12
//		
//		
//		// Create a Scanner
//		Scanner input = new Scanner(System.in);
//		
//		// Enter annual interest rate in percentage, e.g., 7.25%
//		System.out.print("Enter anual interest rate in percentage, e.g., 7.25%: ");
//		double annualInterestRate = input.nextDouble();
//		
//		// Enter number of years
//		System.out.print("Enter number of years as an integer, e.g., 5: ");
//		int numberOfYears = input.nextInt();
//		
//		// Enter the Loan Amount
//		System.out.print("Enter the Loan amount, e.g., 120000.95: ");
//		double loanAmount = input.nextDouble();
//		
//		// Calculate monthly interest rate
//		double monthlyInterestRate = annualInterestRate / 1200;
//		
//		// Calculate payment
//		double monthlyPayment =(loanAmount * monthlyInterestRate) / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
//		
//		// Calculate final payment
//		double totalPayment = monthlyPayment * numberOfYears * 12;
//		
//		// Display the monthly payment and total amount;
//		System.out.println("The monthly payment is $" + 
//			(int)(monthlyPayment * 100) /100.0);
//		System.out.println("The total payment is $" +
//			(int)(totalPayment * 100) / 100.0);
		
		// 2.32 How would you write the following Quadratic arithmetic expressions?
		//
		//		k = -b + SqRoot b^2 - 4ac 
		//			______________________
		//					2a
//		
//		int b = 3;
//		int a = -5;
//		int c = 15;
//		
//		double i = ((-(b)) + Math.sqrt(( b * b) - (4 * a * c)) / (2 * a));
//		System.out.println("Result of i is " + (int)(i * 100) / 100.0); // round off to 2 decimal places with casting
		
//		// 2.17 Case Sturdy: Counting Monetary Units
//		// 2.10 ComputeChange.java
//		
//		// Create a Scanner
//		Scanner input = new Scanner(System.in);
//		
//		// Prompt the user to enter the amount as a decimal number, e.g., 11.56
//		System.out.println("Enter the amount an decimal number, e.g., 11.56 ");
//		double amount = input.nextDouble();
//		
//		// Convert the amount (e.g 11.56) into cents (1156)
//		int newAmount = (int)(11.56 * 100);
//		
//		// Divide the cents by 100 to find the number of dollars. Obtain the remaining cents
//		// using the cents remainder 100.
//		int dollarAmount = newAmount / 100;
//		newAmount = newAmount % 100;
//		
//		// Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining
//		// cents using the remaining cents remainder 25.
//		int centAmount = newAmount / 25;
//		newAmount = newAmount % 25;
//		
//		// Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining cents
//		// using the remaining cents remainder 10.
//		int dimesAmount = newAmount / 10;
//		newAmount = newAmount % 10;
//		
//		// Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining cents 
//		// using the remaining cents remainder 5.
//		int nickelsAmount = newAmount / 5;
//		newAmount = newAmount % 5;
//		
//		// The remaining cents are pennies.
//		int penniesAmount = newAmount;
//		
//		
//		// Display results:
//		System.out.println("Your $" + amount + " consists of");
//		System.out.println(dollarAmount + " Dollars.");
//		System.out.println(centAmount + " Cents.");
//		System.out.println(dimesAmount + " Dimes.");
//		System.out.println(nickelsAmount + " Nickels.");
//		System.out.println(penniesAmount + " Pennies.");
		
		// ********* PROGRAMMING EXERCISES CHAPTER 2 ******************
		
		// 2.5 Write a program that calculates the financial application
		
//		// Create a Scanner
//		Scanner input = new Scanner(System.in);
//		
//		// Prompt user for sub total in integer e.g., 10:
//		System.out.println("Enter the sub total in Integer e.g., 10: ");
//		int subTotal = input.nextInt();
//		
//		// Prompt user for gratuity rate in decimal e.g., 15.5 %
//		System.out.println("Enter the gratuity rate in pecentage e.g., 15%: ");
//		double gratuityRate = input.nextDouble();
//		
//		// Calculate gratuity
//		double gratuity = gratuityRate / subTotal;
//		
//		// Calcutale Total
//		double total = subTotal + gratuity;
//		
//		// Display result
//		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
		
		
		// We good.
		
		

		

		
		
		
	
		
		
	}
}