/**
 * represents a counter with methods for manupulating a count.
 * @author X1 Yoga
 *
 */

public class Counter {

	//instance vars
	
	int count;
	
	/**
	 * Internal count for counter
	 */
	
	//constructor
	
	/**
	 * Creates counter with given initial count.
	 * @param initialCount to start with
	 */
	public Counter(int initialCount) {
		this.setCount(initialCount);//call SetCount of given class
	}
	
	//methods
	
	/**
	 * increments the internal count by 1.
	 */
	public void increment() {
		this.count++;
	}

	/**
	 * returns the internal count.
	 * @return
	 */
	public int getCount() {
		return this.count;
	}
	/**
	 * sets the internal count to given count.
	 * @param count
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
}
