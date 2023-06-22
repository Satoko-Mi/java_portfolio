package pet;

/**
 * represents a cat, and is a subclass of abstract class Pet.
 * @author X1 Yoga
 *
 */
public class Cat extends Pet {
	
	//static variable
	
	/**
	 * default sound for all cats.
	 * Only accessible within this class.
	 */
	private static String SOUND = "Meow!";
	
	//instance variable
	
	/**
	 * type of cat
	 * only accessible from within this class.
	 */
	private String type;
	
	//constructor
	/**
	 * create a cat with given name, age, weight, and type
	 * @param name 
	 * @param age
	 * @param weight
	 * @param type
	 */
	public Cat(String name, int age, double weight, String type) {
		//must call constructor in superclass pet
		
		//set age, name, weight of cat
		super(age, name, weight);
		
		//set type of cat
		this.type = type; 
		
	}
	
	//get and setter
	/**
	 * gets the type of cat
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * sets the type of cat
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	//inherited abstract methods
	//must override and implement these (provide bodies)
	/**
	 * cat makes sound.
	 */
	@Override
	public void makeSound() {
		// must override sounds
		System.out.println(Cat.SOUND);
	}

	/**
	 * Returns name and type of cat for printing /debugging
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " is a " + this.type;
	}

}
