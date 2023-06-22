package People;

//Represent a person.
public class Person {
	
	//instance variables
	
	//name of person
	String name;
	
	//age or person
	int age;
	/**
	 * Creates a person with given name and age.
	 * @param name
	 * @param age
	 */
	

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	/**
	 * Compares instances of person based on name.
	 * If two people have the same name, they are equal.
	 */
	public boolean equals(Object something) {
		Person OtherPerson = (Person) something;
		// returns true if names of tow people are the same 
		return this.name.equals(OtherPerson.name);
		
	}
}
