package pm.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
	//synonymous to detecting cycle in a graph
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    	int edgecount = prerequisites.length;
    	int[] indegree = new int[numCourses];
    	List<Integer>[] graph = new List[numCourses];
    	buildGraphAndIndegreeList(graph, indegree, prerequisites);
    	
    	
    	System.out.println(Arrays.toString(indegree));
    	//Queue for traversing 
    	Queue<Integer> q  = new LinkedList<>();
    	for(int i = 0; i < indegree.length; i++)
    		if(indegree[i] == 0)
    			q.add(i);
    	while(!q.isEmpty()) {
    		int curr = q.poll();
    		//System.out.println(graph[curr]);
    		for(int course: graph[curr]) {
    			//System.out.println(course);
    			edgecount--;
    			indegree[course]--;
    			if(indegree[course] == 0)
    				q.add(course);
    		}
    	}
    	
    	return(edgecount==0);
    }
    
    public void buildGraphAndIndegreeList(List<Integer>[] graph, int[] indegree, int[][]prerequisites) {
    	for(int i = 0;i < graph.length;i++)
    		graph[i] = new LinkedList<Integer>();
    	
    	//incoming degree ++
    	//build graph
    	
    	for(int[] pair: prerequisites) {
    		indegree[pair[0]]++;
    		graph[pair[1]].add(pair[0]);
    	}
    	
    
    }
    
    
    public static void main(String args[]) {
    	CourseSchedule obj = new CourseSchedule();
    	int[][] a = {{0,1},{0,2},{1,2}};
    	boolean result = obj.canFinish(3, a);
    	System.out.println(result);
    }
    
    
}
