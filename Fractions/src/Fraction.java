/**
 * represents a fraction with numerator and denominator.
 * @author X1 Yoga
 *
 */
public class Fraction {
	
	//instance vars
	
	/**
	 * numerator for fraction.
	 */
	
	int numerator;
	
	/**
	 * numerator for fraction.
	 */	
	
	int denominator;
	
	//constructor
	
	/**
	 * creates a fraction with the given numerator and denominator.
	 * @param numerator
	 * @param denominator
	 */
	
	/**
	 * compares two fractions for equality by comparing their numerators and denominators.
	 */
	@Override
	public boolean equals(Object obj) {
		//cast given object to fraction
		Fraction otherFraction = (Fraction) obj;
		
		//compare numerator and denominator of both fractions
		return (this.numerator  == otherFraction.numerator 
				&& this.denominator == otherFraction.denominator);
		
	}
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	/**
	 * denominator for fraction.
	 */
	
	public static void main(String[] args) {
		

	}

}
