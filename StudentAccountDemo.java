/**
 * @author katieWarren
 */
package assg3_warrenk14;

public class StudentAccountDemo {

	public static void main(String[] args) {
		StudentAccount a1 = new StudentAccount();
		StudentAccount a2 = new StudentAccount(10);
		StudentAccount a3 = new StudentAccount(75.5);
		RewardsAccount a4 = new RewardsAccount(0.0);
		RewardsAccount a5 = new RewardsAccount(300);
		RewardsAccount a6 = new RewardsAccount(15.5);
		RewardsAccount a7 = new RewardsAccount(25.5);
		
		System.out.println("\n***Test StudentAccount class***\n");
		//test getAcctNo
		System.out.println("testing getAcctNo");
		System.out.println(a1.getAcctNo()); 
		System.out.println("");
		//test getBalance
		System.out.println("testing getBalance");
		System.out.println(a1.getBalance());
		System.out.println("");
		//test getCounter
		System.out.println("testing getCounter");
		System.out.println(a1.getCounter());
		System.out.println("");
		
		//test setBalance
		System.out.println("testing setBalance");
		a1.setBalance(100);
		System.out.println(a1.getBalance());
		System.out.println("");
		//test deposit
		System.out.println("testing deposit");
		a1.deposit(100); 
		System.out.println(a1.getBalance());
		
		a5.deposit(100);
		a5.deposit(100);
		a5.deposit(100);
		a5.deposit(100);
		a5.deposit(100);
		System.out.println("testing balance after deposit");
		System.out.println(a5.getBalance()); 
		System.out.println("");
		
		a5.charge(100);
		a5.charge(100);
		System.out.println("testing balance after two 100 charges");
		System.out.println(a5.getBalance()); 
		System.out.println("");
		
		//test charge
		System.out.println("Test transferIn method");
		
		System.out.println(a1.getBalance() + " this is a1 starting");
		System.out.println(a2.getBalance() + " this is a2 starting"); 
		a1.transferIn(a2, 10); 
		System.out.println(a1.getBalance()+ " this is a1 after transfer");
		System.out.println(a2.getBalance()+ " this is a2 after transfer"); 
		
		System.out.print("\n***Test transferOut method***\n");
		System.out.println(a3.getBalance() + " this is a3 starting");
		System.out.println(a4.getBalance() + " this is a4 starting"); 
		a3.transferOut(a4, 10); 
		System.out.println(a3.getBalance()+ " this is a3 after transfer");
		System.out.println(a4.getBalance()+ " this is a4 after transfer"); 

		System.out.print("\n***Test toString method***\n");
		System.out.println(a2.toString());
		System.out.println("");
		System.out.println(a1.toString());
		System.out.println("");
		System.out.println(a3.toString());
		System.out.println("");
		System.out.println(a4.toString());
		System.out.println("");
		System.out.println(a5.toString());

		System.out.print("\n***Test printInfo method***\n");
		a2.printInfo();
		System.out.println("");
		a3.printInfo();
		System.out.println("");
		a5.printInfo();
		System.out.println("");
		a4.printInfo();
		

		System.out.print
		("\n***Test toString method***\n");
		//a1 test
		System.out.println(a1.toString()); 
		System.out.println("");
		//a2 test
		System.out.println(a2.toString());
		System.out.println("");
		//a3 test
		System.out.println(a3.toString());
		System.out.println("");
		//a4 test
		System.out.println(a4.toString());
		

		System.out.println("\n***Test compareTo method***\n");
		//a1 and a2
		if (a1.compareTo(a2) < 0)
			System.out.println("a1 is smaller than a2");
		else if (a1.compareTo(a2) > 0) 
			System.out.println("a1 is greater than a2");
		else 
			System.out.println("a1 and a2 are the same amount");
		//a2 and a2
		System.out.println("");
		if (a2.compareTo(a3) < 0)
			System.out.println("a2 is smaller than a3");
		else if (a2.compareTo(a3) > 0) 
			System.out.println("a2 is greater than a3");
		else 
			System.out.println("a2 and a3 are the same amount");
		//a1 and a3
		System.out.println("");
		if (a1.compareTo(a3) < 0)
			System.out.println("a1 is smaller than a3");
		else if (a1.compareTo(a3) > 0) 
			System.out.println("a1 is greater than a3");
		else 
			System.out.println("a1 and a3 are the same amount");
		//a1 and a4
		System.out.println("");
		if (a1.compareTo(a4) < 0)
			System.out.println("a1 is smaller than a4");
		else if (a1.compareTo(a4) > 0) 
			System.out.println("a1 is greater than a4");
		else 
			System.out.println("a1 and a4 are the same amount");
		//a1 and a5
		System.out.println("");
		if (a1.compareTo(a5) < 0)
			System.out.println("a1 is smaller than a5");
		else if (a1.compareTo(a5) > 0) 
			System.out.println("a1 is greater than a5");
		else 
			System.out.println("a1 and a5 are the same amount");
		//a2 and a5
		System.out.println("");
		if (a2.compareTo(a5) < 0)
			System.out.println("a2 is smaller than a5");
		else if (a2.compareTo(a5) > 0) 
			System.out.println("a2 is greater than a5");
		else 
			System.out.println("a2 and a5 are the same amount");
		
		System.out.println("\n***Test RewardsAccoutn class***\n");
		
		//test getRewards
		System.out.println("testing getRewards");
		System.out.println(a5.getRewards());
		
		
		//test redeemRewards
		System.out.println("testing redeemRewards");
		System.out.println(a5.getBalance()); 
		a5.redeemRewards();
		System.out.println(a5.getBalance());
		
		
	}

}
