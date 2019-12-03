package pm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


public class CourseSchedule2 {
	//This one wants us to return the order in which we should take courses.
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		int edgecount = prerequisites.length;
        int[] order = new int[numCourses];
    	int[] indegree = new int[numCourses];
    	List<Integer>[] graph = new List[numCourses];
    	buildGraphAndIndegreeList(graph, indegree, prerequisites);
    	
    	
    	//System.out.println(Arrays.toString(indegree));
    	//Queue for traversing 
    	Queue<Integer> q  = new LinkedList<>();
    	for(int i = 0; i < indegree.length; i++)
    		if(indegree[i] == 0)
    			q.add(i);
        int i = 0;
    	while(!q.isEmpty()) {
    		int curr = q.poll();
            order[i++] = curr;
    		//System.out.println(graph[curr]);
    		for(int course: graph[curr]) {
    			//System.out.println(course);
    			edgecount--;
    			indegree[course]--;
    			if(indegree[course] == 0)
    				q.add(course);
    		}
    	}
    	
    	if(edgecount != 0)
            return new int[0];
        return order;
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
    	CourseSchedule2 obj = new CourseSchedule2();
    	int[][] a = {{0,1},{0,2},{1,2}};
    	int[] result = obj.findOrder(3, a);
    	System.out.println(Arrays.toString(result));
    }
    
    

}
