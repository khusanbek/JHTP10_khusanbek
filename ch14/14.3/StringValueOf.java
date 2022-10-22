// Fig.14.9: StringValueOf.java
// String valueOf methods.

public class StringValueOf
{
	public static void main(String[] args)
	{
		char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 10000000000L;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
		Object objectRef = "hello";
		
		System.out.printf(
			"char array = %s%n", String.valueOf(charArray));
		System.out.printf("part of char array = %s%n", 
			String.valueOf(charArray, 3, 3));
		System.out.printf(
			"boolean = %s%n", String.valueOf(booleanValue));
		System.out.printf(
			"char = %s%n", String.valueOf(characterValue));
		System.out.printf("int = %s%n", String.valueOf(integerValue));
		System.out.printf("long = %s%n", String.valueOf(longValue));
		System.out.printf("float = %s%n", String.valueOf(floatValue));
		System.out.printf(
			"double = %s%n", String.valueOf(doubleValue));
		System.out.printf("Object = %s", String.valueOf(objectRef));
	}
} // end class StringValueOf
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