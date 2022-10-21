// Fig. 23.4: TaskExecutor.java
// Using an ExecutorService to execute Runnables.
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor
{
	public static void main(String[] args)
	{
		// create and name each runnable
		PrintTask task1 = new PrintTask("task1");
		PrintTask task2 = new PrintTask("task2");
		PrintTask task3 = new PrintTask("task3");

		System.out.println("Starting Executor");

		// create ExecutorService to manage threads
		ExecutorService executorService = Executors.newCachedThreadPool();

		// start the three PrintTasks
		executorService.execute(task1); // start task1
		executorService.execute(task2); // start task2
		executorService.execute(task3); // start task3

		// shut down ExecutorService--it decides when to shut down threads
		executorService.shutdown();

		System.out.printf("Task started, main ends%n%n");
	}
} // end class TaskExecutor

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