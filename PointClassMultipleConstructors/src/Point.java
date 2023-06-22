/**
 * represents a point with x and y
 * @author X1 Yoga
 *
 */
public class Point {
	//instance vars
	
	/**
	 * x, y, and sum of x,y
	 */
	int x;
	int y;
	int sum;
	
	/**
	 * creats a point at the given x and y
	 * @param x for point
	 * @param y for point
	 */
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.sum = x + y;
	}
	
	/**
	 * creats a point at 0,0
	 */
	public Point() {
		//call first constructor with default values
		this(0,0);
		//this.sum = x + y;
	}

	public static void main(String[] args) {
		Point point1 = new Point(2,4);
		System.out.println(point1.x);
		System.out.println(point1.y);
		System.out.println(point1.sum);
		
		Point point2 = new Point();
		System.out.println(point2.x);
		System.out.println(point2.y);
		System.out.println(point2.sum);
	}

}
