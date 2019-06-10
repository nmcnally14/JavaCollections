/**
 * 
 */
package practiceLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Nicola
 *
 */
public class ListsExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create a list (of type ArrayList)
		List<String> arrList = new ArrayList<String>();
		arrList.add("Belfast");
		arrList.add("Dublin");
		System.out.println(arrList);
		
		//create a list (of type LinkedList)
		List<String> lnkList = new LinkedList<String>();
		lnkList.add("London");
		lnkList.add("Cardiff");
		System.out.println(lnkList);
		
		showAll(arrList);
		
		showAll(lnkList);
		
		showAll(arrList);
	}
	
	public static void showAll(ArrayList<String> arrayList)	{
		//for each
		for (String s : arrayList)	{
			System.out.println("\nArray List: "+s);
		}
	}
	
	public static void showAll(List<String> list)	{
		//for each
		for (String s : list)	{
			System.out.println("\nList: "+s);
		}
	}
	
	public static void showAll(Collection<String> collection)	{
		//for each
		for (String s : collection)	{
			System.out.println("\nCollection: "+s);
		}
	}

}
