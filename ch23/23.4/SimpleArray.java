// Fig 23.8: SimpleArray.java
// Class that manages an integer array to be shared by multiple 
// threads with synchronization.
import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray // CAUTION: NOT THREAD SAFE!
{
	private static final SecureRandom generator = new SecureRandom();
	private final int[] array; // the shared integer array
	private int writeIndex = 0; // shared index of next element to write

	// construct a SimpleArray of a given size
	public SimpleArray(int size)
	{
		array = new int[size];
	}

	// add a value to the shared array
	public synchronized void add(int value)
	{
		int position = writeIndex; // store the write index

		try
		{
			// put thread to sleep for 0-499 milliseconds
			Thread.sleep(generator.nextInt(500));
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt(); // re-interrupt the thread
		}

		// put value in the appropriate element
		array[position] = value;
		System.out.printf("%s wrote %2d to element %d.%n",
			Thread.currentThread().getName(), value, position);

		++writeIndex; // increment index of element to be written next
		System.out.printf("Next write index: %d%n", writeIndex);
	}

	// used for outputting the contents of the shared integer array
	public synchronized String toString()
	{
		return Arrays.toString(array);
	}
} // end class SimpleArray

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