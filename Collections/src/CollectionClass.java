import java.util.*;
/**
 * Class with various methods for using different kinds of collections
 * @author X1 Yoga
 *
 */
public class CollectionClass {

	/**
	 * takes a given list and removes elements in the range min through max (inclusive).
	 * To demonstrate  use or Iterator
	 * @param list
	 * @param min
	 * @param max
	 */
	
	public static void removeRange(ArrayList<Integer> list, int min, int max) {
		//create iterator to riterate over list aand remove items in place
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			if (next >= min && next <= max) {
				iterator.remove();
			}
		}
	}
	
	/**
	 * takes given arraylist and modifies the list by placing a "*" in between each element, and at the beggining and the end
	 * @param list of values to add stars
	 */
	public static void addStars(ArrayList<String> list) {
		//copy all values in arraylist to array
		//toArray takes as input an empty array into which the values will be stored
		String[] array = list.toArray(new String[list.size()]);
		
		//empty original arraylist
		list.removeAll(Arrays.asList(array));
		
		//add stars and values back into original arraylist
		list.add("*");
		for (String s : array) {
			list.add(s);
			list.add("*");
		}
	}
	
	/**
	 * takes the given array of strings and returns a map with a key for each different string,
	 * and a value for the count of the number of times that string appears in the array.
	 * Case-sensitive. e.g., "Hello" and "hello" are considered different words.
	 * demonstrates user of HashMap
	 * @param strings to count
	 * @return map of word counts, where key is word and value is count
	 */
	public static Map<String, Integer> wordCount(String[] strings){
		//create a hashmap (has no order)
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//iterate over array of strings
		for (String s : strings) {
			//if map doesn't have key for string, add it;
			if (!map.containsKey(s)) {
				//add key with default count 1
				map.put(s, 1);
			} else {
				//replace old count with incremented count
				map.replace(s, map.get(s) + 1);	
			}
		}
		
		return map;
	}
	
	/**
	 * takes an array of strings and returns a count of the unique words in the array.
	 * 
	 * demonstrates use of HashSet.
	 * 
	 * @param words to count
	 * @return count of unique words
	 */
	public static int countUniqueWords(String[] words) {
		
		//create hashset (has no order) of words in given array
		Set<String> hashSetWords = new HashSet<String>(Arrays.asList(words));
		
		//return count of unique elements in given array
		//since hashset cannot have duplicated values
		//HashSet will automatically remove the duplicates
		return hashSetWords.size();
	}
	
	/**takes a map of food keys and food topping values, and modifies and returns the map
	 * as follows:
	 * if the key "ice cream" is present, set its value to "cherry"
	 * In all cases, set the key "bread" to have the value of "butter"
	 * @param map of food items and toppings
	 * @return updated map of food items and toppings
	 */
	public static Map<String, String> setToppings(Map<String, String> map){
		//add key "bread" and value "butter", if its not in map
		
		if (!map.containsKey("bread")) {
			map.put("bread", "butter");
		}
		
		//if key is "ice cream", set the value to "cherry"
		if (map.containsKey("ice cream")) {
			map.replace("ice cream", "cherry");
		}
		
		return map;
		
	}
	
	public static void main(String[] args) {
	
		//remove range
		//create array of list
		Integer[] removeRangeArray = {7, 9, 4, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//add all items from array to arraylist
		//before doing that, generic array is converted to arraylist using Arrays class's asList method.
		list.addAll(Arrays.asList(removeRangeArray));
		
		CollectionClass.removeRange(list, 5, 7);
		
		//print output
		System.out.println("removeRange: " + list);
		System.out.println();
		
		//addStars
		//create array of strings
		String[] addStar = {"the","quick", "brown", "fox"};
		
		//add all items in array to arraylist
		ArrayList<String> sList = new ArrayList<String>();
		sList.addAll(Arrays.asList(addStar));
		
		CollectionClass.addStars(sList);
		System.out.println("addStars: " + sList);
		System.out.println();
		
		//wordCount
		String[] strings = {"a", "b", "a", "c", "b"};
		Map<String, Integer> ret = CollectionClass.wordCount(strings);
		
		System.out.println("wordCount: " + ret);
		System.out.println();
		
		//count unique words
		String[] countUniqueWordsArray = {"hello", "izzy", "and", "Elise", 
				"and", "Louise", "and", "Hello"};
		
		System.out.println("countUniqueWords: " 
				+ CollectionClass.countUniqueWords(countUniqueWordsArray));
		System.out.println();
		
		//setToppings
		//create hasmap with food items and toppings
		Map<String, String> food = new HashMap<String, String>();
		
		food.put("ice cream", "peanuts");
		
		Map<String, String> m = CollectionClass.setToppings(food);
		System.out.println("setToppings: " + m);
		System.out.println();
		
	}
}
