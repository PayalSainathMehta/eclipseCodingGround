package pm.test;

public class DiagonalTraverse {
	public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0  || matrix == null)
            return new int[0];
        int rows = matrix.length;
        int cols = matrix[0].length;
        int n = rows * cols;
        int res[] = new int[n];
        int r = 0;
        int c = 0;
        for(int i = 0; i < n; i++)
        {
            res[i] = matrix[r][c];
            //even
            if((r + c) % 2 == 0){
                if(r - 1 >= 0 && c + 1 < cols){
                    r = r - 1;
                    c = c + 1;
                }
                //only col space available
                else if(r - 1 < 0  && c + 1 < cols )
                    c = c + 1;
                //row space available
                else if(r + 1 < rows && c + 1 > cols - 1)
                    r = r + 1;
            }
            else{
                if(r + 1 < rows && c - 1 >= 0){
                    r = r + 1;
                    c = c - 1;
                }
                //only row space available
                else if(r + 1 < rows  && c - 1 < 0 )
                    r = r + 1;
                //only col space available
                else if(r + 1 > rows - 1 && c + 1 < cols)
                    c = c + 1;
            }
        }  
        return res;
        
    }
}
