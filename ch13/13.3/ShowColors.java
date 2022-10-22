// Fig. 13.6: ShowColors.java
// Demonstrating Colors.
import javax.swing.JFrame;

public class ShowColors
{
	// execute application
	public static void main(String[] args)
	{
		// create frame for ColorJPanel
		JFrame frame = new JFrame("Using colors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ColorJPanel colorJPanel = new ColorJPanel();
		frame.add(colorJPanel);
		frame.setSize(400, 180);
		frame.setVisible(true);
	}
} // end class ShowColors
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