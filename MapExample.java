/**
 * 
 */
package practiceLists;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nicola
 *
 */
public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		String sentence = "to be or not to be";
		
		//create the HashMap
		Map<String, Integer> myMap = new HashMap<>();
		
		//tokenize the input
		String[] tokens = sentence.split(" ");
		
		//processing input text
		for (String token : tokens)	{
			if (myMap.containsKey(token))	{
				int count = myMap.get(token);
				
				//increase the count for this word
				myMap.put(token, count+1);
			} else	{
				//add new word with a count of 1 to map
				myMap.put(token, 1);
			}
			
			
		}
		System.out.println("\nMap contains: \nKey \t\tValue");
		
		//display all map content
		for (String key : myMap.keySet())	{
			System.out.printf("%-10s%10d \n",key, myMap.get(key));
		}
		
		//display a value based on a key
		if (myMap.containsKey("not"))	{
			System.out.println("Value for key \"not\" : "+myMap.get("not"));
		} else	{
			System.out.println("Key not found");
		}

	}

}
