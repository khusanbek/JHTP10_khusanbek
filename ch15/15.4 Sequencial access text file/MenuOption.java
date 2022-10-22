// Fig.15.7. MenuOption.java
// enum type for the credit-inquiry program's options.

public enum MenuOption
{
	// declare contents of enum type
	ZERO_BALANCE(1),
	CREDIT_BALANCE(2),
	DEBIT_BALANCE(3),
	END(4);
	
	private final int value; // current menu option
	
	// constructor
	private MenuOption(int value)
	{
		this.value = value;
	}
} // end enum MenuOption
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