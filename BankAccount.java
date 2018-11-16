public class BankAccount{
	private static long generatedAccountNumber = 100000001L;

	private int Pin;
	private double Balance;
	private long AccountNumber;
	private AccountHolder owner;
	
public BankAccount(int Pin, double Balance, long AccountNumber, AccountHolder owner) {
	this.Pin = Pin;
	this.Balance = Balance;
	this.AccountNumber = AccountNumber;
	this.owner = owner;
}
public int GetPin() {
	return Pin;
}
public double GetBalance() {
	return Balance;
}
public long GetAccountNumber() {
	return AccountNumber;
}
public AccountHolder GetAccountHolder() {
	return owner;
}
public void setPin(int Pin) {
	this.Pin = Pin;
}
public void setAccountNumber(long AccountNumber) {
	this.AccountNumber = AccountNumber;
}
public void setBalance(double Balance) {
	this.Balance = Balance;
}
public void setAccountHolder (AccountHolder owner) {
	this.owner = owner;
}
public int deposit(double amount) {
	if (amount <= 0) {
		return 0;
	} else {
		Balance = Balance + amount;
		
		return 1;
	}
}

/**
 * Withdraws money from this account.
 * 
 * @param amount the money to withdraw
 * @return a status code (0: insufficient funds, 1: invalid amount, 2: success)
 */

public int withdraw(double amount) {
	if (amount > Balance) {
		return 0;
	} else if (amount <= 0) {
		return 1;
	} else {
		Balance = Balance - amount;
		
		return 2;
	}
}
}