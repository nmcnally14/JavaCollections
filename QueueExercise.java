/**
 * 
 */
package practiceLists;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Nicola
 *
 */
public class QueueExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		//populate with the names of 6 family members
		list.add("Nicola");
		list.add("Siobhan");
		list.add("Mum");
		list.add("Dad");
		list.add("Anne");
		list.add("Brenda");
		
		Queue<String> myQ = new PriorityQueue<>(list);
		
		//dequeue every 3 secs
		while (!myQ.isEmpty())	{
			System.out.println("Dequeue...");
			System.out.println(myQ.poll());
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Queue empty");

	}

}
