// Fig. 23.6: ArrayWriter.java
// Adds integers to an array shared with other Runnables
import java.lang.Runnable;

public class ArrayWriter implements Runnable
{
	private final SimpleArray sharedSimpleArray;
	private final int startValue;

	public ArrayWriter(int value, SimpleArray array)
	{
		startValue = value;
		sharedSimpleArray = array;
	}

	public void run()
	{
		for(int i = startValue; i < startValue + 3; i++)
		{
			sharedSimpleArray.add(i); // add an element to the shared array
		}
	}
} // end class ArrayWriter

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