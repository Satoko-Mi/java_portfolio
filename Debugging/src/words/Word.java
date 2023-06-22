package words;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * represents a word with functionality for counting syllables.
 * @author X1 Yoga
 *
 */
public class Word {
	
	/**Clean text for word.
	 * 
	 */
	
	private String text;
	
	//constructor
	
	public Word(String s) {
		//trim beginning of word;
		int i = 0;
		
		while (i < s.length() && !Character.isLetter(s.charAt(i))) {
			i++;
		}
		
		//trim end of word
		
		int j = s.length() - 1;
		
		while (j > i && !Character.isLetter(s.charAt(j))) {
			j--;
		}
		
		//gets a substring of given s based on i and j
		//stores it as text for word
		//e.g. 123hello321 will be stored as hello.
		this.text = s.substring(i, j + 1);
	}
	
	/**
	 * counts the syllables in the word.
	 * bases count of syllables on location of vowels in the word.
	 * @return syllable count
	 */
	public int countSyllables() {
		
		//set initial count of syllables
		int count = 0;
		//get index of last character in word
		int end = this.text.length() -1;
		
		// if word has no chars, consider 0 syllables
		if (end < 0) {
			return 0;	
		}
		
		//an e at the end of the word doesn't count as beginning of syllable
		//so decrement end index
		char ch = this.text.charAt(end);
		if (ch == 'e' || ch == 'E') {
			end--;
		}
		
		//set flag for being inside a syllable
		boolean insideSyllable = false;
		
		//iterate over characters in word and look for vowels
		for (int i = 0; i <= end; i++) {
			//get each character
			ch = this.text.charAt(i);
			
			//determine if character is a vowel
			//create a character class using regular expression
			//containing every vowel we're looking for (lower and upper) in word
			String vowelRegex = "[aeiouAEIOU]";
			
			//create pattern to match with character
			Pattern p = Pattern.compile(vowelRegex);
			
			//find matches in char casted to as string
			Matcher m = p.matcher(ch + "");
			
			if (m.matches()) {
				if(!insideSyllable) {
					count++;
					insideSyllable = true;
				}
			}else {
				insideSyllable = false;
			}
		}
		
		//every word has at lease one syllable
		if (count == 0) {
			count = 1;
		}
		
		return count;
	}
	
	/**
	 * get word text 
	 * @return
	 */
	public String getText() {
		return this.text;
	}
	
}
