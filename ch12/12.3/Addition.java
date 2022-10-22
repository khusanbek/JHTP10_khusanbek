// Fig.12.2: Addition.java
// Addition program that uses JOptionPane for input and output.
import javax.swing.JOptionPane;

public class Addition
{
	public static void main(String[] args)
	{
		// obtain user input from JOptionPane input dialogs
		String firstNumber =
			JOptionPane.showInputDialog("Enter first integer");			
		String secondNumber =
			JOptionPane.showInputDialog("Enter second integer");
			
		// convert String inputs to int values for use in a calculation
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
	
		int sum = number1 + number2;
		
		// display result in a JOptionPane message dialog
		JOptionPane.showMessageDialog(null, "The sum is " + sum,
			"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
	}
} // end class Addition
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
