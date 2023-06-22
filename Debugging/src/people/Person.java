package people;

import java.util.ArrayList;

/**
 * represents a person.
 * @author X1 Yoga
 *
 */
public class Person {
	//instance variables
	
	/**
	 * name of person
	 */
	private String name;
	
	//getter and setter
	
	/**
	 * gets name of person
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets name of person
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		//create list for people
		ArrayList<Person> people = new ArrayList<Person>();
		
		//creates and add person to list
		Person person = new Person();
		people.add(person);
		
		//give person a name
		person.setName("Brandon");
		
		//get first person name
		String firstName = people.get(0).getName();
		
		//get length of first person's name
		int firstNameLength = firstName.length();
		
		//print first name and length
		System.out.println(firstName + " has a length of " + firstNameLength);
		
		

	}


}
