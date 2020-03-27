package daily.string;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pri = new PriorityQueue<Integer>();

		pri.add(10);
		pri.add(4);
		pri.add(8);
		pri.add(2);
		pri.add(15);
		pri.add(1);

		System.out.println(pri);

		while (!pri.isEmpty()) {
			System.out.println(pri.poll());
		}

		Set setOfNumbers = new TreeSet<>();
		Queue queueOfNumbers = new PriorityQueue<>();
		// inserting elements into TreeSet and PriorityQueue
		setOfNumbers.add(202);
		setOfNumbers.add(102);
		setOfNumbers.add(503);
		setOfNumbers.add(33);
		queueOfNumbers.add(202);
		queueOfNumbers.add(102);
		queueOfNumbers.add(503);
		queueOfNumbers.add(33); // Iterating over TreeSet
		System.out.println("Iterating over TreeSet in Java");
		Iterator itr = setOfNumbers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// Iterating over PriorityQueue
		System.out.println("Iterating over PriorityQueue in Java");
		itr = queueOfNumbers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		} // Consuming numbers using from head in PriorityQueue
			 System.out.println("polling a PriorityQueue in Java");
			 while(!queueOfNumbers.isEmpty()){ System.out.println(queueOfNumbers.poll());
			 } 
	}
}
