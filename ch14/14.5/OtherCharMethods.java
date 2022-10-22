// Fig. 14.17: OtherCharMethods.java
// Character class instance methods.
public class OtherCharMethods
{
	public static void main(String[] args)
	{
		Character c1 = 'A';
		Character c2 = 'a';
		
		System.out.printf(
			"c1 = %s%nc2 = %s%n%n", c1.charValue(), c2.toString());
		
		if(c1.equals(c2))
			System.out.printf("c1 and c2 are equal%n");
		else
			System.out.printf("c1 and c2 are not equal%n");
	}
} // end class OtherCharMethods
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