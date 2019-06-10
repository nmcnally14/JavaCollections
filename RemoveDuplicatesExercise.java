/**
 * 
 */
package practiceLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @author Nicola
 *
 */
public class RemoveDuplicatesExercise {

	/**
	 * @param args
	 */
	
	public static void main(String[] args)	{
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(5);
		System.out.println(arrayList.toString());
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(2);
		linkedList.add(4);
		linkedList.add(5);
		System.out.println(linkedList.toString());
		
		removeDuplicates(arrayList, linkedList);
	}
	
	
	
	public static void removeDuplicates(Collection<Integer> originalList, Collection<Integer> listToRemove)	{
		for (Integer removeItem : listToRemove)	{
			
			if (originalList.contains(removeItem))	{
				//originalList.remove(removeItem);
			}
		}
		
		originalList.removeAll(listToRemove);
		
		System.out.println(originalList.toString());
	}

}
