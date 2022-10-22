// Fig. 13.7: ShowColors2JFrame.java
// Choosing colors with JColorChooser.
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ShowColors2JFrame extends JFrame
{
	private final JButton changeColorJButton;
	private Color color = Color.LIGHT_GRAY;
	private final JPanel colorJPanel;
	
	// set new GUI
	public ShowColors2JFrame()
	{
		super("Using JColorChooser");
		
		// create JPanel for display color
		colorJPanel = new JPanel();
		colorJPanel.setBackground(color);
		
		// set up changeColorJButton and register its event handler
		changeColorJButton = new JButton("Change Color");
		changeColorJButton.addActionListener(
			new ActionListener() // anonymous inner class
			{
				// display JColorChooser when user clicks button
				@Override
				public void actionPerformed(ActionEvent event)
				{
					color = JColorChooser.showDialog(
						ShowColors2JFrame.this, "Choose a color", color);
						
					// set default color, if no color is returned
					if(color == null)
						color = Color.LIGHT_GRAY;
					
					// change content pane's background color
					colorJPanel.setBackground(color);
				} // end method actionPerformed
			} // end anonymous inner class
		); // end call to addActionListener
		
		add(colorJPanel, BorderLayout.CENTER);
		add(changeColorJButton, BorderLayout.SOUTH);
		
		setSize(400, 130);
		setVisible(true);
	} // end ShowColors2JFrame constructor
} // end class ShowColors2JFrame
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