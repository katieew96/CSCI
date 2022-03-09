/**
 * @author warrenk14
 * account can be used for deposit, charge, and transfer
 */
package assg3_warrenk14;

// this class is the 
public class StudentAccount implements Comparable<StudentAccount> {

	//variables
	private long acctNo;
	private double balance;
	static int counter = 0; 
	
	/**
	 * Default constructor 
	 * acctNo is automatically generated base on the counter value
	 */
	public StudentAccount() {
		balance = 0;
		acctNo = counter; 
		counter++;
	}
	
	/**
	 * default constructor given initial balance
	 * @param initBalance = initial balance 
	 */
	public StudentAccount(double initBalance) {
		balance = initBalance;
		acctNo = counter;
		counter++;
	}
	
	/**
	 * account number automatically generated
	 * @return acctNo
	 */
	public long getAcctNo() {
		return acctNo;
	}
	
	/**
	 * Method gets the account balance
	 * @return balance The account balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Method gets the number of accounts created and generates the account numbers
	 * @return counter
	 */
	public int getCounter() {
		return counter;
	}
	
	/**
	 * method sets the account balance
	 */
	public void setBalance(double setBalance) {
		balance = setBalance;
	}
	
	/**
	 * method deposits into an account and needs to be positive, then balances update
	 * @param givenDeposit
	 * @return account balance
	 */
	public void deposit(double givenDeposit) {
		if (givenDeposit >= 1) {
			balance = givenDeposit + balance;
		}	else { //balance <= 0
				System.out.println("deposit should be positive");
				
			}
		}
	
	/**
	 * Method receives a double value for how the account will be charged, balance updated
	 * @return balances
	 */
	public void charge(double charge) {
		if (charge > 0) {
			balance = balance - charge;	//this new balance can be negative
		}
		else {
			System.out.println("The charge amount has to be a positive nubmer!!");
		}
	}
	
	/**
	 * Method transfer money from another StudentAccount
	 * @param obj of StudentAcount
	 * @param transferAmount - amount to be transfered in = positive
	 */
	public void transferIn(StudentAccount otherAccount, double transAmount) {
		//update both accounts balance, can be negative
		if (transAmount > 0) {
			otherAccount.setBalance(otherAccount.getBalance() - transAmount);
			setBalance(otherAccount.getBalance() + transAmount);
		}
		else { // transAmount <= 0
			System.out.println("The transfer amount needs to be greater than 0 dollars!");
		}
	}
	
	/**
	 * Method transfer an amount from the current account to another StudentAccount
	 * @returns balances
	 */
	public void transferOut(StudentAccount otherAccount, double transAmount) {
		if (transAmount > 0) {
			//update both balances of the accounts, can be negative
			otherAccount.setBalance(otherAccount.getBalance() + transAmount);
			setBalance(getBalance() - transAmount);
		}
		else { // transAmount <= 0
			System.out.println("The transfer amount needs to be greater than 0 dollars");
		}
	}
	
	/**
	 * Method displays account info
	 */
	public void printInfo() {
		System.out.println("Account number: " + acctNo + "\n" + "Current balance: " + balance);
	}
	
	/**
	 * returns a string obj with the account info 
	 * @param none
	 */
	@Override
	public String toString() {
		return "Account number: " + acctNo + "\n" + "Current balance: " + balance;  
	}
	
	/**
	 * Method used to test the order of two StudentAccount objects based on account balance
	 * @param type StudentAccount and parameter is another account
	 */
	
	public int compareTo(StudentAccount otherAccount) {
		if (balance > otherAccount.balance) { 
			//comparable account balance is higher
			return 1;
		}
		else if (balance == otherAccount.balance) { 
			// comparable account is equal to this one
			return 0;
		}
		else { //comparable account balance is lower
			return -1;
		}
	}
}
