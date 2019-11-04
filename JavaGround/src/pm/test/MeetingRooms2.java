package pm.test;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms2 {
	  public int minMeetingRooms(int[][] intervals) {
		  if(intervals.length == 0)
			  return 0;
		  Arrays.sort(intervals,(a,b)->a[0]-b[0]);
		  PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		  queue.add(intervals[0][1]);
		  for(int i = 1; i < intervals.length; i++) {
			  int endTime = queue.peek();
			  if(intervals[i][0] < endTime)
				  queue.add(intervals[i][1]);
			  else {
				  queue.poll();
				  queue.add(intervals[i][1]);
			  }
		  }
		  return queue.size();
		  
	  }
	  
	  
	  public static void main(String args[]) {
		  int[][] intervals = {{0,30},{5,10},{15,20}};
		  MeetingRooms2 obj = new MeetingRooms2();
		  int result = obj.minMeetingRooms(intervals);
		  System.out.println(result);
	  }
}
