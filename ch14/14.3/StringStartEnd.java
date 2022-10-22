// Fig. 14.4: StringStartEnd.java
// String methods startsWith and endsWith.

public class StringStartEnd
{
	public static void main(String[] args)
	{
		String[] strings = {"started", "starting", "ended", "ending"};

		// test method startsWith
		for(String string : strings)
		{
			if(string.startsWith("st"))
				System.out.printf("\"%s\" starts with \"st\"%n", string);
		}

		System.out.println();

		// test method startsWith starting from position 2 of string
		for(String string : strings)
		{
			if(string.startsWith("art", 2))
				System.out.printf(
					"\"%s\" starts with \"art\" at position 2%n", string);
		}

		System.out.println();		

		// test method endsWith
		for(String string : strings)
		{
			if(string.endsWith("ed"))
				System.out.printf("\"%s\" ends with \"ed\"%n", string);
		}
	}
} // end class StringStartEnd
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