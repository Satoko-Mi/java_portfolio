/**
 * represents a seat in a classroom.
 * Each seat has a row and column associated with it
 * it might have astudent assigned to it
 * @author X1 Yoga
 *
 */
public class Seat {
	//instance vars
	
	/**
	 * seat row
	 */
	int row;
	/**
	 * seat column
	 */
	int column;
	
	/**
	 * Student assigned to this seat, otherwise null.
	 */
	Student studentInseat;
	
	//constructor
	/**
	 * creats a seat for aclass at the given row and column.
	 * @param row
	 * @param column
	 */
	public Seat(int row, int column) {
		this.row = row;
		this.column = column;
		
	}
	
	// methods
	public void putStudentInSeat(Student student) {
		//assign to this given student to the seat
		this.studentInseat = student;
		
	} 
	
	/**
	 * returns the row, column, and student for this seat.
	 */
	public String toString() {
		return this.row + ", " + this.column + ": " + this.studentInseat; // this will also call the toString method in the student class
		
	}

}
