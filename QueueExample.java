/**
 * 
 */
package practiceLists;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Nicola
 *
 */
public class QueueExample {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		//set the start time
		int time = 10;
		
		//create an implementation of a queue
		Queue<Integer> queue = new LinkedList<>();
		
		//populate the queue with the times between start and 0
		for (int i = time; i >= 0; i--)	{
			queue.add(i);
		}
		
		System.out.println("Queue items : "+queue.toString());
		
		//remove each item (from front of queue) and delay next removal
		//by 1 second
		while (!queue.isEmpty())	{
			System.out.println(queue.remove());
			Thread.sleep(1000);
		}

	}

}
