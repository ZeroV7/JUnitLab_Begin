package csc131.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GiftCardTest
{
	@Test
	public void getIssuingStore()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
	}
	
	
	@Test
	public void getBalance()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
	}
	
	@Test
	public void deduct_RemainingBalance() 
	{
		double balance;
		GiftCard card;
		int issuingStore;
		String str;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		str = "Remaining Balance: " + String.format("%6.2f", 80.00);
		assertEquals("deduct_RemainingBalance(20.00)", str, card.deduct(20.0));
	}
	
	@Test
	public void deduct_AmountDue() 
	{
		double balance;
		GiftCard card;
		int issuingStore;
		String str;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		str = "Amount Due: " + String.format("%6.2f", 20.00);
		assertEquals("deduct_AmountDue(120.00)", str, card.deduct(120.0));
	}
	
	@Test
	public void deduct_InvalidTransaction() 
	{
		double balance;
		GiftCard card;
		int issuingStore;
		String str;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		str = "Invalid Transaction";
		assertEquals("deduct_InvalidTransaction(-20.00)", str, card.deduct(-20.0));
	}
	
	@Test
	public void constructor_IncorrectBalance() 
	{ 
		assertThrows(IllegalArgumentException.class, () -> {new GiftCard(1,-10.00);}); 
	}
	
	@Test
	public void constructor_IncorrectID_Low()
	{
		assertThrows(IllegalArgumentException.class, () -> {new GiftCard(-1, 100.00);});
	}
	
	@Test
	public void constructor_IncorrectID_High()
	{
		assertThrows(IllegalArgumentException.class, () -> {new GiftCard(100000, 100.00);});
		 
	}
}
