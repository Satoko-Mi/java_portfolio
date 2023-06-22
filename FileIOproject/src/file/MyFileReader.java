package file;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.*;

/**
 * utility class for reading particular types of files.
 * @author X1 Yoga
 *
 */
public class MyFileReader {
	/**
	 * calculates the total sum of numbers in the given file
	 * returns 0.0 if there are no numeriacal values found or there is an error or exceptions
	 * @param fileName
	 * @return
	 * @throws FileNotFoundException if file is not found
	 */
	public static double readFileGetTotalSum (String fileName) throws FileNotFoundException {
		//create fiel
		File file = new File(fileName);
		
		//create default sum value
		double sum = 0.0;
		
		//create scanner with given file
		Scanner scanner = new Scanner(file);
		
		//while scanner has another token
		while (scanner.hasNext()){
			
			//get token as a double
			if (scanner.hasNextDouble()){
				double numDouble = scanner.nextDouble();			
				sum += numDouble;
			} else {
				//if it's not a double, skip it.
				scanner.next();
			}
		}
		
		//close scanner
		scanner.close();
		
		return sum;
		
	}
	
	/**
	 * calculates the sum of numbers in each line of the given fileName.
	 * @param fileName to read
	 * @return list of line sums
	 */
	public static ArrayList<Double> readFileGetLineSums(String fileName) {
		//create arraylist to store sum of numbers for each line of given file
		
		ArrayList<Double> lineSums = new ArrayList<Double>();
		
		//creat file object
		File file = new File(fileName);
		
		//create file reader
		FileReader fileReader = null;
		
		//define bufferedreader
		BufferedReader bufferedReader = null;
		
		try {
			fileReader = new FileReader(file);
			//create buffered reader
			bufferedReader = new BufferedReader(fileReader);
			String line;
			
			while ((line = bufferedReader.readLine()) != null) {
				//split line into tokens based on whitespace using regular expression \\s+
				//to indicate one or more instances or whitespace
				String[] numStringArray = line.trim().split("\\s+");
				
				//set default sum for line
				double sum = 0.0;
				
				//iterate over array of strings
				for (int i = 0; i < numStringArray.length; i++) {
					
					//get each value as a string
					String numString = numStringArray[i];
					
					try {
						//cast each value to a double
						double numDouble = Double.parseDouble(numString);
					
						//add to sum for line
						sum += numDouble;
					} catch (NumberFormatException e) {
						//gets and prints exception message
						System.out.println("Can't parse and add value. " + e.getMessage());
					}
				}
				//add line sum to list of sums
				lineSums.add(sum);
			}
			
		} catch (FileNotFoundException e) {
			//gets and prints filename
			System.out.println("Sorry, " + file.getName() + " not found.");
		} catch (IOException e) {
			//prints the error message and info about which line
			e.printStackTrace();
		} finally {
			
			//regardless, close file objects
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return lineSums;
		
	}
}
