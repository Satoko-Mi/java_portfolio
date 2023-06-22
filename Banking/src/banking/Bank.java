package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts. 
 * @author X1 Yoga
 *
 */
public class Bank {

	public static void main(String[] args) {
		
		Bank bank = new Bank(); //new instance of bank class
		
		bank.run(); //call the run method in the bank class
	}
	/**
	 * Runs the programs by initializing and managing, bank accounts and customers.
	 */
	public void run() {
		System.out.println("Welcome to the Bank! What is your name? ");
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		
		System.out.println("Hello " + name + "! We are creating checking and saving accounts for you." );
		
		//Create customer with given name
		Customer customer = new Customer(name);
		
		//get address
		System.out.println("What is your address?");
	
		String address = scanner.next();
		
		//set the customer's address
		customer.setAddress(address);
		
		//create a checking account for customer
		BankAccount checkingAccount = new BankAccount("checking", customer);
		
		//create a saving account for customer
		BankAccount savingAccount = new BankAccount("saving", customer);
		
		//gets and prints customer info asscoiated with the check account
		System.out.println();
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerInfo());
		
		//get and print account info for checking account
		System.out.println();
		System.out.println("Saving account: ");		
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println();
		System.out.println("Checking account: ");		
		System.out.println(savingAccount.getAccountInfo());
				
		//deposits
		
		//info checking
		System.out.println();
		System.out.println("Amount (decimal) to deposit into your checking amount?");
		double amount = scanner.nextDouble();
		checkingAccount.deposit(amount);
		
		//info saving
		System.out.println();
		System.out.println("Amount (decimal) to deposit into your saving amount?");
		amount = scanner.nextDouble();
		savingAccount.deposit(amount);

		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingAccount.getAccountInfo());	
		
		//withdraws
		//checking
		System.out.println();
		System.out.println("Amount (decimal) to withdraw from your checking amount?");
		amount = scanner.nextDouble();
		
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	

		//saving
		System.out.println();
		System.out.println("Amount (decimal) to withdraw from your saving amount?");
		amount = scanner.nextDouble();
		
		try {
			savingAccount.withdraw(amount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		
		//
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingAccount.getAccountInfo());	
		
		scanner.close();
		
	}
}
