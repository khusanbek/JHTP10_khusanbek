// Fig. 7.9: Card.java
// Card class represents a playing card.

public class Card
{
	private final String face;  // face of card ("Ace", "Deuce", ...)
	private final String suit;  // suit of card ("Hearts", "Diamonds", ...)
	
	// two-argument constructor initilalizes card's face and suit
	public Card(String cardFace, String cardSuit)
	{
		this.face = cardFace; // initilalize face of card
		this.suit = cardSuit; // initilalize suit of card
	}
	
	// return String representation of Card
	public String toString()
	{
		return face + " of " + suit;
	}
} // end class Card
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