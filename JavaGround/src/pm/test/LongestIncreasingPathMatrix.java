package pm.test;


/*
 * This function returns the longest increasing path in a matrix.
 * example:- 
 * input:  [ 9 9 4
 *           6 6 8
 *           2 1 1]
 * output: 4 . [1,2,6,9]
 */
public class LongestIncreasingPathMatrix {
	private int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
	public int findPathLength(int[][] matrix) {
		int result = 0;
		if(matrix.length == 0)
			return 0;
		int m = matrix.length,n = matrix[0].length;
		int[][]cache = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				int current = dfs(matrix, cache, i, j, matrix[i][j]);
				result = Math.max(result, current);
			}
		}
		return result;
	}
	
	public int dfs(int[][]matrix, int[][] cache, int x, int y, int curPt) {
		if(cache[x][y] != 0) return cache[x][y];
		int dist = 1;
		for(int[]dir: dirs) {
			int dx = x + dir[0];
			int dy = y + dir[1];
			
			if(dx < 0 || dy < 0 || dx > matrix.length - 1 || dy > matrix[0].length - 1
					|| curPt >= matrix[dx][dy])
				continue;
			int current = 1 + dfs(matrix, cache, dx, dy, matrix[dx][dy]);
			dist = Math.max(dist, current);
		}
		cache[x][y] = dist;
		return dist;
	}
	
	
	public static void main(String args[]) {
		LongestIncreasingPathMatrix obj = new LongestIncreasingPathMatrix();
		int[][] matrix = {{9,9,4},{6,6,8},{2,1,1}};
		int result = obj.findPathLength(matrix);
		System.out.println(result);
	}
}
