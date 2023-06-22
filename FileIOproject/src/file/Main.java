package file;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.*;

/**
 * controller class.
 * @author X1 Yoga
 *
 */
public class Main {

	public static void main(String[] args) {
		
		//name of file to read
		String fileName = "text.txt";
		//define default sum value
		
		double sum = 0.0;
		//try to get sum of numbers in file
		try {
		sum = MyFileReader.readFileGetTotalSum(fileName);
		} catch (FileNotFoundException e) {
			//prints error message and info about witch line
			e.printStackTrace();
		} finally {
			//prints the value of sum regardless of any exception
			System.out.println(sum);
		}
		
		//get list of line sums
		ArrayList<Double> lineSums = MyFileReader.readFileGetLineSums(fileName);
		
		System.out.println("total line sums: " + lineSums);
		
		//write list of sum values to new file
		MyFileWriter.writeFileLineSums("text_line_sums.txt", lineSums, false);
		
		
		
	}

}
