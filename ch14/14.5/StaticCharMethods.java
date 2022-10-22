// Fig.14.15: StaticCharMethods.java
// Character static methods for testing characters and coverting case.
import java.util.Scanner;

public class StaticCharMethods
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in); // create scanner
		System.out.println("Enter a character and press Enter");
		String input = scanner.next();
		char c = input.charAt(0); // get input character
		
		// display character info
		System.out.printf("is defined: %b%n", Character.isDefined(c));
		System.out.printf("is digit: %b%n", Character.isDigit(c));
		System.out.printf("is first character in a Java identifier: %b%n", 
			Character.isJavaIdentifierStart(c));
		System.out.printf("is part of Java identifier: %b%n", 
			Character.isJavaIdentifierPart(c));
		System.out.printf("is letter: %b%n", Character.isLetter(c));
		System.out.printf(
			"is letter or digit: %b%n", Character.isLetterOrDigit(c));
		System.out.printf(
			"is lower case: %b%n", Character.isLowerCase(c));
		System.out.printf(
			"is upper case: %b%n", Character.isUpperCase(c));
		System.out.printf(
			"to upper case: %s%n", Character.toUpperCase(c));
		System.out.printf(
			"to lower case: %s%n", Character.toLowerCase(c));
	}
} // end class StaticCharMethods
/*
 * Khusanbek Gafurov Practical Codes from JHTP10.
 * These hand written codes are written for educational purposes only.
 * 
 * The JHTP10 is an amazing book, recommed for all. Here I hand coded myself
 * each source code on the book.
 * 
 * Khusanbek Gafurov 2022
 *
**/