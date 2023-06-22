import java.util.ArrayList;
/**
 * represents a custome with name, ID, and geography
 * @author X1 Yoga
 */
public class Customer {
	//static variables
	//share accross all instances of customer
	
	/**
	 * Company for all customers
	 */
	static final String COMPANY = "CVS";
	
	/**
	 * Store list of all customers.
	 */
	static ArrayList<Customer> CUSTOMERS = new ArrayList<Customer>();
	
	/**
	 * To generate and keep track of customer ID.
	 */
	static Counter COUNTER; 
	
	//instance vars
	/**
	 * name of customer
	 */
	String name;
	
	/**
	 * Geography of customer
	 */
	String geography;
	
	/**
	 * ID of customer
	 */
	int ID; 
	
	//constructor
	
	public Customer(String name, String geography) {
		this.name = name;
		this.geography = geography;
		
		this.ID = Customer.COUNTER.getCount();
		//increment customer
		Customer.COUNTER.increment();
		//add this customer to all customers
		Customer.CUSTOMERS.add(this);
	}
	
	//methods
	
	/**
	 *prints all customers for the company.
	 */
	
	public static void printAllCustomers() {
		System.out.println("All customers: ");
		
		//iterate over statically references list of customers
		for (Customer c : Customer.CUSTOMERS) {
			System.out.println(c);
		}
		
		System.out.println();
	}
	
	/**
	 * compares tow customers for equality.
	 * if they have the same name and geography, they are equal.
	 */
	
	public boolean equals(Object obj) {
		Customer otherCustomer = (Customer) obj;
		
		if ((this.name.equals(otherCustomer.name)) && (this.geography.equals(otherCustomer.geography))){
			return true;
		}
		return false;
	}
	
	/*
	 * returns ID, name of customer, and geography. 
	 */
	public String toString() {
		return this.ID + ": " + this.name + ", Company: " + Customer.COMPANY + ", Location: " + this.geography;
	}
	/**
	 * locates the given customer in the list of customers
	 * @param customer to look up
	 * @return index of the given customer in the list, otherwise -1
	 */
	public static int findCustomer(Customer customer) {
		int index = -1;
			
		//iterate over customer list and locate given customer
		for (int i = 0; i < Customer.CUSTOMERS.size(); i ++) {
			if (Customer.CUSTOMERS.get(i).equals(customer)) {
				index = i;
				break;
			}
		}
			return index;
	}
	
	/**
	 * remove the given customer form list of customers.
	 * @param customer
	 */
	public static void removeCustomer(Customer customer) {
		
		//find the customer
		int removeIndex = Customer.findCustomer(customer);
		
		//check if the index is valid then remove customer
		if (removeIndex >= 0) {
			Customer.CUSTOMERS.remove(removeIndex);
		}
		
	}

	
	public static void main(String[] args) {
		
		Customer.COUNTER = new Counter(1);
		
		//create customer
		Customer c1 = new Customer("Chenyun", "LA");
		Customer c2 = new Customer("Ruize", "NYC");
		Customer c3 = new Customer("Jeffrey", "AUS");	
		
		//print all customers
		Customer.printAllCustomers();

		//remove customer
		Customer.removeCustomer(c1);
		
		//print all customers
		Customer.printAllCustomers();
		

	}

}
