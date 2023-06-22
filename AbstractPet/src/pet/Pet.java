package pet;

import java.util.ArrayList;

/**
 * abstract class pet represents generic or abstract pet.
 * @author X1 Yoga
 *
 */
public abstract class Pet {
	
	//instance variables
	
	/**
	 * age of pet
	 * default (package-private access)
	 * accessble anywhere in the same package
	 */
	int age;
	
	/**
	 * name of pet
	 * default (package-private access)
	 * accessble anywhere in the same package
	 */
	String name;
	
	/**
	 * weight of pet
	 * default (package-private access)
	 * accessble anywhere in the same package
	 */
	double weight;
	
	//constructor
	/**
	 * called by subclasses of Pet to create instances of different types of pets
	 * @param age of pet
	 * @param name of pet
	 * @param weight of pet
	 */
	public Pet(int age, String name, double weight) {
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	//getters and setters
	
	/**
	 * gets  the weight
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * sets the weight
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}	
	
	//non-abstract method
	
	public void eatFood(Food food) {
		this.weight += (food.getCalories() / 100);
		
	}
	
	//abstract method
	/**
	 * forces all pets to make their own sound.
	 * All subclasses of Pet MUST implement this method.
	 */
	public abstract void makeSound();
	
	/**
	 * forces all pets to override toSting for printing.debugging
	 */
	
	@Override
	public abstract String toString();
	
	public static void main(String[] args) {
		
		//create lis of pets
		ArrayList<Pet> pets = new ArrayList<Pet>();
		
		//create dog 
		Dog dog = new Dog("Buster", 14, 100, "German Shepherd");
		
		//create cat
		Cat cat = new Cat("Snuggles", 3, 40, "House Cat");
		
		//add pets to list
		pets.add(dog);
		pets.add(cat);
		
		for (Pet p: pets) {
			//pet makes sound
			//abstract method in pet class
			//every subclass of pet must have this method implemented
			p.makeSound();
	
		}
		
		for (Pet p: pets) {
			//print pet
			//abstract method in pet class
			//every subclass of pet must have this method implemented
			System.out.println(p);
	
		}
		
		//call specific method in dog class
		String breed = dog.getBreed();
		System.out.println("dog breed: " + breed);
		
		//call specific method in cat class
		String type = cat.getType();
		System.out.println("cat type: " + type);		
		
		//calls non-abstract method in pet class
		System.out.println("dog's weight: " + dog.getWeight());
		
		Food food = new Food(1000);
		
		//call non-abstract method defined in pet class
		dog.eatFood(food);
		//get and print dog's new weight 
		System.out.println("dog's weight: " + dog.getWeight());	
		
	}

}
