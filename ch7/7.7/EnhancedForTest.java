// Fig. 7.12: EnhancedForTest.java
// Using the enhanced for statement to total integers in an array.

public class EnhancedForTest
{
	public static void main(String[] args)
	{
		int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		// add each element's value to total
		for(int number : array)
			total += number;
		
		System.out.printf("Total of array elements: %d%n", total);
	}
} // end class EnhancedForTest
/*
 * Khusanbek Gafurov Practical Codes from JHTP10.
 * These hand written codes are written for educational purposes only.
 * 
 * The JHTP10 is an amazing book, but, I found few mistakes in the source
 * code of the book. So, due to this, decided to hand code myself and 
 * upload here as a reference.
 *
 * Khusanbek Gafurov 2022
 *
**/