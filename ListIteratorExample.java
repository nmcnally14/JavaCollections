/**
 * 
 */
package practiceLists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Nicola
 *
 */
public class ListIteratorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		//list iterator
		ListIterator<Integer> listIt = list1.listIterator(list1.size());
		
		//show last item
		while (listIt.hasPrevious())	{
			System.out.println(listIt.previous());
		}
		

	}

}
