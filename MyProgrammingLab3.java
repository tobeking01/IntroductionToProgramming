// @Author Tobechi Onwenu
// Chapter 3 Introduction to programming
// Topics covered: boolean, if, if-else, if if , switch, conditional expressions, 
// 					math.random(), logical operators (!, &&, ||, and ^)

import java.util.Scanner;

public class MyProgrammingLab3 
{

	public static void main(String[] args) 
	{
		//Introduction
		// boolean Data Type
		// The boolean data type declares a variable with the value either    true  or  false
		// We use rational operators like:
		// <, >, <=, >=,==,!=
		
		// Listing 3.1 AdditionQuiz.java
		
		// Generate random numbers (one way to do)
//		int number1 = (int)(System.currentTimeMillis() % 10);        // generate number1
//		int number2 = (int)(System.currentTimeMillis() /7 % 10);        // generate number2
//
//		
//		// Create Scanner class
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("What is " + number1 + "+" + number2 + "?");     // show question
//		
//		int answer = input.nextInt();
//		
//		System.out.println( number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
		
		// 3.2 Check point		
//		int x = 1;
//		
//		System.out.println("If x = 1, What is (x > 0) : " + (x > 0));
//		System.out.println("If x = 1, What is (x < 0) : " + (x < 0));
//		System.out.println("If x = 1, What is (x >= 0) : " + (x >= 0));
//		System.out.println("If x = 1, What is (x <= 0) : " + (x <= 0));
//		System.out.println("If x = 1, What is (x == 0) : " + (x == 0));
//		System.out.println("If x = 1, What is (x != 0) : " + (x != 0));
//		
//		
		
		
		// 3.3 check point  ****** NOTE ********
//		boolean b = true;
//		i = (int)b;				// you cannot cast from int to boolean
//		
//		int i = 1;
//		boolean b = (boolean)i;  // you cannot cast from boolean to int
		
		
		
		//  ****** if Statements *******
		// An if statement is a construct that enables a program to specify altenative paths of execution
		// Java has several types of selection statements
		// one-way if statements, two-way if-esle statements, nested if statements, multi-way if-else statements,
		// Switch statements, and conditional expressions
		
		
		
		//1.  One-way if statements
		// Executes if and only if the condition is true.
		//        Syntax below
		
		//		if (boolean-expression) 
		//			{
		//				statement(s);
		//			}
		
		// Examples
		// 1. Get area only if radius entered is greater than zero
		
		// init Scanner
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter the radius here: ");
//		
//		double radius = input.nextDouble();
//		
//		if (radius >= 0) 	// *** NOTE *** boolean expression enclosed is bracket
//		{
//			double area = radius * radius * 3.142;
//			System.out.println( "The area of radius " + (int)radius + " is " + area);
//		}
//		
		
		// Listing 3.2 SimpleIfDemo.java
		// Write a program that prompts the user to enter an integer. If the number is a multiple of 5,
		// the program displays HiFive. If the number is divisible by 2, it displays HiEven.
		
		//  init Scanner
//		Scanner input = new Scanner(System.in);
//		
//		// prompt user
//		System.out.println("Enter an integer here: ");
//		int number = input.nextInt();
//		
//		if (number % 5 == 0)
//			System.out.println("The number " + number + " is divisible by 5, HiFive");
//		if (number % 2 == 0)
//			System.out.println("The number " + number + " is divisible by 2, HiEven");
		
		
		// 2. Two-way if-else Statements
		// An if-else statement decides the execution path based on whether the condition is true or false.
		//			Syntax
		//     if (boolean-expression)
		//      {
		//			statement(s)-for-the-true-case;
		//	   	}
		//	   else
		//		{
		//			statement(s)-for-the-false-case;
		//		}
		
		
		// Example
//		Scanner input = new Scanner(System.in);
//		
//		// prompt user
//		System.out.println("Enter an integer here: ");
//		int number = input.nextInt();
//		
//		if (number % 2 == 0)
//		{
//			System.out.println("The number " + number + " is even");
//		}
//		else 
//		{
//			System.out.println("The number " + number + " is odd");
//		}
		
		
		// Nested if and Multi-Way if-else Statements
		// An if statement can be inside another if statement to form a nested if statements
		
		
		// Nested if
		// if (i > k)
		//	  {
		//	 	if (j > k)
		//			System.out.println("i and j are greater than k");
		//    }
		//	else
		//	  {
		//		System.out.println("i is less than or equal to k');
		//	  }
		
		// Multi-Way if-else Statements
		//	if (score >= 90.0)
		//   	System.out.println("A");
		// 	else if (score >= 80.0)
		//		System.out.println("B");
		// 	else if (score >= 70.0)
		//		System.out.println("C");
		// 	else if (score >= 60.0)
		//		System.out.println("D");
		// 	else
		//		System.out.println("F");
		
		// 3.8 checkpoint
		// Test with x = 3 and y = 2; x =3 and y = 4; x = 2 and y = 2 to see the power of nested if statements		
//		int x = 3;
//		int y = 2;
//		
//		if (x > 2) 
//		{
//			if (y > 2)
//			{
//				int z = x + y;
//				System.out.println("z is " + z);
//			}
//		}
//		else
//		{
//			System.out.println("x is " + x);
//		}
		
		
		// 3.7 Generating Random Numbers
		// You can use Math.random() to obtain a random double value
		
		// Example
		// Listing 3.3 SubtractionQuiz.java
		
		// Generate two random single-digit integers between ranges
//		int number1 = (int) ((Math.random () * (500 - 100) + 100));		// generate random numbers between 500 and 100
//		int number2 = (int) ((Math.random() * (999 - 234) + 234));		// generate random numbers between 900 and 234
//		
//		
//		// if number1 < number2, swap number1 with number2
//		if (number1 < number2) 
//		{
//			int temp = number1;
//			number1 = number2;
//			number2 = temp;
//		}
//		
//		// prompt for student to answer "What is number1 - number2?"
//		System.out.print("What is " + number1 + " - " + number2 + "? ");
//		Scanner input = new Scanner(System.in);
//		int answer = input.nextInt();
//		
//		// Grade the answer and display the result
//		if (number1 - number2 == answer)
//			System.out.println("You are correct!");
//		else
//		{
//			System.out.println("Your answer is wrong.");
//			System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
//		}
		
		


		 
		
		
		
		
		
		
	}

}
