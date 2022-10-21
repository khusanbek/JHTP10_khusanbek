// Fig.23.7: SharedArrayTest.java
// Executing two Runnables to add elements to a shared SimpleArray.
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest
{
	public static void main(String[] args)
	{
		// construct the shared object
		SimpleArray SharedSimpleArray = new SimpleArray(6);

		// create two tasks to write to the shared SimpleArray
		ArrayWriter writer1 = new ArrayWriter(1, SharedSimpleArray);
		ArrayWriter writer2 = new ArrayWriter(11, SharedSimpleArray);

		// execute the tasks with an ExecutorService
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(writer1);
		executorService.execute(writer2);

		executorService.shutdown();

		try
		{
			// wait 1 minute for both writers to finish executing
			boolean tasksEnded =
				executorService.awaitTermination(1, TimeUnit.MINUTES);

			if(tasksEnded)
			{
				System.out.printf("%nContents of SimpleArray:%n");
				System.out.println(SharedSimpleArray);
			}
			else
				System.out.println(
					"Timed out while waiting for tasks to finish.");
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	} // end main
} // end class SharedArrayTest

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