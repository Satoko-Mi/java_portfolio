import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * contains various methods for parsing strings basedon regular expressions.
 * @author X1 Yoga
 *
 */
public class RegexClass {

	/**
	 * prints given array of Strings
	 * @param arr
	 */
	public static void printTokens(String[] arr) {
		String finalS = "";
		System.out.println("Printing token: ");
		
		//iterate over given array and concatenate each string,
		//followed by comma and single space
		
		for (String s : arr) {
			finalS += (s + ", ");
		}
		
		//remove last 2 chars (comma and single space)
		finalS = finalS.substring(0, finalS.length() - 2);
		System.out.println(finalS);
		System.out.println();
	}
	
	/**
	 * Splits the given string based on the given regex pattern.
	 * @param str to split
	 * @param regrex pattern to match
	 * @return String array of tokens (strings)
	 */
	public static String[] splitString(String str, String regrex) {
		//split given string based on given regex
		return str.split(regrex);
		
	}
	
	/**
	 * replaces all instances of the given pattern (regex)
	 * with the given replacement in the given String str.
	 * @param str
	 * @param pattern
	 * @param replacement
	 * @return
	 */
	public static String replaceAllWithPattern(String str, String pattern, String replacement){
		//replace the given pattern with the given replacement in str
		return str.replaceAll(pattern, replacement);
	}
	
	/**
	 * parses and returns various parts of a given phone.
	 * @param phone number to parse
	 * @param part of phone number to return: 1(area code), 2(prefix), and 3(number)
	 * @return
	 */
	public static String getPhonePart(String phone, int part) {
		if (part < 1 || part > 3) {
			throw new IllegalArgumentException("Part must be 1, 2, or 3.");
		}
		
		//parenthesis() indicate groups
		//[-.\\s]+ indicates a character class,
		//matching one of multiple characters (with repetition); -, ., whitespace
		//\b matches an empty string or non-word character,
		//at the beggining or end of the pattern
		
		String regex = "\\b(\\d{3})[-.\\s]+(\\d{3})[-.\\s]+(\\d{4})\\b";
		
		Pattern p =Pattern.compile(regex);
		Matcher m =p.matcher(phone);
		
		String phonePart = "";
		
		//matches entire phone number
		while(m.find()) {
			//get designated group
			phonePart = m.group(part);
		}
		
		return phonePart;
		
	}
	
	/**
	 * replaces the area code in the given phone number with the given new are code.
	 * @param phone to replace area code in
	 * @param newArea for phone
	 * @return update phone number
	 */
	public static String replaceAreaCode(String phone, String newArea) {
		
		//[0-9] indicates a character class
		//matching one of several characters: 0-9
		//{3} indicates exactly 3 in a row
		return phone.replaceFirst("[0-9]{3}", newArea);
		
	}
	public static void main(String[] args) {
	
		String str = "The cow jumped over the moon";
		//split the String based on single space
		String[] tokens = RegexClass.splitString(str, " ");
		RegexClass.printTokens(tokens);
		
		//split the String based on "the"
		tokens = RegexClass.splitString(str, "the");
		RegexClass.printTokens(tokens);
		
		str = "the	   cow	jumped over	the\n" + "	moon"; //\n is considered whitespace in regex
		
		//split the String based on various amounts of whitespace
		// \s matches a single whitespace character " "
		// \s+ matches 1 or more whitespace characters
		// because the \ (backslash) is a special character, 
		// we escape it with another \ (backslash)
		// so we use \\s+ to split string with one or more whitespace characters
		tokens = RegexClass.splitString(str, "\\s+");
		RegexClass.printTokens(tokens);
		
		String updatedStr= RegexClass.replaceAllWithPattern(str, "\\s+", " ");
		System.out.println("Replace whitespace: " + updatedStr);
		System.out.println("");
		
		//get parts of phone number
		String areaCode = RegexClass.getPhonePart("123-982-6343", 1);
		String prefix = RegexClass.getPhonePart("800 787    2394", 2);
		String lineNumber = RegexClass.getPhonePart("  508.717.0989    ", 3);
		
		System.out.println("Phone number parts: " + areaCode + " " + prefix + " " + lineNumber);
		System.out.println("");
		
		//replace area code
		String phone = "123-982-6342";
		String updatedPhone = RegexClass.replaceAreaCode(phone, "888");
		System.out.println("Updated phone: " + updatedPhone);
		System.out.println("");
		
		
	}

}
