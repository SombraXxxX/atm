import java.util.Scanner;

public class ATM {
	
	private Scanner in;
	private BankAccount account;
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		ATM atm = new ATM(
			new BankAccount(
				1234,
				0,
				1,
				new AccountHolder(
					1234,
					"Ryan Wilson",
					908,
					"123 Main St., Scotch Plains, NJ 07076"
				)
			)
		);
		atm.run();
	}
	public ATM(BankAccount account) {
		this.account = account;
	}	
	public void run() {
		in = new Scanner(System.in);
		
		System.out.println("Welcome to APCSA-ATM. Please enter your Account number and PIN.");
		// TODO// ask user for account number
		System.out.println("Account Number: ");
		int inAccountNum = in.nextInt();
		// ask user for pin
		System.out.println("Pin Number: ");
		int inpin = in.nextInt();
		// validate that account number and pin match
		if(inAccountNum == AccountNumber || inpin == Pin) {
		
		}
		// if valid account number and pin

		//		display menu (deposit, withdraw, view balance, exit)
		//
		//		if user selects deposit
		//			ask how much and perform deposit, then re-show menu
		//		if user selects withdraw
		//			ask how much and perform withdrawal, then re-show menu
		//		if user selects view balance
		//			display formatted balance
		//		if user selects exit
		//			exit application
		// if invalid account number and pin
		//		start all over again
	}
	/**
	 * Constructs an ATM class.
	 * 
	 * @param account
	 */
	

	
	

}
