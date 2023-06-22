package Animal;

/**
 * represents a generic animal
 * we will create subclasses (dog, cat, etc.) that will inherit from this class.
 * @author X1 Yoga 
 *
 */
public class Animal {
	//static variables
	
	/**
	 * default age for animal.
	 */
	
	static int DEFAULT_AGE = 0;
	
	//instance vars
	
	/**
	 * age of animal
	 */
	int age;
	
	/**
	 * weight of the animal
	 */
	
	double weight;
	
	/**
	 * name of the animal
	 */
	String name;
	
	//Constructors
	
	/**
	 * creates an animal with given age.
	 * @param age of animal
	 */
	public Animal(int age) {
		this.age = age;
		
	}
	
	/**
	 * creates an animal with default age.
	 */
	public Animal() {
		//call the first constructor with the defaul age
		this(Animal.DEFAULT_AGE);
	}

	/**
	 * gets the name of the animal.
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the name of the animal.
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	//other methods
	public void speak() {
		System.out.println("Animal says hi.");
	}
	
	/**
	 * overrides toString in Object class.
	 */
	@Override
	public String toString() {
		return this.name;
	}
	
	

}
