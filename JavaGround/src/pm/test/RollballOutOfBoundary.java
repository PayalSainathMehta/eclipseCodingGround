package pm.test;

public class RollballOutOfBoundary {
	
	//complexity is N*m*n*4 ~ N, m , n all lie between 1 - 50. worst case its constant time.
	public int findPaths(int m, int n, int N, int i, int j) {
		int result = 0;
		if(N <= 0) return 0;
		int MOD = 1000000007;
		int[][]count = new int[m][n];
		count[i][j] = 1;
		int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
		for(int step = 0; step < N; step++) {
			int temp[][] = new int[m][n];
			for(int r = 0; r < m; r++) {
				for(int c = 0; c < n; c++) {
					for(int[] dir: dirs) {
						int dr = r + dir[0];
						int dc = c + dir[1];
						if(dr < 0 || dc < 0 || dr >= m || dc >= n)
							result = (result + count[r][c]) % MOD;
						else
							temp[dr][dc] = (temp[dr][dc] + count[r][c]) % MOD;
					}
				}
			}
			//temp stores the kth move while count stores the k-1th move
			count = temp;
		}
		return result;
	}
	
	public static void main(String args[]) {
		RollballOutOfBoundary obj = new RollballOutOfBoundary();
		System.out.println(obj.findPaths(1, 3, 3, 0, 1));
		
	}

}
