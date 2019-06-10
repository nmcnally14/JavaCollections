/**
 * 
 */
package practiceLists;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Nicola
 *
 */
public class PriorityQueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create the queue
		Queue<Double> q = new PriorityQueue<Double>();
		
		//add in any order
		q.add(10.1);
		q.add(3.3);
		q.add(5.2);
		System.out.println("Queue order : "+q.toString());
		
		int loop = 1;
		while (loop <= q.size())	{
			//view and then remove each element (by order)
			System.out.println("Peek "+q.peek());
			q.remove();
		}

	}

}
