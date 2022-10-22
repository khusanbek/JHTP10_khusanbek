// Fig. 14.6: SubString.java
// String class substring methods.

public class SubString
{
	public static void main(String[] args)
	{
		String letters = "abcdefghijklmabcdefghijklm";
		
		// test substring methods
		System.out.printf("Substirng from index 20 to end is \"%s\"%n",
			letters.substring(20));
		System.out.printf("%s \"%s\"%n",
			"Substring from index 3 up to, but not including 6 is",
			letters.substring(3, 6));
	}
} // end class SubString
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