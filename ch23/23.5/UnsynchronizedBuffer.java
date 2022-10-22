// Fig. 23.12: UnsynchronizedBuffer.java
// UnsynchronizedBuffer maintains the shared integer that is accessed by
// a producer thread and a consumer thread.
public class UnsynchronizedBuffer implements Buffer
{
	private int buffer = -1; // shared by producer and consumer threads
	
	// place value into buffer
	public void blockingPut(int value) throws InterruptedException 
	{
		System.out.printf("Producer writes]t%2d", value);
		buffer = value;
	}
	
	// return value from buffer
	public int blockingGet() throws InterruptedException
	{
		System.out.printf("Consumer reads\t%2d", buffer);
		return buffer;
	}
} // end class UnsynchronizedBuffer

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