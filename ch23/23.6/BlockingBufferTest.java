// Fig. 23.15: BlockingBufferTest.java
// Two threads manipulating a blocking buffer that properly
// implements the producer/consumer relationship.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BlockingBufferTest
{
	public static void main(String[] args) throws InterruptedException
	{
		// create new thread pool with two threads
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		// create BlockingBuffer to store ints
		Buffer sharedLocation = new BlockingBuffer();
		
		executorService.execute(new Producer(sharedLocation));
		executorService.execute(new Consumer(sharedLocation));
		
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);
	}
} // end class BlockingBufferTest

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