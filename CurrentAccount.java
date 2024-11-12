
public class CurrentAccount extends BankAccount {
	double overdraftLimit;

	public CurrentAccount(double accountnumber, double balance, double overdraftLimit) {
		super(accountnumber, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withDraw(double amount) {
		if(balance + overdraftLimit >= amount) {
			balance -= amount;
			System.out.println("You withdraw amount : " + amount);
			System.out.println("Your current blance after withdrawal is : " + balance+"\n");
		}
		else {
			System.out.println("Insufficient Balance and overdraft Limit to withdraw money\n");
		}
	}	
}
