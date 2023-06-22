package Animal;


/**
 * represents a cat and extends the animal class.
 * @author X1 Yoga
 *
 */
public class Cat extends Animal{
	
	//static vars
	
	/**
	 * default type for cat
	 */
	static String DEFAULT_TYPE = "domestic";
	
	//instance vars
	
	/**
	 * type of cat.
	 */
	private String type;
	
	//also inherits var defined in the Animal superclass.
	
	//constructor
	/**
	 * create a cat wit given age.
	 * @param age
	 */
	
	public Cat(int age) {
		//calls constructor of the superclass animal.
		super(age);
		//set type of cat to default value
		this.type = Cat.DEFAULT_TYPE;
		
	}
	
	//getters/setters
	/**
	 * get the type of cat
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
	
	//other methods
	
	/**
	 * overrrides speak method in super class Animal.
	 * Cat speaks
	 */
	@Override
	public void speak() {
		System.out.println(this.name + " says: Meow!");
	}

	/**
	 * returns the name and type of this cat for printing
	 */
	@Override
	public String toString() {
		return this.name + " is a " + this.type;
	}
}
