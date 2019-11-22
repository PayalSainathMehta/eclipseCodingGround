package pm.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriticalConnections {
	 private int startTime = 1;
	 public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
		 	if(connections == null) return null;
	        List<List<Integer>> criticalConnections = new ArrayList<>();
	        dfs(buildGraph(n, criticalConnections), new int[n], 0, -1, criticalConnections);
	        return criticalConnections;
	    }
	 
	 
	 public int dfs(List<List<Integer>> graph, int[] visitedTime, int current, int parent, List<List<Integer>> criticalConnections) {
		 //already visited node - simply return its time
		 if(visitedTime[current] > 0)
			 return visitedTime[current];
		 int minVisitedTimeOfAllNeighbors = Integer.MAX_VALUE;
		 visitedTime[current] = startTime++;
		 for(int neighbor: graph.get(current)) {
			 //get neighbors of current node.
			 //if the neighbor is the one this node came from, its a back edge - ignore.
			 if(neighbor == parent)
				 continue;
			 //now get the visited time of the neighbor.
			 int neighborVisitedTime = dfs(graph, visitedTime, neighbor, current, criticalConnections);
			 //get minimum of all visited times till now.
			 minVisitedTimeOfAllNeighbors = Math.min(minVisitedTimeOfAllNeighbors, neighborVisitedTime);			 
		 }
		 
		 //main condition - if visited time of me is less than minimum visited time of all my neighbors
		 // then am the articulation point - am the critical point.
		 //add me to the critical connections.
		 if(visitedTime[current] <= minVisitedTimeOfAllNeighbors)
			 criticalConnections.add(Arrays.asList(parent, current));
		 //return whoever visited time is minimum - meaning we now need to find its neighbors and continue.
		 return Math.min(minVisitedTimeOfAllNeighbors, visitedTime[current]);
	 }
	 
	 
	 public List<List<Integer>> buildGraph(int n, List<List<Integer>> connections){
		 //adjacency matrix creation
		 List<List<Integer>> graph = new ArrayList<>();
		 for(int i = 0; i < n; i++)
			 graph.add(new ArrayList<>());
		 for(List<Integer> connection: connections) {
			 graph.get(connection.get(1)).add(connection.get(0));
			 graph.get(connection.get(0)).add(connection.get(1));
		 }
		 
		 return graph;
	 }
	 
}