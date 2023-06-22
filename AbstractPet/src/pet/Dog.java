package pet;

/**
 * represents a dog, and is a subclass of abstract class Pet.
 * @author X1 Yoga
 *
 */
public class Dog extends Pet {
	//static variable
	
	/**
	 * default sound for all dogs.
	 * only accessbule within this class.
	 */
	private static String SOUND = "Bark!";
	
	//instance var
	
	/**
	 * Breed of dog
	 * only accessible from within the this class
	 */
	private String breed;
	
	//constructor
	/**
	 * creates a dog with a give name, age, weight, and breed.
	 * @param name of dog
	 * @param age of dog
	 * @param weight of dog
	 * @param breed of dog
	 */
	public Dog(String name, int age, double weight, String breed) {
		//calling superclass constructor
		super(age, name, weight);
		//setting breed for a dog
		this.breed = breed;
	}

	//getters and setters
	/**
	 * gets the breed dog 
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * sets ths breed of dog
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	//inherited abstract methods
	//must override and implement these provide bodies

	/**
	 * makes dog sound.
	 */
	@Override
	public void makeSound() {
		System.out.println(Dog.SOUND);
	}
	
	/**
	 *returns the name and breed of dog for printing/debugging. 
	 */
	
	@Override
	public String toString() {
		return this.name + " is a " + this.breed;
	}

}
