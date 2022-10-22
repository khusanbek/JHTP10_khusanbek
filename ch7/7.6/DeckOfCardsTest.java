// Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing.

public class DeckOfCardsTest
{
	// execute application
	public static void main(String[] args)
	{
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); // place Cards in random number
		
		// print all 52 Cards in the order in which they are dealt
		for(int i = 1; i <= 52; i++)
		{
			// deal and display a Card
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			
			if(i % 4 == 0) // output a newline after every fourth card
				System.out.println();
		}
	}
} // end class DeckOfCardsTest
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