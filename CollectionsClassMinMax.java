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
public class CollectionsClassMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create the list of random numbers
		List<Integer> numbers = new ArrayList<>();
		for (int loop=1; loop < 10; loop++)	{
			numbers.add(new Random().nextInt(100));
		}
		
		System.out.println(numbers);
		
		//get the max and min values
		System.out.println("Max value : "+Collections.max(numbers));
		System.out.println("Min value : "+Collections.min(numbers));
	}

}
