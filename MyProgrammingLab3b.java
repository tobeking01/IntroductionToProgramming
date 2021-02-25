// @ Author Tobechi Onwenu
// Introduction to java programming exercises on chapter3
// continued

import java.util.Scanner;

public class MyProgrammingLab3b {

	public static void main(String[] args) {
		// 3.8 Case study: Compute Body Mass Index
		// Listing 3.4 ComputeAndInterpretBMI.java

//		// init Scanner
//			Scanner input = new Scanner(System.in);
//				
//			// prompt the user to enter weight in pounds
//			System.out.println("Enter weight in pounds: ");
//			double weight = input.nextDouble();
//				
//			// prompt the user to enter height in inches
//			System.out.println("Enter height in inches: ");
//			double height = input.nextDouble();
//				
//			final double KILOGRAMS_PER_POUND = 0.45359237;		// CONSTANTS
//			final double METERS_PER_INCH =	0.0254;				// CONSTANTS
//				
//			// Compute BMI
//			double weightInKilograms = weight * KILOGRAMS_PER_POUND;
//			double heightInMeters = height * METERS_PER_INCH;
//			double bmi = weightInKilograms / (heightInMeters * heightInMeters);
//				
//			// Display results
//			System.out.println("BMI is " + bmi);
//			if (bmi < 18.5)
//				System.out.println("Underweight");
//			else if (bmi < 25)
//				System.out.println("Normal");
//			else if (bmi < 30)
//				System.out.println("Overweight");
//			else
//				System.out.println("Obese");
//			

		// Listing 3.5 ComputeTax.java

		// init Scanner
//			Scanner input = new Scanner(System.in);
//			
//			// prompt user to enter filing status
//			System.out.print("(0-single filer, 1-married jointly or " + 
//			       "qualifying widow(er), 2-married seperately, 3-head of " +
//					"household) Enter the filing status: ");
//			
//			int status = input.nextInt();
//			
//			// prompt for the user to enter taxable income
//			System.out.print("Enter the taxable income: ");
//			double income = input.nextDouble();
//			
//			// compute tax
//			double tax = 0;
//			
//			if (status == 0)		// tax for single
//			{
//				if (income <= 8350)
//					tax = income * 0.10;
//				else if (income <= 33950)
//					tax = 8350 * 0.10 + (income - 8350) * 0.15;
//				else if (income <= 82250)
//					tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (income - 33950) * 0.25;
//				else if (income <= 171550)
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
//				else if (income <= 372950)
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + 
//						(income - 171550) * 0.33;
//				else
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
//					(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
//			}
//			
//			else if (status == 1)		// tax for Married filing jointly or qualified widow(er)
//			{
//				if (income <= 16700)
//					tax = income * 0.10;
//				else if (income <= 67900)
//					tax = 16700 * 0.10 + (income - 16700) * 0.15;
//				else if (income <= 137050)
//					tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
//				else if (income <= 208850)
//					tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
//				else if (income <= 372950)
//					tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + 
//						(income - 208850) * 0.33;
//				else
//					tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + 
//						(372950 - 208850) * 0.33 + (income - 372950) * 0.35;
//			}
//			
//			else if (status == 2)		// tax for Married filing separately
//			{
//				if (income <= 8350)
//					tax = income * 0.10;
//				else if (income <= 33950)
//					tax = 8350 * 0.10 + (income - 8350) * 0.15;
//				else if (income <= 68525)
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
//				else if (income <= 104425)
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
//				else if (income <= 186475)
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + 
//						(income - 104425) * 0.33;
//				else
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + 
//							(186475 - 104425) * 0.33 + (income - 186475) * 0.35;
//			}
//			
//			else if (status == 3)		// tax for head of household
//			{
//				if (income <= 11950)
//					tax = income * 0.10;
//				else if (income <= 45500)
//					tax = 11950 * 0.10 + (income - 11950) * 0.15;
//				else if (income <= 117450)
//					tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
//				else if (income <= 190200)
//					tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
//				else if (income <= 372950)
//					tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + 
//						(income - 190200) * 0.33;
//				else
//					tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + 
//							(3729500 - 190200) * 0.33 + (income - 372950) * 0.35;
//			}
//			else
//			{
//				System.out.println(" Error: invalid status");
//				System.exit(1);
//			}
//			
//			// display results
//			System.out.println("Tax is " + (int)(tax *100) / 100.0); // round off answer to 2 d.p

		// Logical operators
		// we have the !, &&, ||, ^ operators

		// Listing 3.6 TestBooleanOperators.java

		// Create Scanner
//		Scanner input = new Scanner(System.in);
//		
//		// Receive inputs
//		System.out.print("Enter an integer: ");
//		int number = input.nextInt();
//		
//		// If statements
//		if (number % 2 == 0 && number % 3 == 0)
//			System.out.println(number + " is divisible by 2 and 3.");
//		
//		if (number % 2 == 0 || number % 3 == 0)
//			System.out.println(number + " is divisible by 2 or 3. ");
//		
//		if (number % 2 ==0 ^ number % 3 == 0)
//			System.out.println(number + " is divisible by 2 or 3, but not both.");
//		

		// Example
		// Listing 3.7 leapYear.java

		// Create Scanner
//		Scanner input = new Scanner(System.in);
//
//		// prompt user
//		System.out.println("Enter a year: ");
//		int year = input.nextInt();
//
//		// check if the year is a leap year
//		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//
//		// Display results
//		System.out.println(year + " is a leap year? " + isLeapYear);

		/**
		 * 3.12 Case Study: Lottery
		 * 
		 * Write a program to play lottery. The program randomly generates a lottery of
		 * two-digit number, prompt the user to enter a two-digit number, and determines
		 * Weather the user wins according to the following rules: 1. If the user input
		 * matches the lottery number in the exact order, the award is $10,000 2. If all
		 * digits in the user input match all digits in the lottery number, the award is
		 * $3000. 3. If one digit in the user input matches a digit in the lottery
		 * number, the award is $1000.
		 *
		 */

		// Generate a lottery number
//		int lottery = (int) (Math.random() * 100);    // random numbers between 0 and 100
//		
//		//System.out.print(lottery);
//		// prompt the user to enter a guess
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter your lottery pick (two digits): ");
//		int guess = input.nextInt();
//		
//		// Get digits from lottery
//		int lotteryDigit1 = lottery / 10;	// if 34 entered = 3
//		int lotteryDigit2 = lottery % 10;	// if 34 entered = 4
//		
//		// Get digits from guess
//		int guessDigits1 = guess / 10;		// if 23 entered = 2
//		int guessDigits2 = guess % 10;		// if 23 entered = 3
//		
//		System.out.println("The lottery number is " + lottery);
//		
//		// Check the guess
//		if (guess == lottery)
//			System.out.println("Exact match: you win $10,000");
//		else if (guessDigits2 == lotteryDigit1 && guessDigits1 == lotteryDigit2)
//			System.out.println("Match all digits: you win $3,000");
//		else if (guessDigits1 == lotteryDigit1
//				|| guessDigits1 == lotteryDigit2
//				|| guessDigits2 == lotteryDigit1
//				|| guessDigits2 == lotteryDigit2)
//			System.out.println("Match one digit: you win $1000");
//		else
//			System.out.println("Sorry, no match");
//		
		// 3.13 Switch Statements
		// A switch statement executes statements based on the value of a variable or an
		// expression

		// Listing 3.5 ComputeTax.java with Switch statements

		// init Scanner
//			Scanner input = new Scanner(System.in);
//			
//			// prompt user to enter filing status
//			System.out.print("(0-single filer, 1-married jointly or " + 
//			       "qualifying widow(er), 2-married seperately, 3-head of " +
//					"household) Enter the filing status: ");
//			
//			int status = input.nextInt();
//			
//			// prompt for the user to enter taxable income
//			System.out.print("Enter the taxable income: ");
//			double income = input.nextDouble();
//			
//			// compute tax
//			double tax = 0;
//			
//			switch (status)
//			{
//				case 0: 
//				if (income <= 8350)
//					tax = income * 0.10;
//				else if (income <= 33950)
//					tax = 8350 * 0.10 + (income - 8350) * 0.15;
//				else if (income <= 82250)
//					tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (income - 33950) * 0.25;
//				else if (income <= 171550)
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
//				else if (income <= 372950)
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + 
//						(income - 171550) * 0.33;
//				else
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
//					(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
//				break;
//			
//				case 1: // tax for Married filing jointly or qualified widow(er)
//				if (income <= 16700)
//					tax = income * 0.10;
//				else if (income <= 67900)
//					tax = 16700 * 0.10 + (income - 16700) * 0.15;
//				else if (income <= 137050)
//					tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
//				else if (income <= 208850)
//					tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
//				else if (income <= 372950)
//					tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + 
//						(income - 208850) * 0.33;
//				else
//					tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + 
//						(372950 - 208850) * 0.33 + (income - 372950) * 0.35;
//				break;
//					
//				case 2:		// tax for Married filing separately
//				if (income <= 8350)
//					tax = income * 0.10;
//				else if (income <= 33950)
//					tax = 8350 * 0.10 + (income - 8350) * 0.15;
//				else if (income <= 68525)
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
//				else if (income <= 104425)
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
//				else if (income <= 186475)
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + 
//						(income - 104425) * 0.33;
//				else
//					tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + 
//							(186475 - 104425) * 0.33 + (income - 186475) * 0.35;
//				break;
//					
//				case 3:		// tax for head of household
//				if (income <= 11950)
//					tax = income * 0.10;
//				else if (income <= 45500)
//					tax = 11950 * 0.10 + (income - 11950) * 0.15;
//				else if (income <= 117450)
//					tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
//				else if (income <= 190200)
//					tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
//				else if (income <= 372950)
//					tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + 
//						(income - 190200) * 0.33;
//				else
//					tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + 
//							(3729500 - 190200) * 0.33 + (income - 372950) * 0.35;
//				break;
//			
//				default:
//					System.out.println(" Error: invalid status");
//					System.exit(1);
//			}			
//				// display results
//				System.out.println("Tax is " + (int)(tax *100) / 100.0); // round off answer to 2 d.p	

		// LISTING 3.9 ChineseZodiac.java
//
//			Scanner input1 = new Scanner(System.in);
//
//			System.out.print("Enter a year: ");
//			int year = input1.nextInt();
//
//			switch (year % 12) 
		{
//				case 0: System.out.println("monkey"); break;
//				case 1: System.out.println("rooster"); break;
//				case 2: System.out.println("dog"); break;
//				case 3: System.out.println("pig"); break;
//				case 4: System.out.println("rat"); break;
//				case 5: System.out.println("ox"); break;
//				case 6: System.out.println("tiger"); break;
//				case 7: System.out.println("rabbit"); break;
//				case 8: System.out.println("dragon"); break;
//				case 9: System.out.println("snake"); break;
//				case 10: System.out.println("horse"); break;
////			case 11: System.out.println("sheep"); break;
//		
//			}
			// Checkpoint 3.31
//			int x = 1, a = 4;
//			switch (a) {
//			case 1:
//				x += 5;
//				break;
//			case 2:
//				x += 10;
//				break;
//			case 3:
//				x += 16;
//				break;
//			case 4:
//				x += 34;
//			}
//			System.out.println(x);

			// Checkpoint 3.32
			// Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday,
			// Thursday, Friday, Saturday, if day is 0,1,2,3,4,5,6, accordingly

			// init Scanner
//			Scanner input = new Scanner(System.in);
//
//			// prompt user
//			System.out.println("Enter a digit from 0 - 6; " + " 0 represents sunday and 6 represents saturday: ");
//			int dayOfWeek = input.nextInt();
//
//			switch (dayOfWeek) {
//			case 0:
//				System.out.println("Sunday");
//				break;
//			case 1:
//				System.out.println("Monday");
//				break;
//			case 2:
//				System.out.println("Tuesday");
//				break;
//			case 3:
//				System.out.println("Wednesday");
//				break;
//			case 4:
//				System.out.println("Thursday");
//				break;
//			case 5:
//				System.out.println("Friday");
//				break;
//			case 6:
//				System.out.println("Saturday");
//			}

			// 3.14 Conditional Expressions
			// The best thing since ice cream lol
			// it shortens your code to be more precise without the need for if statements
			// 		Syntax
			// boolean-expression ? expression1 : expression2;
			// examples
			// max = (num1 > num2) ? num1 : num2;
			// System.out.println((num % 2 == 0) ? "num is even" : "num is odd");
			
			// 3.34
//			Scanner input1 = new Scanner(System.in);
//			System.out.print("Enter your age: ");
//			int ages = input1.nextInt();
//			
//			int ticketPrice = (ages >= 16) ? 20 : 10;	// print 20 for ticket price if greater than or equal to 16 or print 10
//			
//			System.out.println(ticketPrice);
			
			
			// 3.15 Operator Precedence and Associativity
//			How to evaluate?
//			3 + 4 * 4 > 5 * (4 + 3) – 1 && (4 - 3 > 5)
//			
//			• The precedence rule defines precedence for operators as shown below.
//			• If operators with the same precedence are next to each other, their associativity
//			determines the order of evaluation.
			
//			• All binary operators except assignment operators are left-associative. For example:
//			a – b + c – d is equivalent to ((a – b) + c) – d
			
//			Assignment operators are right-associative. Therefore, the expression
//			a = b += c = 5 is equivalent to a = (b += (c = 5))
			
//			TABLE 3.8 Operator Precedence Chart
//			var++, var—(Postfix)
//			+, - (Unary plus and minus), ++var, --var (Prefix)
//			(type) (Casting)
//			! (Not)
//			*, /, % (Multiplication, division, and remainder)
//			+, - (Binary addition and subtraction)
//			<, <=, >, >= (Comparison)
//			==,!= (Equality)
//			& (Unconditional AND)
//			^ (Exclusive OR)
//			| (Unconditional OR)
//			&& (Conditional AND) Short-circuit AND
//			|| (Conditional OR) Short-circuit OR
//			=, +=, -=, *=, /=, %= (Assignment operator)
			
			// Examples evalute these expressions
			
//			boolean a = (2 * 2 - 3 > 2 && 4 - 2 > 5);
//			boolean b = (2 * 2 - 3 > 2 || 4 - 2 > 5);
//			boolean c = (2 > 0 && 2 < 10);
//			boolean d = ((2 > 0) && (2 < 10));
//			boolean e = (2 > 0 || 2 < 10);
//			boolean f = ((2 > 0) || (2 < 10));
//			boolean g = (2 > 0 || 2 < 10 && -1 < 0);
//			boolean h = (2 > 0 || (2 < 10 && -1 < 0));
//
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println(c);
//			System.out.println(d);
//			System.out.println(e);
//			System.out.println(f);
//			System.out.println(g);
//			System.out.println(h);
			
			
			
			//**************  Programming exercise 3.4  **************
			// Write a program that randomly generates an integer between 1 and 12 
			// and displays the English month name January, February, ... , December 
			// for the number 1, 2, ... 12, accordingly.
			
//			int random = (int)(Math.random() * (12 - 1) + 1); // generate random numbers between 12 and 1
//			System.out.println(random);
//			
//			switch (random)
//			{
//			case 1:
//				System.out.println("January");
//				break;
//			case 2:
//				System.out.println("February");
//				break;
//			case 3:
//				System.out.println("March");
//				break;
//			case 4:
//				System.out.println("April");
//				break;
//			case 5:
//				System.out.println("May");
//				break;
//			case 6:
//				System.out.println("June");
//				break;
//			case 7:
//				System.out.println("July");
//				break;
//			case 8:
//				System.out.println("August");
//				break;
//			case 9:
//				System.out.println("September");
//				break;
//			case 10:
//				System.out.println("October");
//				break;
//			case 11:
//				System.out.println("November");
//				break;
//			case 12:
//				System.out.println("December");			
//			}		

			
			// Done.
		}

	}

}
