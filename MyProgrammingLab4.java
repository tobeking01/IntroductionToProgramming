
/* @Author Tobechi Onwenu
 * Book: Introduction to java
 * Chapter 4
 * Functions, Characters, and strings
 * 4.2 Common Mathematical Functions
 * Java provides many useful methods in the Math class for performing common mathematical functions.
 * A method is a group of statements that performs a specific task. You have already used the
 * pow(a,  b) method to compute ab
 * in Section 2.9.4, Exponent Operations and the random()
 * method for generating a random number in Section  3.7. This section introduces other useful
 * methods in the Math class. They can be categorized as trigonometric methods, exponent methods,
 * and service methods. Service methods include the rounding, min, max, absolute, and random methods. In addition to methods, the Math class provides two useful double constants, PI and E (the
 * base of natural logarithms). You can use these constants as Math.PI and Math.E in any program.
 * 4.2.1 Trigonometric Methods
 * The Math class contains the following methods as shown in Table  4.1 for performing
 * trigonometric functions:
 * 
 */
import java.util.Scanner;

public class MyProgrammingLab4 {

	public static void main(String[] args) {
		// 4.2.1 Trigonometric Methods
		// The Math class contains the following methods as shown in Table 4.1 for
		// performing
		// trigonometric functions:

//		TABLE 4.1 Trigonometric Methods in the Math Class
//
//		Method Description
//		sin(radians) Returns the trigonometric sine of an angle in radians.
//		cos(radians) Returns the trigonometric cosine of an angle in radians.
//		tan(radians) Returns the trigonometric tangent of an angle in radians.
//		toRadians(degree) Returns the angle in radians for the angle in degree.
//		toDegree(radians) Returns the angle in degrees for the angle in radians.
//		asin(a) Returns the angle in radians for the inverse of sine.
//		acos(a) Returns the angle in radians for the inverse of cosine.
//		atan(a) Returns the angle in radians for the inverse of tangent.

//		The parameter for sin, cos, and tan is an angle in radians. The return value for asin,
//		acos, and atan is a degree in radians in the range between -p/2 and p/2. One degree is
//		equal to p/180 in radians, 90 degrees is equal to p/2 in radians, and 30 degrees is equal to
//		p/6 in radians.
//		
//		For example,
//		Math.toDegrees(Math.PI / 2) returns 90.0
//		Math.toRadians(30) returns 0.5236 (same as pie/6)
//		Math.sin(0) returns 0.0
//		Math.sin(Math.toRadians(270)) returns -1.0
//		Math.sin(Math.PI / 6) returns 0.5
//		Math.sin(Math.PI / 2) returns 1.0
//		Math.cos(0) returns 1.0
//		Math.cos(Math.PI / 6) returns 0.866
//		Math.cos(Math.PI / 2) returns 0
//		Math.asin(0.5) returns 0.523598333 (same as pie/6)
//		Math.acos(0.5) returns 1.0472 (same as pie/3)
//		Math.atan(1.0) returns 0.785398 (same as pie/4)

		// 4.2.2 Exponent Methods

//		There are five methods related to exponents in the Math class as shown in 
//		
//		Table 4.2.
//
//		Method             Description
//		exp(x) 		Returns e raised to power of x (ex
//		).
//		log(x) 		Returns the natural logarithm of x (ln(x) = loge(x)).
//		log10(x) 	Returns the base 10 logarithm of x (log10(x)).
//		pow(a, b) 	Returns a raised to the power of b (ab).
//		sqrt(x) 	Returns the square root of x (2x) for x 7 = 0.
//		
//		
//		For example,
//		
//		Math.exp(1) returns 2.71828
//		Math.log(Math.E) returns 1.0
//		Math.log10(10) returns 1.0
//		Math.pow(2, 3) returns 8.0
//		Math.pow(3, 2) returns 9.0
//		Math.pow(4.5, 2.5) returns 22.91765
//		Math.sqrt(4) returns 2.0
//		Math.sqrt(10.5) returns 4.24

//		4.2.3 The Rounding Methods
//		
//		The Math class contains five rounding methods as shown in Table 
//		4.3.
//		Method 						Description
//		ceil(x) x 			is rounded up to its nearest integer. This integer is returned as a double value.
//		floor(x) x 			is rounded down to its nearest integer. This integer is returned as a double value.
//		rint(x) x 			is rounded up to its nearest integer. If x is equally close to two integers, the even one is returned as a double value.
//		round(x) 			Returns (int)Math.floor(x + 0.5) if x is a float and returns (long)Math.floor(x + 0.5) if x is a double.
//		
//		For example,

//		Math.ceil(2.1); //returns 4.0
//		Math.ceil(2.0) returns 2.0
//		Math.ceil(-2.0) returns -2.0
//		Math.ceil(-2.1) returns -2.0
//		Math.floor(2.1) returns 2.0
//		Math.floor(2.0) returns 2.0
//		Math.floor(-2.0) returns –2.0
//		Math.floor(-2.1) returns -4.0
//		Math.rint(2.1) returns 2.0
//		Math.rint(-2.0) returns –2.0
//		Math.rint(-2.1) returns -2.0
//		Math.rint(2.5) returns 2.0
//		Math.rint(4.5) returns 4.0
//		Math.rint(-2.5) returns -2.0
//		Math.round(2.6f) returns 3 // Returns int
//		Math.round(2.0) returns 2 // Returns long
//		Math.round(-2.0f) returns -2 // Returns int
//		Math.round(-2.6) returns -3 // Returns long
//		Math.round(-2.4) returns -2 // Returns long

//		4.2.4 The min, max, and abs Methods
//		The min and max methods return the minimum and maximum numbers of two numbers (int,
//		long, float, or double). For example, max(4.4, 5.0) returns 5.0, and min(3, 2)
//		returns 2.
//		The abs method returns the absolute value of the number (int, long, float, or double).
		// For example,

//		Math.max(2, 3) // returns 3
//		Math.max(2.5, 3) //returns 4.0
//		Math.min(2.5, 4.6) //returns 2.5
//		Math.abs(-2) //returns 2
//		Math.abs(-2.1) //returns 2.1

//		4.2.5 The random Method
//		You have used the random() method in the preceding chapter. This method generates a random double value greater than or equal to 0.0 and less than 1.0 (0 <= Math.random() <
//		1.0). You can use it to write a simple expression to generate random numbers in any range.
//		
//		For example,
//		(int)(Math.random() * 10) //Returns a random integer between 0 and 9.
//		50 + (int)(Math.random() * 50) //Returns a random integer between 50 and 99.
//		
////		In general
//		
//		a + Math.random() * b   	// Returns a random number between a and a + b, excluding a + b.

//		Listing 4.1 is an example of a program that prompts the user to enter the x- and y-coordinates
//		of the three corner points in a triangle and then displays the three angles.
//		LISTING 4.1 ComputeAngles.java

		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three points
//		System.out.print("Enter the coordinates of three points separated " + "by spaces like x1 y1 x2 y2 x3 y3: ");
//		double x1 = input.nextDouble();
//		double y1 = input.nextDouble();
//		double x2 = input.nextDouble();
//		double y2 = input.nextDouble();
//		double x3 = input.nextDouble();
//		double y3 = input.nextDouble();
//
//		// Compute three sides
//		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
//		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
//		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
//
//		// Compute three angles
//		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
//		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
//		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
//
//		// Display results
//		System.out.println("The three angles are " + Math.round(A * 100) / 100.0 + " " + Math.round(B * 100) / 100.0
//				+ " " + Math.round(C * 100) / 100.0);
		
//		System.out.println(Math.sqrt(4));
//		System.out.println(Math.sin(2 * Math.PI));
//		System.out.println(Math.cos(2 * Math.PI));
//		System.out.println(Math.pow(2, 2));
//		System.out.println(Math.log(Math.E));
//		System.out.println(Math.exp(1));
//		System.out.println(Math.max(2, Math.min(3, 4)));
//		System.out.println(Math.rint(-2.5));
//		System.out.println(Math.ceil(-2.5));
//		System.out.println(Math.floor(-2.5));
//		System.out.println(Math.round(-2.5f));
//		System.out.println(Math.round(-2.5));
		
		String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // put original string in an 
        // array of chars
//        for (int i = 0; i < len; i++) {
//            tempCharArray[i] = palindrome.charAt(i);
//        } 
        
        // ******* OR *************
        palindrome.getChars(0, len, tempCharArray, 0);
        
        
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }
        
        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
	}

}
