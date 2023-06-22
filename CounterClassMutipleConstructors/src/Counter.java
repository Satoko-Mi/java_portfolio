/**
 * reprents a counter
 * @author X1 Yoga
 *
 */
public class Counter {
	
	//instance vars
	/**
	 * Intenal count.
	 */
			
	int count;
	
	//constructors
	
	/**
	 * creates a counter  and starts internal counter at given start value.
	 * @param start
	 */
	
	public Counter(int start) {
		this.count = start;
	}
	
	/**
	 * creats a counter and starts at 0
	 */
	public Counter() {
		this.count = 0;
	}
	
	public static void main(String[] args) {
	
		Counter counter1 = new Counter(2);
		System.out.println(counter1.count);
		
		Counter counter2 = new Counter();
		System.out.println(counter2.count);	
	}

}
