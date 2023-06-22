/**
 * represent a customer
 * @author X1 Yoga
 *
 */
public class Customer {
	//instance
	/**
	 * name of a customer
	 */
	String name;
	
	//constructor
	public Customer(String name) {
		this.name = name;
	}
	
	/**
	 * returs name of customer
	 */
	public String toString() {
		return this.name;
		
	}
	
	
	public static void main(String[] args) {
		Customer c = new Customer("Brandon");
		System.out.println("c = " + c); // this will try to convert customer c to a string by calling the toString method
		
	}
	
}
