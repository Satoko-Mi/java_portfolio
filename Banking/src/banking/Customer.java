package banking;
/**
 * Represents a customer of a bank
 * @author X1 Yoga
 *
 */
public class Customer {

	//instance vars
	
	/*
	 * name of customer
	 */
	String name;
	
	/*
	 * address of customer
	 */
	String address;
	
	//constructor
	
	/**
	 * Creates a customer with the given name
	 * @param name of customer
	 */
	public Customer(String name) {
		//sets instance var name to given name
		this.name = name;
		
		
	}
	//method
	/**
	 * Sets the address of customer ot be given address
	 * doesn't return anything cause it's void
	 * @param address for customer
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * Return customer's name
	 * @return name for customer		
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Return customer' address
	 * @return address of customer
	 */
	public String getAddress() {
		return this.address;
	}
	
}
