package Animal;

/**
 * represents a dog and extends the Animal class
 * @author X1 Yoga
 *
 */

public class Dog extends Animal {

	//instance var
	
	/**
	 * breed for dog.
	 */
	
	private String breed;
	
	//constructor
	/**
	 * Creates a dog with given age and breed
	 * @param age
	 * @param breed
	 */
	
	public Dog(int age, String breed) {
		//calls constructor in superclass Animal
		super(age);
		//sets breed of dog
		this.breed = breed;
	}
	
	//getter/setters
	
	/**
	 * gets the breed of dog
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * sets the breed of dog
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	//other methods
	
	/**
	 * override the speak method in superclass Animal
	 */
	@Override
	public void speak() {
		System.out.println(this.name + " says: fear my bark!");
		
	}
	
	/**
	 * returns the name and breed of dog for printing.
	 * @return
	 */
	@Override
	public String toString() {
		return this.name + " is a " + this.breed;
	}
	
	/**
	 * overrides the equals method in the object super class.
	 * compares tow dogs for equality based on their name and breed.
	 */
	
	@Override
	public boolean equals(Object obj) {
		
		//cast given object to a dog
		Dog otherDog = (Dog) obj;
		
		//compare the two dogs based on their name and breed
		return (this.name.equals(otherDog.name) && this.breed.equals(otherDog.breed));
		
		
		
	}
	

}
