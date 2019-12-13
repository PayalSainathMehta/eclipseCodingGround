package pm.test;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
	 public static int[][] kClosest(int[][] points, int K) {
		    int[][] result = new int[K][2];
			PriorityQueue<int[]> pq = new PriorityQueue<int[]>
			//MAX HEAP
			( (p1,p2) -> (p2[0] * p2[0] + p2[1] * p2[1]) - (p1[0] * p1[0] + p1[1] * p1[1]));
		    for(int[] point: points) {
		    	pq.offer(point);
		    	if(pq.size() > K)
		    		pq.poll();
		    }
		    while(!pq.isEmpty())
		    	result[--K] = pq.poll();
		    
		    return result;
	 }   
	
		    
	public static void main(String[] args) {
		int[][] points = {{3,3},{5,-1},{-2,4}};
		int k = 2;
		int[][] result = kClosest(points, k);
		System.out.println(Arrays.deepToString(result));
	}
	}
