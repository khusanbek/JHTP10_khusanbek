// FibonacciDemo.java
// Fibonacci calculations performed synchronously and asynchroneously.
import java.time.Duration;
import java.text.NumberFormat;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

// class that stores two Instants in time
class TimeData
{
	public Instant start;
	public Instant end;
	
	// return total time in seconds
	public double timeInSeconds()
	{
		return Duration.between(start, end).toMillis() / 1000.0;
	}
} // end class TimeData

public class FibonacciDemo
{
	public static void main(String[] args)
		throws InterruptedException, ExecutionException
	{
		// perform synchronous fibonacci(45) and fibonacci(44) calculations
		System.out.println("Synchronous Long Running Calculations");
		TimeData synchronousResult1 = startFibonacci(45);
		TimeData synchronousResult2 = startFibonacci(44);
		double synchronousTime = 
			calculateTime(synchronousResult1, synchronousResult2);
		System.out.printf(
			"	Total calculation time = %.3f seconds%n", synchronousTime);
		
		// perform asynchroneous fibonacci(45) and fibonacci(44) calculations
		System.out.printf("%nAsynchronous Long Running Calculations%n");
		CompletableFuture<TimeData> futureResult1 = 
			CompletableFuture.supplyAsync(() -> startFibonacci(45));
		CompletableFuture<TimeData> futureResult2 = 
			CompletableFuture.supplyAsync(() -> startFibonacci(44));
		
		// wait for results from the asynchroneous operations
		TimeData asynchroneousResult1 = futureResult1.get();
		TimeData asynchroneousResult2 = futureResult2.get();
		double asynchroneousTime = 
			calculateTime(asynchroneousResult1, asynchroneousResult2);
		System.out.printf(
			"	Total calculation time = %.3f seconds%n", asynchroneousTime);
		
		// display time difference as a percentage
		String percentage = NumberFormat.getPercentInstance().format(
			synchronousTime / asynchroneousTime);
		System.out.printf("%nSynchronous calculations took %s" +
			" more time than the asynchroneous calculations%n", percentage);	
	}
	
	// execute function fibonacci asynchroneously
	private static TimeData startFibonacci(int n)
	{
		// create a TimeData object to store times
		TimeData timeData = new TimeData();
		
		System.out.printf("	Calculating fibonacci(%d)%n", n);
		timeData.start = Instant.now();
		long fibonacciValue = fibonacci(n);
		timeData.end = Instant.now();
		displayResult(n, fibonacciValue, timeData);
		return timeData;
	}
	
	// recursive method fibonacci; calculates nth Fibonacci number
	private static long fibonacci(long n)
	{
		if(n == 0 || n == 1)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	// display fibonacci calculation result and total calculation time
	private static void displayResult(int n, long value, TimeData timeData)
	{
		System.out.printf("	fibonacci(%d) = %d%n", n, value);
		System.out.printf(
			"	Calculation time for fibonacci(%d) = %.3f seconds%n", 
			n, timeData.timeInSeconds());
	}
	
	// display fibonacci calculation result and total calculation time
	private static double calculateTime(TimeData result1, TimeData result2)
	{
		TimeData bothThreads = new TimeData();
		
		// determine earlier start time
		bothThreads.start = result1.start.compareTo(result2.start) < 0 ?
			result1.start : result2.start;
			
		// determine later end time
		bothThreads.end = result1.end.compareTo(result2.end) > 0 ?
			result1.end : result2.end;
		
		return bothThreads.timeInSeconds();
	}
} // end class FibonacciDemo
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
