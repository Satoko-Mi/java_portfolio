/**
 * represents a studen in the class.
 * Each student has a name and ID.
 * @author X1 Yoga
 *
 */
public class Student {
	//instance vars
	
	/**
	 * Name of student.
	 */
	
	String name;
	
	/**
	 * ID of student.
	 */
	String ID;
	
	//constructor
	
	/**
	 * creats a student with the given name and ID.
	 * @param name of student
	 * @param ID for student
	 */
	public Student(String name, String ID) {
		this.name = name;
		this.ID = ID;
		
	}
	
	//returns student name
	public String toString() {
		return this.name;
	}

}
