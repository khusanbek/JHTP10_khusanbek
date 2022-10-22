// Fig. 13.12: Fonts.java
// Using fonts.
import javax.swing.JFrame;

public class Fonts
{
	// execute application
	public static void main(String[] args)
	{
		// create frame for FontJPanel
		JFrame frame = new JFrame("Using fonts");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FontJPanel fontJPanel = new FontJPanel();
		frame.add(fontJPanel);
		frame.setSize(420, 150);
		frame.setVisible(true);
	}
} // end class Fonts
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