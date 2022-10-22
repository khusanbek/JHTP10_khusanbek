// Fig. 23.14: BlockingBuffer.java
// Creating a synchronized buffer using an ArrayBlockingQueue.
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer
{
	private final ArrayBlockingQueue<Integer> buffer; // shared buffer
	
	public BlockingBuffer()
	{
		buffer = new ArrayBlockingQueue<Integer>(1);
	}
	
	// place value into buffer
	public void blockingPut(int value) throws InterruptedException
	{
		buffer.put(value); // place value in buffer
		System.out.printf("%s%2d\t%s%d%n", "Producer writes ", value,
			"Buffer cells occupied: ", buffer.size());
	}
	
	// return value from buffer
	public int blockingGet() throws InterruptedException
	{
		int readValue = buffer.take(); // remove value from buffer
		System.out.printf("%s %2d\t%s%d%n", "Consumer reads ",
			readValue, "Buffer cells occupied: ", buffer.size());
			
		return readValue;	
	}
} // end class BlockingBuffer

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