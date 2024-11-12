
public class BankAccount {
	double accountnumber;
	double balance;
	
	public BankAccount(double accountnumber, double balance) {
		this.accountnumber = accountnumber;
		this.balance = balance;
		
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("You have deposited : " + amount);
		System.out.println("Your current Balance after deposit is : "+ balance + "\n");
	}
	
	public void withDraw(double amount) {
		if(balance<amount) {
			System.out.println("Insufficient balance \n");
		}
		else {
			balance -= amount;
			System.out.println("You have withdraw : " + amount);
			System.out.println("Your current balance after withdrawal is : " + balance + "\n");
		}
		
	}
	
	public double getBalance() {
		return balance;
	}
}



