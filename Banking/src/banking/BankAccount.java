package banking;

import java.awt.geom.Arc2D.Double;

/**
 * represents a  checking/saving bank account for a customer
 * @author X1 Yoga
 *
 */
public class BankAccount {
	// instance vars
	
	/*
	 * Type of account/checking or saving
	 */
	String accountType;
	
	/*
	 *Balance for bank account 
	 */
	double balance;
	
	/*
	 * Customer for this account
	 */
	Customer customer;
	
	/**
	 * Fixed amount for quick withdrawals.
	 */
	double fastCashAmount;
	
	//constructor
	
	/**
	 * Create a bank account of given type for given customers
	 * @param accounType for bank account
	 * @param customer for bank account
	 */
	public BankAccount(String accountType, Customer customer) {
		this.accountType = accountType;
		this.customer = customer;
		
		this.fastCashAmount = 60;
	}
	
	
	/**
	 * Deposits the given amount if greater than 0
	 * @param amount to add to balance
	 */
	public void deposit(double amount) {
		if (amount > 0) {
		this.balance += amount;
		}
	}
	/**
	 * withdraws the given amount from balance
	 * @param amount to withdraw
	 * @throws Exception if given amount is larger than available balance
	 */
	public void withdraw(double amount) throws Exception {
		if (amount > this.balance) {
			throw new Exception("Amount is grater than available balance.");
		}
		this.balance -= amount;
	}
	/**
	 * Withdraws the fast cash amount
	 * @throws Exception if given fast cash amount is grater than availlable balance
	 */
	public void fastWithdraw() throws Exception {
		this.withdraw(this.fastCashAmount);
	}
	/**
	 * sets the fast cash amount, if greater than 0;
	 * @param amount
	 */
	
	public void setFastCashAmount(double amount) {
		if (amount > 0) {
		this.fastCashAmount = amount;
		}
	} 
	
	/**
	 * Returns account type and balance for this bank account. 
	 * @return string with all the info
	 */
	public String getAccountInfo() {
		return this.accountType + ": " + this.balance;
	}
	
	/**
	 * Returns the customer name and address for this bank account.
	 * @return string with all the info
	 */
	public String getCustomerInfo(){
		return this.customer.getName() + " from " + this.customer.getAddress();
		
	}
	
	
	
}
