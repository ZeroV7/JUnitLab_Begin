package csc131.junit;

import static org.junit.Assert.assertEquals;
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
		assertEquals("getIssuingStore()",
		issuingStore, card.getIssuingStore());
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
		assertEquals("getBalance()",
		issuingStore, card.getIssuingStore(), 0.001);
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
		assertEquals("deduct_RemainingBalance(20.00)",
		str, card.deduct(20.0));
	}
}
