// Fig. 15.9. Account.java
// Serializable Account class for storing records as objects.
import java.io.Serializable;

public class Account implements Serializable
{
	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	
	// initializes an Account with default values
	public Account()
	{
		this(0, "", "", 0.0); // call other constructor
	}
	
	// initializes an Account with provided values
	public Account(int account, String firstName, 
		String lastName, double balance)
	{
		this.account = account;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	
	// set account number
	public void setAccount(int account)
	{
		this.account = account;
	}
	
	// get account number
	public int getAccount()
	{
		return account;
	}
	
	// set first name
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	// get first name
	public String getFirstName()
	{
		return firstName;
	}
	
	// set last name
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	// get last name
	public String getLastName()
	{
		return lastName;
	}

	// set balance
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	// get balance
	public double getBalance()
	{
		return balance;
	}
} // end class Account
/*
 * Khusanbek Gafurov Practical Codes from JHTP10.
 * These hand written codes are written for educational purposes only.
 * 
 * The JHTP10 is an amazing book, recommed for all. Here I hand coded myself
 * each source code on the book.
 * 
 * Khusanbek Gafurov 2022
 *
**/