import java.util.ArrayList;

/**
 * represents a classroom with students
 * each classroom has a list of students
 * and array that represents the seats in the classroom
 * @author X1 Yoga
 *
 */
public class Classroom {

	//instance vars
	/**
	 * name of building
	 */
	String buildingName;
	
	/**
	 * name of classroom
	 */
	String roomName;
	
	/**
	 * List of students in the classroom.
	 */
	ArrayList<Student> students;
	
	/**
	 * seat in the classroom
	 */
	Seat[][] seats;
	
	//constructor
	
	/**
	 * creates a classroom with given building name, room name, number of rows or seats, and number of columns of seats.
	 * @param buildingName
	 * @param roomName
	 * @param rows for seats
	 * @param columns for seats
	 */
	public Classroom(String buildingName, String roomName, int rows, int columns) {
		// set buidling name
		this.buildingName = buildingName;
		
		//set room name
		this.roomName = roomName;
		
		//initialize seats array
		this.seats = new Seat[rows][columns];
		
		//populate seats array with instances of seat class
		// iterate over rows
		
		for (int i = 0; i < rows ; i++) {
			//iterate over columns
			for (int j=0; j < columns; j++) {
				//give each location its own new instance of seat class
				// given i(row) and j(column) location in the array.
				seats[i][j] = new Seat(i, j);
			}
		}
		
		//initialize list of students
		this.students = new ArrayList<Student>();
		

		}
	
	/**
	 * add the given student to list of students.
	 * 
	 */
	public void addAStudent(Student student) {
		this.students.add(student);
		
	}
	
	/**
	 * assign an available seat to a student
	 * @param student to assign
	 */
	
	public void assignStudentToSeat(Student student) {
		
		int rows = this.seats.length; //gets the number of rows of seats
		int columns = this.seats[0].length; //gets the number of columns of seats
		
		//iterate over the rows and columns
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				//gets seat in location and see if it's available
				if (this.seats[i][j].studentInseat == null) { // if null, no student has been assigned
					this.seats[i][j].putStudentInSeat(student); //put the student in the seat.
					//exit loop and method all at one
					return;
				}
			}
		}	
	}
	
	/**
	 * print all students in the classroom
	 */
	public void printAllStudents() {
		System.out.println("Students in class: ");
		
		for (Student student: this.students) {
			System.out.println(student);//this will call the toString method in the student  class
		}
	}
	
	/**
	 * returns layout of classroom, with the students info
	 */
	
	public String toString() {
		String s = "\n";
		
		int rows = this.seats.length; //gets the number of rows of seats
		int columns = this.seats[0].length; //gets the number of columns of seats
		
		//iterate over the rows and columns
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				s += this.seats[i][j] + "\t"; // calls the toString method in the seat class
			}
			s += "\n";//adds newline at end of each row
		}
		
		return s;
	}
	
	
	public static void main(String[] args) {
		//creat classroom
		Classroom hunstman = new Classroom("HH", "105", 10, 5);
		
		//creat students
		Student finegan = new Student("finegan", "fineganw");
		Student bob = new Student("bob", "roberts");
		
		//add students to classroom
		hunstman.addAStudent(finegan);
		hunstman.addAStudent(bob);
		
		//assign students to seats
		hunstman.assignStudentToSeat(finegan);
		hunstman.assignStudentToSeat(bob);
		
		//print list of all students in class
		hunstman.printAllStudents();
		
		//print classroom itself;
		System.out.println(hunstman); //this will alos clla the toString method in the classroom class
		
	}

}
