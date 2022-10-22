// Fig. 12.17: CheckBoxFrame.java
// JCheckBox and item events.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame
{
	private final JTextField textField; // displays text in changing fonts
	private final JCheckBox boldJCheckBox; // to select/deselect bold
	private final JCheckBox italicJCheckBox; // to select/deselect bold
	
	// CheckBoxFrame constructor adds JCheckBox to JFrame
	public CheckBoxFrame()
	{
		super("JCheckBox Test");
		setLayout(new FlowLayout());
		
		// set up JTextField and set its font
		textField = new JTextField("Watch the font style change", 20);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textField);
		
		boldJCheckBox = new JCheckBox("Bold");
		italicJCheckBox = new JCheckBox("Italic");
		add(boldJCheckBox); // add bold checkbox to JFrame
		add(italicJCheckBox); // add italic checkbox to JFrame
		
		// register listeners for JCheckBoxes
		CheckBoxHandler hanlder = new CheckBoxHandler();
		boldJCheckBox.addItemListener(hanlder);
		italicJCheckBox.addItemListener(hanlder);
	}
	
	// private inner class for ItemListener event handling
	private class CheckBoxHandler implements ItemListener
	{
		// respond to checkbox events
		@Override
		public void itemStateChanged(ItemEvent event)
		{
			Font font = null; // stores the new Font
			
			// determine which Checkboxes are checked and create Font
			if(boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			else if(boldJCheckBox.isSelected())
				font = new Font("Serif", Font.BOLD, 14);
			else if(italicJCheckBox.isSelected())
				font = new Font("Serif", Font.ITALIC, 14);
			else
				font = new Font("Serif", Font.PLAIN, 14);
			
			textField.setFont(font);
		}
	}
} // end class CheckBoxFrame
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