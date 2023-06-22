/**
 * represents a dog.
 * @author X1 Yoga
 *
 */

public class Dog extends Animal {
	
	@Override
	public void greeting() {
		System.out.println("I am a dog.");
		super.greeting();//call greeting method in superclass animal
		
	}
	
	

}
