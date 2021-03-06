package pm.test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class ExamRoom {
	
	PriorityQueue <Interval> pq = new PriorityQueue<>();
	int N;

	class Interval{
		int x,y,dist;
		public Interval(int x, int y) {
			this.x = x;
			this.y = y;
			if(x==-1) this.dist = y;
			else if(y == N) this.dist = N - 1 - x;
			else this.dist = Math.a	bs(x - y)/2;
		}
	}
	
    public ExamRoom(int N) {
        this.pq = new PriorityQueue<>((a,b) -> 
        (a.dist != b.dist ? b.dist - a.dist : a.x - b.x));
        this.N = N;
        pq.add(new Interval(-1,N));
    }
    
    public int seat() {
         int seat = 0;
         Interval interval = pq.poll();
         if(interval.x == -1) seat = 0;
         else if(interval.y == N) seat = N - 1;
         else seat = (interval.x + interval.y)/2;
         
         
         pq.offer(new Interval(interval.x, seat));
         pq.offer(new Interval(seat, interval.y));
         return seat;
        }
    
    public void leave(int p) {
    	Interval head = null, tail = null;
    	List<Interval> intervals = new ArrayList<>(pq);
    	for(Interval interval: intervals) {
    		if(interval.x == p) tail = interval;
    		if(interval.y == p) head = interval;
    		if(head != null && tail != null) break;
    	}
    	pq.remove(head);
    	pq.remove(tail);
    	pq.offer(new Interval(head.x, tail.y));
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(N);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */
