/**
 * @author warrenk14
 * subclass of the StudentAccount class
 * class is for a special type of StudentsAccount 
 * which can receive rewards under certain conditions
 */
package assg3_warrenk14;

public class RewardsAccount extends StudentAccount{

	//variables
	//do not need to add the variables from parent since they can be used with the extends
	double rewards;
	
	/**
	 * default constructor
	 */
	public RewardsAccount() {
		super();
		rewards = 0;
		
	}
	
	/**
	 * constructor that returns the balance with a reward addition
	 * @param double balance
	 */
	public RewardsAccount(double initBalance) {
		super(initBalance);
		if (initBalance >= 100) {
			rewards = 5.0;
			}
		}
	
	/**
	 * method that get rewards to return the rewards balance
	 * @return rewards balance
	 */
	public double getRewards() {
		return rewards;
	}
	
	/**
	 * method that uses the redeemRewards balance unless too low
	 */
	public void redeemRewards() {
		if (rewards >= 25) {
			super.setBalance(super.getBalance() + rewards);
			rewards = 0;
			}
		else {	//less than $25 reward balance, then cannot be redeemed
			System.out.println("The reward balance is too low to be used");
			}
		}
	
	/**
	 * inherited from the StudentAccount class and returns string
	 * @return account number, current balance and rewards balance
	 */
	@Override
	public String toString(){
		return "Account number: " + super.getAcctNo() + "\n" + "Current balance: " +
	rewards + "\n" + "Rewards balance: " + rewards;
	}
	
	/**
	 * method that uses the same deposit method from StudentAccount class except
	 * does not give reward unless deposit amount is at least $100
	 * @param givenDeposit
	 */
	@Override
	public void deposit(double givenDeposit) {
		if (givenDeposit >= 1) {
			super.setBalance(super.getBalance() + givenDeposit);
			}	
		else { //balance <= 0
			System.out.println("Error! The deposit needs to be positive " + 
					"otherwise withdrawl the amount");
			}
		if (givenDeposit >= 100) {
			rewards = rewards + 5.0;
			}	
		}
	
	/**
	 * Method that prints out the acctNo, balance and rewards amount
	 * @param none
	 */
	@Override
	public void printInfo() {
		System.out.println("Account number: " + super.getAcctNo() + "\n" + "Current balance: " +
	rewards + "\n" + "Rewards balance: " + rewards);
	}
	
}
