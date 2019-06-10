/**
 * 
 */
package practiceLists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Nicola
 *
 */
public class CollectionsClassSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		//create and display a list containing the suit array elements
		List<String> list = Arrays.asList(suits); //create list
		System.out.printf("Unsorted array elements : %s \n",list);
		
		//sort ArrayList
		Collections.sort(list);

		//output list
		System.out.printf("Sorted array elements : %s\n", list);
		
		//sort in descending order using a comparator
		Collections.sort(list, Collections.reverseOrder());
		
		//output list
		System.out.printf("Sorted array elements: %s\n",list);
	}

}
