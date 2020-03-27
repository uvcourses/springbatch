package daily.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MedianOfSequence { 
	
	
	private static final int DEFAULT_INITIAL_CAPACITY=16; 
	
	public void onlineMedian(Iterator<Integer> sequence) { 
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>(); 
		PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(DEFAULT_INITIAL_CAPACITY,Collections.reverseOrder());
	
	    while(sequence.hasNext()) { 
	    	int x=sequence.next(); 
	    	minHeap.add(x); 
	    	maxHeap.add(minHeap.remove()); 
	    	
	    	if(maxHeap.size() >minHeap.size()) { 
	    		minHeap.add(maxHeap.remove()); 
	    	}
	    	
	    	   System.out.println(minHeap.size() == maxHeap.size() ? 
	   	    		0.5 * (minHeap.peek() + maxHeap.peek()):(double)minHeap.peek());
	   	 
	    }
	 
	    
	}

	public static void main(String[] args) {
		MedianOfSequence m=new MedianOfSequence(); 
		m.onlineMedian(Arrays.asList(1,0,3,5,2,0,1).iterator());
	}

}
