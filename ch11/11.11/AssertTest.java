// Fig. 11.8: AssertTest.java
// Checking with assert that a value is within range.
// Instruction to run assert right: https://coderanch.com/t/639164/java/assert-function-working
import java.util.Scanner;

public class AssertTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 10: ");
		int number = input.nextInt();
		
		// assert that the value is >= 0 and <= 10
		assert number >= 0 && number <= 10: "bad number: " + number;
		
		System.out.printf("You entered %d%n", number);
	}
} // end class AssertTest
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