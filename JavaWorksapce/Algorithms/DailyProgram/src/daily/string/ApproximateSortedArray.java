package daily.string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ApproximateSortedArray {
	public static void sortApproximatelySortedData(Iterator<Integer> iter,int k) { 
		 
		
		PriorityQueue<Integer> minHeap=new PriorityQueue(); 
		
	/*	for(int i=0;i<k && iter.hasNext(); ++i) { 
			minHeap.add(iter.next()); 
		} 
		
		while(iter.hasNext()) { 
			minHeap.add(iter.next()); 
			Integer smallest=minHeap.remove(); 
			System.out.println(smallest);
		}
		
		while(!minHeap.isEmpty()) { 
			Integer smalles =minHeap.remove(); 
			System.out.println(smalles);
		}*/
		
		while(iter.hasNext()) { 
			minHeap.add(iter.next()); 
		}
		
		while(!minHeap.isEmpty()) { 
			System.out.println(minHeap.remove());
		}
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ApproximateSortedArray A=new ApproximateSortedArray(); 
		
		A.sortApproximatelySortedData(Arrays.asList(3,-1,2,6,4,5,8).iterator(),2);
		

	}

}
