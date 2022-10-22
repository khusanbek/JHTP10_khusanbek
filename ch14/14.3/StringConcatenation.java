// Fig. 14.7: StringConcatenation.java
// String method concat.

public class StringConcatenation
{
	public static void main(String[] args)
	{
		String s1 = "Happy ";
		String s2 = "Birthday";
		
		System.out.printf("s1 = %s%ns2 = %s%n%n", s1, s2);
		System.out.printf(
			"Result of s1.concat(s2) = %s%n", s1.concat(s2));
		System.out.printf("s1 after concatenation = %s%n", s1);		
	}
} // end class StringConcatenation
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