
public class Main {
public static void main(String[] args) {
	SavingsAccount save = new SavingsAccount(1234, 20000, 30);
	
	CurrentAccount current = new CurrentAccount(5678, 15000, 1000);
	
	System.out.println("***For saving account***");
	System.out.println("--------------------------\n");
	
	save.deposit(500); // deposit amount in saving account
	save.withDraw(15000); // withdrawl amount from saving account
	save.calculateInterest(); //interest is added
	
	System.out.println("\n--------------------------------------------------\n");
	
	System.out.println("***For current account*** ");
	System.out.println("--------------------------\n");
	current.deposit(5000); // deposit amount to current account
	current.withDraw(18000); // withdraw amount from current account
	current.withDraw(3000); // withdraw amount upto overdraftlimit from account
	current.withDraw(100); // withdraw amount from empty account
}
}
