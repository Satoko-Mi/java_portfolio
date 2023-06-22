package poly;

/**
 * represents dog
 * @author X1 Yoga
 *
 */
public class dog {
	
	//static var
	
	/**
	 *Default name for a dog
	 */
	static String DEFAULT_NAME = "Generic dog";
	
	/**
	 * default age for a dog
	 */
	static double DEFAULT_AGE = .5;
	
	/**
	 * default weight for a dog 
	 */
	static double DEFAULT_WEIGHT =1.75;
	
	/**
	 * default food for a dog food to eat
	 */
	static String DEFAULT_FOOD = "Generic dog food";
	
	/**
	 * default sound a dog to make
	 */
	static String DEFAULT_BARK = "Bark!";
	
	/**
	 * default number of times for dog to bark
	 */
	static int DEFAULT_NUM_TIME = 1;
	
	static double WEIGHT_GAIN_INCREASE = 0.01; 
	
	//instance vars
	
	/**
	 * name of dog
	 */
	String name;
	
	/**
	 * age of dog
	 */
	double age;
	
	/**
	 * owner of dog
	 */
	String owner;
	
	/**
	 * weight of dog
	 */
	double weight;
	
	//constructors
	
	/**
	 * creates a dog with given name, age, owner, and weight
	 * @param name of dog
	 * @param age of dog
	 * @param owner of dog
	 * @param weight of dog
	 */
	
	public dog(String name, double age, String owner, double weight) {
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.weight = weight;			
		
	}
	
	/**
	 * creates dog with name and age
	 * @param name
	 * @param age
	 */
	public dog(String name,double age) {
		//call first constructor with 2 vars dn3 default values
		this(name, age, null, dog.DEFAULT_WEIGHT);
		
	}
	/**
	 * creates dog 
	 */
	
	public dog() {
		//calls second constructors with 2 default values
		this(dog.DEFAULT_NAME, dog.DEFAULT_AGE);
	}
	
	//method
	
	/**
	 * Dog eats givedn amount of given food
	 * @param amount of food
	 * @param food to eat
	 * @return new weight
	 */
	public double eat(double amount, String food) {
		System.out.println(this.name + " is eating " + amount + " of " + food);
		
		//calc weight gain
		double weighGained = dog.WEIGHT_GAIN_INCREASE * amount;
		
		this.weight += weighGained;
		
		return this.weight;
		
	}
	
	/**
	 * dog eat given amount of generic dog food
	 * @param amount
	 * @return new weight
	 */
	
	public double eat(double amount) {
		//call the first version of eat method
		return this.eat(amount, DEFAULT_FOOD);
		
	}
	
	/**
	 * dog eat given amount of food.
	 * parse amount as a double
	 * @param amount
	 * @return new weight
	 */
	public double eat(String amount) {
		
		double returnVal = 0.0;
		
		try {
			//parse given amount as a double
			double amountAsDouble  = Double.parseDouble(amount);
			returnVal = this.eat(amountAsDouble);
		} catch (NumberFormatException e) {
			System.out.println(amount + " can't be parsed as bouble.");
		}
		return returnVal;
	}
	
	/**
	 * dog makes given number of bark sound given num of times.
	 * @param numTimes
	 * @param barkSound
	 */
	public void bark(int numTimes, String barkSound) {
		//print dog's name
		System.out.println(this.name + " says: ");
		
		//iterate based on given number of times
		for (int i = 0; i < numTimes; i++) {
			System.out.println(barkSound);
		}
		
		System.out.println();		
	}
	/**
	 * dog makes given number of bark sound given num of times.
	 * @param barkSound
	 * @param numTimes
	 */	
	public void bark(String barkSound, int numTimes) {
		this.bark(numTimes, barkSound);
		
	}
	/**
	 * dog makes generic bark sound default number of times.
	 */
	
	public void bark() {
		this.bark(dog.DEFAULT_NUM_TIME, dog.DEFAULT_BARK);
	
	}
	
	/**
	 * return current weight
	 * @return
	 */
	public double getWeight() {
		return this.weight;
	}
	
	/**
	 * set dog's name
	 * @param name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * set dog's owner
	 * @param owner to set 
	 */
			
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
	 * returns string representing dog
	 */
	public String toString(){
		return this.name + ", " + this.weight + ", " + this.age + ", " + this.owner;
		
	}	
	
	public static void main(String[] args) {
		
		// create dog using first constructor
		dog dog1 = new dog("Princess", 12.7, "Brandon", 9.3);
		
		// create dog using second constructor
		dog dog2 = new dog ("Fido", 5.5);
		
		// create dog using third constructor
		dog dog3 = new dog();
		
		//print dogs
		//call the toSting method in the dog class
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);

		System.out.println("\n");
		
		//set new name for dog3
		dog3.setName("Samantha");
		System.out.println(dog3);
		
		//call first eat method
		//print new weight
		System.out.println(dog1.eat(2.1, "Beneful"));
		
		//call second eat method
		System.out.println(dog2.eat(1.1));
		
		//call second eat method with int(widening);
		//print new weight
		System.out.println(dog3.eat(1));
		
		//call third version eat method
		System.out.println(dog3.eat("12.3"));
		
		//call third that cannot be parsed as double
		dog3.eat("twelve");
		
		System.out.println(dog3.getWeight());
		
		//call the first bark method
		dog1.bark(2, "Woof!");
		
		//call the second bark method
		dog1.bark("Help me!", 1);
		
		//call the third back method
		dog1.bark();
		
	}
}
