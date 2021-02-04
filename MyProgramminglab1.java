//@Author Tobechi Onwenu
// programming exercise chapter 1 (answers)


public class MyProgramminglab1 
{

	public static void main(String[] args) 
	{
		// 1.1 display these words
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Programming is fun");
		
	
		//1.3 draw a java pattern
		
		System.out.println("     J         A          V     V        A" );
		System.out.println("     J        A A          V   V        A A" );
		System.out.println(" J   J       AAAAA          V V        AAAAA" );
		System.out.println("  J J       A     A          V        A     A");
		
		// 1.4 print a table
		
		System.out.println("a	a^2		a^3");
		System.out.println("1	1		1");
		System.out.println("2	4		8");
		System.out.println("3	9		27");
		System.out.println("4	16		64");
		
		// 1.5 Calculate the expression
		System.out.println(((9.5 * 4.5) - (2.5 *3)) / (45.5 - 3.5));
		
		// 1.6 summation of a series
		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
		
		// 1.9 area of rectangle
		System.out.println("Area of a rectangle is " + 4.5 * 7.9);
		
		// 1.10 Average speed in mile per hour
		// speed = distance * time 
		// Note in java to get an accurate result with the fractional part,
		// one of the values involved must ba a number with a decimal point e.g 5.0 / 4 is 1.25 but 5/4 is 1.
	
		System.out.println("The average speed is " + (1.6 * 14) * ((45.0 / 60) + (30.0 / 3600)));
		
		
		// 1.11 Population projection
		
		int populationBegin = 312032486;
		int year = ((3600 / 7) - (3600 / 13) + (3600 / 45) * 365);
		int total = populationBegin + year;
		System.out.println("The 1st year population projection is: " + total);
		System.out.println("The 2nd year population projection is: " + (total + year));
		System.out.println("The 3rd year population projection is: " + (total + (2 * year)));
		System.out.println("The 4th year population projection is: " + (total + (3 * year)));
		System.out.println("The 5th year population projection is: " + (total + (4 * year)));
		
		// 1.13 use Cramer's rule to solve the following 2 * 2 linear equation
		// solve the equation: 3.4x + 50.2y = 44.5
		//		 			   2.1x + 0.55y = 5.9
		
		double x = ((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1));		
		double y = ((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1));
		
		System.out.println("The value for x is: " + x); 
		System.out.println("The value for y is: " + y); 
	
	}

}
