// Fig.14.1: StringConstructors.java
// String class constructors.

public class StringConstructors
{
	public static void main(String[] args)
	{
		char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
		
		String s = new String("hello");
		
		// use String constructors
		String s1 = new String();
		String s2 = new String(s);
		String s3 = new String(charArray);
		String s4 = new String(charArray, 6, 3);
		
		System.out.printf(
			"s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);
	}
} // end class StringConstructors
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