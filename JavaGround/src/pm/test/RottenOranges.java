package pm.test;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
	public static int orangesRotting(int[][] grid) {
	        if(grid == null || grid.length == 0)
	        	return 0;
	        int rows = grid.length;
	        int cols = grid[0].length;
	        //queue for storing rotten oranges, so that we can poll and move in all directions.
	        Queue<int[]> q = new LinkedList<>();
			int count_fresh = 0;
			for(int i = 0; i < rows; i++)
			{
				for(int j = 0; j < cols; j++) {
					if(grid[i][j] == 2)
						q.offer(new int[] {i, j});
					else if(grid[i][j] == 1)
						count_fresh++;
				}
			}
			if(count_fresh == 0) return 0;
			int days = 0;
			int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
			while(!q.isEmpty() && count_fresh > 0) {
				days++;
				int size = q.size();
				for(int i = 0; i < size; i++) {
					int[] curr = q.poll();
					for(int[] dir: dirs) {
						int x = curr[0] + dir[0];
						int y = curr[1] + dir[1];
						if(x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || grid[x][y] == 2)
							continue;
						grid[x][y] = 2;
						count_fresh--;
						q.add(new int[] {x,y});
					}
					
				}
			}
			return (count_fresh == 0) ? days : -1;
	    }
	 
	public static void main(String[] args) {
		int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
		System.out.println(orangesRotting(grid));
	}
}
