// Fig. 23.16: SynchronizedBuffer.java
// Synchronizing access to shared mutable data using Object
// methods wait and notifyAll.
public class SynchronizedBuffer implements Buffer
{
	private int buffer = -1; // shared by producer and consumer threads
	private boolean occupied = false;
	
	// place value into buffer
	public synchronized void blockingPut(int value)
		throws InterruptedException
	{
		// where there are no empty locations, place thread in waiting state
		while(occupied)
		{
			// output thread information and buffer information, then wait
			System.out.println("Producer tries to write."); // for demo only
			displayState("Buffer full. Producer waits."); // for demo only
			wait();
		}
		
		buffer = value; // set new buffer value
		
		// indicate produce cannot store another value
		// until consumer retrieves current buffer value
		occupied = true;
		
		displayState("Producer writes " + buffer); // for demo only
		
		notifyAll(); // tell waiting thread(s) to enter runnable state
	} // end method blockingPut; releases lock on SynchronizedBuffer
	
	// return value from buffer
	public synchronized int blockingGet() throws InterruptedException
	{
		// while no data to read, place thread in waiting state
		while(!occupied)
		{
			// output thread information and buffer information, then wait
			System.out.println("Consumer tries to read."); // for demo only
			displayState("Buffer empty. Consumer waits."); // for demo only
			wait();
		}
		
		// indicate that producer can store another value
		// because consumer just retreived buffer value
		occupied = false;
		
		displayState("Consumer reads " + buffer); // for demo only
		
		notifyAll(); // tell waiting thread(s) to enter runnable state
		
		return buffer;
	} // end method blockingGet; releas lock on SynchronizedBuffer
	
	// display current operation and buffer state; for demo only
	private synchronized void displayState(String operation)
	{
		System.out.printf("%-40s%d\t\t%b%n%n", operation, buffer, 
			occupied);
	}
} // end class SynchronizedBuffer

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
