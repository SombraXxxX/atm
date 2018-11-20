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
		atm.menu():
	}
	public void menu(){
		// validate that account number and pin match
		if(inAccountNum == AccountNumber || inpin == Pin) {
			System.out.println("Type 1 for deposit, 2 for withdraw, 3 for view balance, 4 for exit");
			int menunum = in.nextInt(); 
		if ( menunum == 1) {
			System.out.println("How much will you be depositing?");
        		int deposit = in.nextInt();
			int currentBalance = deposit + Balance;
			System.out.println("Updated Balance: $" + currentBalance);
			atm.menu();
		}if(menunum == 2) {
			System.out.println("How much will you be withdrawing?");
        		int withdraw = in.nextInt();
			int currentBalance = Balance - withdraw;
			System.out.println("Updated Balance: $" + currentBalance);
			atm.menu();
		}if(menunum == 3) {
			System.out.println("Current Balance: $" + Balance );
		}if(menunum == 4 ){
			atm.run();
		}else{
			atm.run();
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
