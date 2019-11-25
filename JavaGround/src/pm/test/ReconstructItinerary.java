package pm.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class ReconstructItinerary {
	
	  public List<String> findItinerary(String[][] tickets) {
		  List<String> route = new LinkedList();
		  Map<String, PriorityQueue<String>> targets = new HashMap<>();
		  for(String[] ticket: tickets)
			  {
			  targets.computeIfAbsent(ticket[0], k -> new PriorityQueue()).add(ticket[1]);

			  }
		  System.out.println(targets);
		  Stack<String> stack = new Stack<>();
		  stack.push("JFK");
		  while(!stack.empty()) {
			  System.out.println(targets);
			  //now we check if the stack element is present in key of targets and if present does it have a non null list of values
			  while(targets.containsKey(stack.peek()) && !(targets.get(stack.peek()).isEmpty()))
			  {// while it does we push to stack and poll from targets.
			  	stack.push(targets.get(stack.peek()).poll());
			  	System.out.println(targets);
			  }
			  //since stack is LIFO, we keep adding stack elements at 0th index, giving us the correct order
			  route.add(0,stack.pop());
		  }
		  
		  return route;
	  }

	public static void main(String[] args) {
		ReconstructItinerary obj = new ReconstructItinerary();
		String[][] tickets = {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
		List<String> route = obj.findItinerary(tickets);
		System.out.println(route.toString());
	}

}
