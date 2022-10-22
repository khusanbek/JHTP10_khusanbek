// Fig. 14.18: TokenTest.java
// StringTokenizer object used to tokenize strings.
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenTest
{
	// execute application
	public static void main(String[] args)
	{
		// get sentence
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence and press Enter");
		String sentence = scanner.nextLine();
		
		// process user sentence
		String[] tokens = sentence.split(" ");
		System.out.printf("Number of elements: %d%nThe tokens are:%n",
			tokens.length);
		
		for(String token : tokens)
			System.out.println(token);
	}
} // end class TokenTest
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