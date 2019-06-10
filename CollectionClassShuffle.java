/**
 * 
 */
package practiceLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Nicola
 *
 */
public class CollectionClassShuffle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create an arraylist of ints
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		//shuffle the list of numbers
		Collections.shuffle(list, new Random());
		System.out.println(list);

		
	}

}
