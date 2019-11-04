package pm.test;

import java.util.Scanner;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
    	int n = grid.length;
        if (n == 0) return 0;
        
        int number_of_islands = 0;
        for(int i = 0 ; i < n; i++) {
        	for(int j = 0; j < grid[i].length; j++) {
        		if(grid[i][j] == '1')
        			number_of_islands+=dfs(grid,i,j);
        	}
        }
        return number_of_islands;
    }
    
    public int dfs(char[][] grid, int i, int j) {
    	if (i < 0  || i >= grid.length || j < 0 || j >= grid[i].length)
    		return 0;
    	grid[i][j] = 0;
    	dfs(grid,i+1,j);
    	dfs(grid,i-1,j);
    	dfs(grid,i,j+1);
    	dfs(grid,i,j-1);
    	return 1;
    }
    
}
