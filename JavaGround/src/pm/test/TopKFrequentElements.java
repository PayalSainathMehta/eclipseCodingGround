package pm.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	
	//make hashmap - store counts
	//insert into min heap - pq
	//build final list
	
	
	static List<Integer> topKFrequent(int[]nums, int k){
		List<Integer> result = new ArrayList<>();
		//building the hashmap with counts
		Map<Integer,Integer> count = new HashMap<>();
		for(int i: nums)
			count.put(i,count.getOrDefault(i, 0) + 1);
		
		//storing in min heap.
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1,n2) -> count.get(n1) - count.get(n2));
		for(int key: count.keySet()) {
			heap.add(key);
			if(heap.size() > k)
				heap.poll();
		}
		//adding to final list then reversing
		while(!heap.isEmpty())
			result.add(heap.poll());
		Collections.reverse(result);
		
		return result;
	}
	public static void main(String[] args) {
		int[] nums  = {1,1,2,4,5,2,1,1};
		int k = 2;
		List<Integer> result = topKFrequent(nums,k);
		System.out.println(result.toString());
	}
}
