/* @Author Tobechi Onwenu
 * the power of the java char
 * Turn letters into number thats can be calculated and manipulated using the char
 * 
 * A char is written in single quotes e.g 'A' is 65 in unicode
 * 
 * char, string, instance method, static method
 * 
 */

import java.util.Scanner;

public class MyProgrammingExercise4b {

	public static void main(String[] args) {
//		char letter = 'A';
//		char letter1 = '\u0041';
//		System.out.println(letter);
//		System.out.println(letter1);
//		
//		// turn A to B by adding ++ to any variable
//		char var ='A';
//		System.out.println(++var);
//		
//		// Escape sequence for special characters
//		// Suppose you want to print a message with quotation marks in the output. 
//		// We use the (\)
//		// for example
//		
//		System.out.println("He said \"Java is fun\"");   // print java is fun with quotation marks using backslash \"
//
////				TABLE 4.5 Escape Sequences
////		 			\b Backspace \u0008 8
////		 			\t Tab \u0009 9
////					\n Linefeed u000A 10
////					\f Formfeed \u000C 12
////					\r Carriage Return u000D 13
////					\\ Backslash \u005C 92
////					\" Double Quote \u0022 34
//		
//		// other examples
//		System.out.println("The file is located at c:\\myFiles\\myDoc.doc"); // Escape sequence to add Backslash
//		
//		System.out.println("The file is located at \nc:\\myFiles\\myDoc.doc"); // Using \n to display in a new line
//
//		System.out.println("The file is located at \n\nc:\\myFiles\\myDoc.doc"); // Add double full line space between a sting sentence
//		
//		System.out.println("Name\tAge\tDate"); // add a tab space between words
//		
//		System.out.println("I like this\rNo start over");

		//
//		
//		// Character casting between char and Numeric types
//		// for example
//		
//		// turn A into an integer
//		int i = (int) 'A';
//		System.out.println(i); // prints 65
//		
//		// add two char together
//		int a = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51
//		System.out.println("i is " + a); // i is 101
//		
//		// add an int with a char a
//		int j = 2 + 'a'; // (int)'a' is 97
//		System.out.println("j is " + j); // j is 99
//		
//		// get the new char character for 99 which is c
//		System.out.println(j + " is the Unicode for character " + (char)j);
//		
//		// Concatenate a string to a char 2 because they cannot be calculated
//		System.out.println("Chapter " + '2');

		// Comparing and Testing Characters
		// Often in a program you need to test wheater a character is a number, a
		// letter,
		// an uppercase letter, or a lowercase letter.
		// java provides shortcuts for these with these commands

//			Method 									Description
//		character.isDigit(ch) 					Returns true if the specified character is a digit.
//		character.isLetter(ch) 					Returns true if the specified character is a letter.
//		character.isLetterOfDigit(ch) 			Returns true if the specified character is a letter or digit.
//		character.isLowerCase(ch) 				Returns true if the specified character is a lowercase letter.
//		character.isUpperCase(ch) 				Returns true if the specified character is an uppercase letter.
//		character.toLowerCase(ch)				Returns the lowercase of the specified character.
//		character.toUpperCase(ch) 				Returns the uppercase of the specified character.

		// For example

//		System.out.println("isDigit('a') is " + Character.isDigit('a'));
//		System.out.println("isLetter('a') is " + Character.isLetter('a'));
//		System.out.println("isLowerCase('a') is "
//		 + Character.isLowerCase('a'));
//		System.out.println("isUpperCase('a') is "
//		 + Character.isUpperCase('a'));
//		System.out.println("toLowerCase('T') is "
//		 + Character.toLowerCase('T'));
//		System.out.println("toUpperCase('q') is "
//		 + Character.toUpperCase('q'));
//		
//		
//		// check point 4.11 Evaluate the following
//		int m = '1';
//		System.out.println(m);
//		int n = '1' + '2' * ('4' - '3') + 'b' / 'a'; 
//		System.out.println(n);
//		int o = 'a';
//		System.out.println(o);
//		char p = 90;
//		System.out.println(p);
//		
//		// 4.12 can the following conversions involving casting be allowed?
//		// If so, find the converted result.
//		
//		char c = 'A';
//		int s = (int)c;
//		System.out.println(s);
//		
//		float f = 1000.34f;
//		int i = (int)f;
//		System.out.println(i);
//		
//		double d = 1000.34;
//		int g = (int)d;
//		System.out.println(g);
//		
//		int j = 97;
//		char r = (char)j;
//		System.out.println(r);

		// 4.13 Show the output of the following:

//		char x = 'a';
//		char y = 'c';
//		System.out.println(++x);
//		System.out.println(x++);
//		System.out.println(++y);
//		System.out.println(y++);
//		System.out.println(x - y);
//		
		// 4.14 Write code that generates a random lowercase letter

//		char randomLower = (char)('a' + Math.random() * ('z' - 'a'));
//		System.out.println(randomLower);	
//		
//		int here = 'P';
//		System.out.println(here);
//		System.out.println(Character.isDigit('d'));

		// The String Type
		// A string is a sequence of characters
		// The char type represents only one character. To represent a string of
		// characters,
		// we use the data type called String

		// For eaxmple

//		String message = "Welcome to Java";

		// Table 4.7 lists the String methods for obtaining string length, for accessing
		// characters
		// in the string, for concatenating strings, for converting a string to upper or
		// lowercases,
		// and for trimming a string

		// TABLE 4.7 Simple Methods for String Objects
//		Method 										Description
//		length() 					Returns the number of characters in this string.
//		charAt(index) 				Returns the character at the specified index from this string.
//		concat(s1) 					Returns a new string that concatenates this string with string s1.
//		toUpperCase() 				Returns a new string with all letters in uppercase.
//		toLowerCase() 				Returns a new string with all letters in lowercase
//		trim() 						Returns a new string with whitespace characters trimmed on both sides.

		// ********** INSTANCE METHOD AND STATIC METHOD *********************

//		Strings are objects in Java. The methods in Table 4.7 can only be invoked from a specific string instance. For this reason, these methods are called instance methods. A noninstance method is called a static method. A static method can be invoked without using
//		an object. All the methods defined in the Math class are static methods. They are not tied
//		to a specific object instance. 
		// The syntax to invoke an *** INSTANCE METHOD *** is ***
		// referenceVariable.methodName(arguments) ***.
		// A method may have many arguments or no arguments.
		// For example, the charAt(index) method has one argument, but the length()
		// method has no arguments.

		// Recall that the syntax to invoke a *** STATIC METHOD *** is ***
		// ClassName.methodName(arguments) ***.
		// For example, the pow method in the Math class can be invoked using
		// Math.pow(2, 2.5)

		// Getting String length
		// We use the length() method to return the number of characters in a string.
		// For example
//		
//		String message = "Welcome to Java";
//		System.out.println("The length of " + message + " is " + message.length());
//		
//		// or it could be written directly like:
//		System.out.println("The length of " + message + " is " + "Welcome to Java".length());
//		
//		System.out.println("".length()); // to get an empty sting 0.

		// Getting characters from a string
		// The s.charAt(index) method can be used to retrieve a specific character in a
		// string s,
		// where the index is between 0 and s.length()–1.
		// For example, message.charAt(0) returns the character W, as shown in Figure
		// 4.1. Note that the index for the first character in
		// the string is 0.

//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
//		W e l c o m e   t o     J a  v  a
//		
//		message.charAt(0)				message.charAt(14) 
//					message.length() is 15

		// The characters in a String object can be accessed using its index.
//		
//		// for example
//		System.out.println(message.charAt(8));
//		// or
//		System.out.println("Welcome to Java".charAt(5));

		// Concatenating Strings
		// Syntax is
		// String s3 = s1.concat(s2);

		// Because string concatenation is heavily used in programming, Java provides a
		// convenient way to accomplish it.
		// You can use the plus (+) operator to concatenate two strings, so the
		// previous statement is equivalent to
		// String s3 = s1 + s2;
		// The following code combines the strings message, " and ", and "HTML" into one
		// string:
//		String myString = message + " and " + "HTML";
//		System.out.println(myString);

		// Three strings are concatenated
//		String message = "Welcome " + "to " + "Java";
//		System.out.println(message);
//		// String Chapter is concatenated with number 2
//		String s = "Chapter" + 2; // s becomes Chapter2
//		System.out.println(s);
//		// String Supplement is concatenated with character B
//		String s1 = "Supplement" + 'B'; // s1 becomes SupplementB
//		System.out.println(s1);
//		
//		// using the += on Strings
//		message += " and Java is fun";
//		System.out.println(message);

		// If
//		int i = 1;
//		int j = 2;
//		// What is the difference between these two statements
//		
//		System.out.println("i + j is " + i + j);
//		// and
//		System.out.println("i + j is " + (i + j));
//		
//		// Converting Strings
//		System.out.println("Welcome".toLowerCase());	 //returns a new string welcome.
//		System.out.println("Welcome".toUpperCase());	 //returns a new string WELCOME.

		// The trim() method
		// returns a new string by eliminating whitespace characters from both
		// ends of the string.
		// The characters ' ', \t, \f, \r, or \n are known as whitespace characters.
		// For example,

//		int len;
//		String t = "     Java is fun      ";
//		len = t.length();
//		System.out.println("Length of the string before trim() is "+len);
//		
//		t = t.trim();
//		len = t.length();
//		System.out.println("Length after trim() is "+len);  // All white space removed

		// 4.4.5 Reading a String from the Console
//		To read a string from the console, invoke the next() method on a Scanner object. 
//		For example, 
		// the following code reads three strings from the keyboard:

		Scanner input = new Scanner(System.in);
//		System.out.print("Enter three words separated by spaces: ");
//		String s1 = input.next();
//		String s2 = input.next();
//		String s3 = input.next();
//		System.out.println("s1 is " + s1);
//		System.out.println("s2 is " + s2);
//		System.out.println("s3 is " + s3);

		// ******** The next() method ********** above reads a string that ends with a
		// whitespace character *****

		// ******** You can use the nextLine() method ********** to read an entire line
		// of text.
		// The nextLine() method reads string that ends with the Enter key pressed.
		// For example, the following statements read a line of text

//		System.out.println("Enter a line of texts: ");
//		String s = input.nextLine();
//		System.out.println("The line of text entered is " + s);

		// 4.4.6 Reading a Character from the Console
//		To read a character from the console, use the nextLine() method to read a string and then
//		invoke the charAt(0) method on the string to return a character. 
		// For example, the following code reads a character from the keyboard:

//		System.out.print("Enter a character: ");
//		String see = input.nextLine();
//		char ch = see.charAt(0);
//		System.out.println("The character entered is " + ch);

//		4.4.7 Comparing Strings
//		The String class contains the methods as shown in 
//		Table 4.8 for comparing two strings.
//		
//		Method 										Description
//		equals(s1) 					Returns true if this string is equal to string s1.
//		equalsIgnoreCase(s1) 		Returns true if this string is equal to string s1; it is case insensitive.
//		compareTo(s1) 				Returns an integer greater than 0, equal to 0, or less than 0 to indicate whether this string is greater than, equal to, or less than s1.
//		compareToIgnoreCase(s1) 	Same as compareTo except that the comparison is case insensitive.
//		startsWith(prefix) 			Returns true if this string starts with the specified prefix.
//		endsWith(suffix) 			Returns true if this string ends with the specified suffix.
//		contains(s1) 				Returns true if s1 is a substring in this string
//		

//		How do you compare the contents of two strings? You might attempt to use the == operator,
//		as follows:
//		if (string1 == string2)
//			System.out.println("string1 and string2 are the same object");
//		else
//			System.out.println("string1 and string2 are different objects");
//		However, the == operator checks only whether string1 and string2 refer to the same
//		object; it does not tell you whether they have the same contents. Therefore, you cannot use the
//		== operator to find out whether two string variables have the same contents. Instead, you should
//		use the equals method. 
//		The following code, for instance, can be used to compare two strings:
//
//		if (string1.equals(string2))
//			 System.out.println("string1 and string2 have the same contents");
//			else
//			 System.out.println("string1 and string2 are not equal");

		// For example, the following statements display true and then false.
//		String s1 = "Welcome to Java";
//		String s2 = "Welcome to Java";
//		String s3 = "Welcome to C++";
//		System.out.println(s1.equals(s2)); // true
//		System.out.println(s1.equals(s3)); // false

//		*********The compareTo method can also be used to compare two strings. 
		// For example, consider the following code:
		//
//					s1.compareTo(s2)

//		The method returns the value 0 if s1 is equal to s2, a value less than 0 if s1 is 
//		lexicographically (i.e., in terms of Unicode ordering) less than s2, and a value 
//		greater than 0 if s1 is lexicographically greater than s2.
//		The actual value returned from the compareTo method depends on the offset of the first
//		two distinct characters in s1 and s2 from left to right. 
//				For example, suppose s1 is abc and s2 is abg, and s1.compareTo(s2) returns -4. 
//		The first two characters (a vs. a) from s1 and s2 are compared. Because they are equal, 
//		the second two characters (b vs. b) are compared.
//		Because they are also equal, the third two characters (c vs. g) are compared. 
//		Since the character c is 4 less than g, the comparison returns -4.

		// ********* Caution ****************
//		Syntax errors will occur if you compare strings by using relational operators >, >=, <, or
//		<=. Instead, you have to use s1.compareTo(s2).

		// *********** NOTE **************************
//		The equals method returns true if two strings are equal and false if they are not.
//						AND		
//		The compareTo method returns 0, a positive integer, or a negative integer, depending
//		on whether one string is equal to, greater than, or less than the other string.

//		The String class also provides the equalsIgnoreCase and compareToIgnoreCase methods for comparing strings.
//		The equalsIgnoreCase and compareToIgnoreCase methods ignore the case of the letters when comparing two strings. 
//		You can also use str.startsWith(prefix) to check whether string str starts with a specified prefix,
//		str.endsWith(suffix) to check whether string str ends with a specified suffix, and str.contains(s1) 
//		to check whether string str contains string s1 . 
//		For example, 
//		
//		System.out.println("Welcome to Java".startsWith("We")); //  returns true.
//		System.out.println("Welcome to Java".startsWith("we")); //  returns false.
//		System.out.println("Welcome to Java".endsWith("va")); //    returns true.
//		System.out.println("Welcome to Java".endsWith("v")); //  returns false.
//		System.out.println("Welcome to Java".contains("to")); //  returns true.
//		System.out.println("Welcome to Java".contains("To"));  // returns false.

//		Listing 4.2 gives a program that prompts the user to enter two cities and displays them in
//		alphabetical order?

		// LISTING 4.2 OrderTwoCities.java

//		// Prompt the user to enter two cities
//		System.out.print("Enter the first city: ");
//		String city1 = input.nextLine();
//		System.out.print("Enter the second city: ");
//		String city2 = input.nextLine();
//		
//		System.out.println((int) (char) 'C');   // 67
//		System.out.println((int)(char) 'c');	// 99
//
//		if (city1.compareTo(city2) < 0)
//			System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
//		else
//			System.out.println("The cities in alphabetical order are " + city2 + " " + city1);

//		4.4.8 Obtaining Substrings
//		You can obtain a single character from a string using the charAt method. You can also
//		obtain a substring from a string using the substring method in the String class, as shown in Table 4.9.
//		For example,
//		
//		String message1 = "Welcome to Java";
//		System.out.println(message1.substring(0, 11) + "HTML"); // give only welcome to
//		
//		 TABLE 4.9 The String class contains the methods for obtaining substrings.
//		Method 									Description
//		substring(beginIndex) 				Returns this string’s substring that begins with the character at the specified beginIndex and extends
//											to the end of the string, as shown in Figure 4.2.
//		substring(beginIndex,endIndex)		Returns this string’s substring that begins at the specified beginIndex and extends to the character at index
//											endIndex – 1, as shown in Figure 4.2. Note that the character at endIndex is not part of the substring

//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
//		W e l c o m e   t o    J   a  v  a
//		
//		message.substring(0, 11)	message.substring(11)
//		FIGURE 4.2 above shows the substring method used to obtains a substring(part) from a string.

		// *********** Finding a character or a substring in a String *****************

//		The String class provides several versions of indexOf and lastIndexOf methods to find
//		a character or a substring in a string, as shown in Table 4.10.

//		TABLE 4.10 The String class contains the methods for finding substrings

//		Method 												Description
//		index(ch) 							Returns the index of the first occurrence of ch in the string. Returns -1 if not matched.
//		indexOf(ch, fromIndex) 				Returns the index of the first occurrence of ch after fromIndex in the string. Returns -1 if not matched.
//		indexOf(s) 							Returns the index of the first occurrence of string s in this string. Returns -1 if not matched.
//		indexOf(s, fromIndex) 				Returns the index of the first occurrence of string s in this string after fromIndex. Returns -1 if not matched.
//		lastIndexOf(ch) 					Returns the index of the last occurrence of ch in the string. Returns -1 if not matched.
//		lastIndexOf(ch, fromIndex) 			Returns the index of the last occurrence of ch before fromIndex in this string. Returns -1 if not matched.
//		lastIndexOf(s) 						Returns the index of the last occurrence of string s. Returns -1 if not matched.
//		lastIndexOf(s, fromIndex) 			Returns the index of the last occurrence of string s before fromIndex. Returns -1 if not matched.

//		for example:
		// indexof
//		
//		System.out.println("Welcome to Java".indexOf('W'));			// returns 0.
//		System.out.println("Welcome to Java".indexOf('o'));			// returns 4.
//		System.out.println("Welcome to Java".indexOf('o', 5));		// returns 9.
//		System.out.println("Welcome to Java".indexOf("come")); 		//returns 3.
//		System.out.println("Welcome to Java".indexOf("Java", 5));	// returns 11.
//		System.out.println("Welcome to Java".indexOf("java", 5)); 	//returns -1.
//		
//		//lastIndexOf
//		
//		System.out.println("Welcome to Java".lastIndexOf('W'));			// returns 0.
//		System.out.println("Welcome to Java".lastIndexOf('o'));			// returns 9.
//		System.out.println("Welcome to Java".lastIndexOf('o', 5));		// returns 4.
//		System.out.println("Welcome to Java".lastIndexOf("come"));		// returns 3.
//		System.out.println("Welcome to Java".lastIndexOf("Java", 5)); 	//returns -1.
//		System.out.println("Welcome to Java".lastIndexOf("Java")); 		// returns 11.
//		
//		Suppose a string s contains the first name and last name separated by a space. You can use the
//		following code to extract the first name and last name from the string:

//		String s = "Tobechi Onwenu";
//		int k = s.indexOf(' ');
//		String firstName = s.substring(0, k);
//		String lastName = s.substring(k + 1);
//		System.out.println(firstName);
//		System.out.println(lastName);
//		
//		
		// ***************** 4.4.10 Conversion between Strings and Numbers
		// ********************

//		You can convert a numeric string into a number. 
//		To convert a string into an int value, use the Integer.parseInt method, as follows:
//		int intValue = Integer.parseInt(intString);
//		
//		where intString is a numeric string such as "123".
//		
//		
//		To convert a string into a double value, use the Double.parseDouble method, as follows:
//		double doubleValue = Double.parseDouble(doubleString);
//		
//		where doubleString is a numeric string such as "123.45".
//		
//		If the string is not a numeric string, the conversion would cause a runtime error. 
//		The Integer and Double classes are both included in the java.lang package, and thus they are
//		automatically imported.
//		
//		
//		You can convert a number into a string, simply use the string concatenating operator as
//		follows:
//			
//		String s = number + "";

//		Checkpoint
//		4.16 Suppose that s1, s2, and s3 are three strings, given as follows:
//		String s1 = "Welcome to Java";
//		String s2 = "Programming is fun";
//		String s3 = "Welcome to Java";

//		What are the results of the following expressions?

//		System.out.println(s1 == s2);
//		System.out.println(s2 == s3);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s2.compareTo(s3));
//		System.out.println(s2.compareTo(s2));
//		System.out.println(s1.charAt(0));
//		System.out.println(s1.indexOf('j'));
//		System.out.println(s1.indexOf('J'));
//		System.out.println(s1.indexOf("to"));
//		System.out.println(s1.indexOf("o", 15));
//		System.out.println(s1.indexOf("a"));
//		System.out.println(s1.lastIndexOf('a'));
//		System.out.println(s1.lastIndexOf("o", 15));
//		System.out.println(s1.length());
//		System.out.println(s1.substring(5));
//		System.out.println(s1.substring(5, 11));
//		System.out.println(s1.startsWith("Wel"));
//		System.out.println(s1.endsWith("Java"));
//		System.out.println(s1.toLowerCase());
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.concat(s2));
//		System.out.println(s1.contains(s2));
//		System.out.println("\t Wel \t".trim());
		
		// 4.17 
//		Suppose that s1 and s2 are two strings. Which of the following statements or
//		expressions are incorrect?
		
//		String s1 = "Welcome to Java";
//		String s2 = "Programming is fun";
//		String s = "Welcome to Java";
//		String s3 = s1 + s2;
////		String s3 = s1 - s2;
////		s1 == s2;
////		s1 >= s2;
//		s1.compareTo(s2);
//		int i = s1.length();
////		char c = s1(0);
//		char e = s1.charAt(s1.length());
		
//		4.18 Show the output of the following statements (write a program to verify your results):
		
//		System.out.println("1" + 1);
//		System.out.println('1' + 1);
//		System.out.println("1" + 1 + 1);
//		System.out.println("1" + (1 + 1));
//		System.out.println('1' + 1 + 1);
		
//		4.19 Evaluate the following expressions (write a program to verify your results):
//		
//		System.out.println(1 + "Welcome " + 1 + 1);
//		System.out.println(1 + "Welcome " + (1 + 1));
//		System.out.println(1 + "Welcome " + ('\u0001' + 1));
//		System.out.println(1 + "Welcome " + 'a' + 1);
//			
//		4.20 Let s1 be " Welcome " and s2 be " welcome ". Write the code for the following
//		statements:
//		(a) Check whether s1 is equal to s2 and assign the result to a Boolean variable
//		isEqual.
		 
//		String s1 = "Welcome";
//		String s2 = "welcome";
//		boolean isEqual = s1.equals(s2);
//		System.out.println(isEqual);
		
//		(b) Check whether s1 is equal to s2, ignoring case, and assign the result to a
//		Boolean variable isEqual.
		
//		String s1 = "Welcome";
//		String s2 = "welcome";
//		boolean isEqual = s1.equalsIgnoreCase(s2);
//		System.out.println(isEqual);
		
//		(c) Compare s1 with s2 and assign the result to an int variable x.
		
//		String s1 = "Welcome";
//		String s2 = "welcome";
//		int x = s1.compareTo(s2);
//		System.out.println(x);
		
//		(d) Compare s1 with s2, ignoring case, and assign the result to an int
//		variable x.
		
//		String s1 = "Welcome";
//		String s2 = "welcome";
//		int x = s1.compareToIgnoreCase(s1);
//		System.out.println(x);
		
//		(e) Check whether s1 has the prefix AAA and assign the result to a Boolean
//		variable b.
		
//		String s1 = "Welcome";
//		boolean b = s1.startsWith("AAA");
//		System.out.println(b);
		
//		(f) Check whether s1 has the suffix AAA and assign the result to a Boolean
//		variable b.
		
//		String s1 = "Welcome";
//		boolean b = s1.endsWith("AAA");
//		System.out.println(b);
		
//		(g) Assign the length of s1 to an int variable x
		
//		String s1 = "Welcome";
//		int x = s1.length();
//		System.out.println(x);
		
//		(h) Assign the first character of s1 to a char variable x.
		
//		String s1 = "Welcome";
//		char x = s1.charAt(0);
//		System.out.println(x);
		
//		(i) Create a new string s3 that combines s1 with s2.
		
//		String s1 = "Welcome";
//		String s2 = "welcome";
//		String s3 = s1.concat(s2);
//		//    or
////		String s3 = s1 + s2;
//		System.out.println(s3);
//		
//		(j) Create a substring of s1 starting from index 1.
		
//		String s1 = "Welcome";
//		String sub = s1.substring(1);
//		System.out.println(sub);
		
//		(k) Create a substring of s1 from index 1 to index 4.
		
//		String s1 = "Welcome";
//		String sub = s1.substring(1, 4);
//		System.out.println(sub);
		
//		(l) Create a new string s3 that converts s1 to lowercase.
//		
//		String s1 = "Welcome";
//		String s3 = s1.toLowerCase();
//		System.out.println(s3);
//		
//		(m) Create a new string s3 that converts s1 to uppercase

//		String s1 = "Welcome";
//		String s3 = s1.toUpperCase();
//		System.out.println(s3);
		
//		(n) Create a new string s3 that trims whitespace characters on both ends of s1
		
//		String s1 = "    Welcome    ";
//		String s3 = s1.trim();
//		System.out.println(s3);
//		
//		(o) Assign the index of the first occurrence of the character e in s1 to an int
//		variable x.
		
//		String s1 = "Welcome";
//		int x = s1.indexOf('e');
//		System.out.println(x);
		
//		(p) Assign the index of the last occurrence of the string abc in s1 to an int
//		variable x.
		
		String s1 = "Welcome";
		int x = s1.lastIndexOf("abc");
		System.out.println(x);
		
		
		
		

		
		
		
		


	}

}
