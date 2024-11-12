
public class SavingsAccount extends BankAccount {
	
	double interestRate;

	public SavingsAccount(double accountnumber, double balance, double interestRate) {
		super(accountnumber, balance);
		this.interestRate = interestRate;
	}
	
	public void calculateInterest() {
		double interest = balance * interestRate/100;
		balance += interest;
		
		System.out.println("Interest added : " + interest);
		System.out.println("Current Balance : " + balance);
	}
}
