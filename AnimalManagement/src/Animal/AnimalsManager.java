package Animal;

import java.util.ArrayList;

/**
 * a class for namaging animals
 * @author X1 Yoga
 *
 */
public class AnimalsManager {
	
	//instance vars
	
	ArrayList<Animal> animals;
	
	//constructor
	
	/**
	 * creats AnimalsMnager and initializes list of all animals.
	 */
	public AnimalsManager() {
		//initializes animals ArrayList
		this.animals = new ArrayList<Animal>();
	}
	
	//methods
	
	/**
	 * print the list of animals.
	 */
	public void printAnimals() {
		//iterates over list of animals and print each one
		for (Animal a: this.animals) {
			//this calls the toString method in the respective animal class
			//toString in Animal class or overridden to String in subclass of Animal
			System.out.println(a); 
			
		}
	}
	
	/**
	 * tells all animals to speak
	 */
	public void animalsSpeak() {
		for (Animal a : this.animals) {
			//this will call the speak method in the respective animal class
			//speak in Animal class or overridden speak in subclass of Animals
			a.speak();
		}
	}

	public static void main(String[] args) {
		//create generic animal
		
		Animal animal = new Animal(2);
		animal.setName("Bob the animal");
		
		//print the animal
		//this calls toString Defined in Animal class
		System.out.println(animal);
		
		//create a dog
		Dog dog1 = new Dog(4, "Pug");
		//calls setName defined in Animal class
		dog1.setName("Puggles"); 
		
		Dog dog2 = new Dog(9, "Pug");
		
		//call setname defined in Animal class
		dog2.setName("Puggles");
		
		//create a cat
		Cat cat1 = new Cat(8);
		//call setName defined in Animal Class
		cat1.setName("Teddy");
		//calls setType defined in Cat class
		cat1.setType("outside");
		
		//calls toString defined in Cat Class
		System.out.println(cat1);
		
		//instant of anamalsmanager
		AnimalsManager animalsManager = new AnimalsManager ();
		
		//add each animal to arraylsit animals
		animalsManager.animals.add(animal);
		animalsManager.animals.add(dog1);
		animalsManager.animals.add(dog2);
		animalsManager.animals.add(cat1);
		
		//print all animals in anamals manager
		System.out.println("");
		animalsManager.printAnimals(); //calls toString in each class
		
		animalsManager.animalsSpeak(); //calls speak in each class
		
		//compare dog1 to dog2
		//are they equal?
		System.out.println("");
		System.out.println("dog1.equals(dog2): " + dog1.equals(dog2));
		
		dog2.setBreed("Golden retriever");
		
		System.out.println("dog1.equals(dog2): " + dog1.equals(dog2));
		
		
		
	}
	

}
