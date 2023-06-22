package pet;

/**
 * represents generic food for a pet
 * @author X1 Yoga
 *
 */
public class Food {
	//instance vars
	
	//calories for food.
	private int calories;
	
	
	//constructor
	
	/**
	 * create instance of food with given number of calories
	 * @param calaries for food
	 */
	public Food(int calories) {
		this.calories = calories;
	}

	//getters and setters
	
	/**
	 * gets the calories
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}


	/**
	 * sets the calories
	 * @param calories the calories to set
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}


	
}
