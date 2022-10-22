// Fig.23.9: Buffer.java
// Buffer interface specifies methods called by Producer and Consumer.
public interface Buffer
{
	// place int value into Buffer
	public void blockingPut(int value) throws InterruptedException;
	
	// return int value from Buffer
	public int blockingGet() throws InterruptedException;
} // end interface Buffer

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
