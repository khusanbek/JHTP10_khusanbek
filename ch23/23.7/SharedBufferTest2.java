// Fig.23.17: SharedBufferTest2.java
// Two threads correctly manipulating a synchronized buffer.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest2
{
	public static void main(String[] args) throws InterruptedException
	{
		// create a newCachedThreadPool
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		// create SynchronizedBuffer to store ints
		Buffer sharedLocation = new SynchronizedBuffer();
		
		System.out.printf("%-40s%s\t\t%s%n%-40s%s%n%n", "Operation",
			"Buffer", "Occupied", "---------", "------\t\t--------");
			
		// execute the Producer and Consumer tasks
		executorService.execute(new Producer(sharedLocation));
		executorService.execute(new Consumer(sharedLocation));
		
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);
	}
} // end class SharedBufferTest2

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
