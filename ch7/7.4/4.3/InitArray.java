// Fig. 7.4: InitArray.java
// Calculating the values to be placed into the elements of an array.

public class InitArray
{
	public static void main(String[] args)
	{
		final int ARRAY_LENGTH = 10; // declare constant
		int[] array = new int[ARRAY_LENGTH]; // create array
		
		// calculate the value for each array element
		for(int counter = 0; counter < array.length; counter++)
			array[counter] = 2 + 2 * counter;
		
		System.out.printf("%s%8s%n", "Index", "Value"); // column headings
		
		// output each array element's value
		for(int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
	}
} // end class InitArray
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