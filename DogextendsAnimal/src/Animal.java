/**
 * superclass reprenting an Anmal
 * 
 */

public class Animal {
	
	public void greeting() {
		System.out.println("I am an animal.");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.greeting();

	}

}
