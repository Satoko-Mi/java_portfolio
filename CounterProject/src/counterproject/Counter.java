package counterproject;

/**
 * represents a counter,with methods
 * @author X1 Yoga
 *
 */
public class Counter {
	//instance variables
	
	int count;
	
	//methods
	
	/**
	 * Increments internal count.
	 * @return new value of internal count
	 */
			
	public int increment() {
		this.count++;
		return this.count;	
	}

	/**
	 * decrements internal count
	 * @return new value of internal count
	 */
	public int decrement() {
		this.count--;
		
		return this.count;
	}
	
	/**
	 * returns the current value of count/
	 * @return
	 */
	public int getCount() {
		return this.count;
		
	}
	
	
}
