package pm.test;

import java.util.Arrays;

public class MaximumStudsPlacement {
	public static int maxStudents(char[][] seats) {
        int count = 0;
        for(int i = 0; i < seats.length; i++){
        inner:    for(int j = 0; j < seats[i].length; j++){
                if(seats[i][j] == '#')
                    continue inner;
                else if(seats[i][j] == '.'){
//                  seats[i][j] = '$';
//                    System.out.println(Arrays.deepToString(seats));
                    if(bfs(seats,i,j) == 1)
                    {
                    	count++;
                    	seats[i][j] = '$';
                    }
                }
                    
            }
        }
        return count;
    }
	
	
    public static int bfs(char[][] seats, int i, int j) {
    	if(i-1 >= 0 && i+1 < seats.length && j-1 >= 0 && j+1 < seats[i].length) {
    		if(seats[i+1][j+1] != '$' && seats[i+1][j-1] != '$'
    				&& seats[i-1][j+1] != '$' && seats[i-1][j-1] != '$')
    			return 1;
    	}
    	if(i == 0 && j == 0) {
    		if(seats[i+1][j+1] != '$')
    			return 1;
    	}
    	
      	if(i == seats.length - 1 && j == seats[i].length - 1) {
    		if(seats[i-1][j-1] != '$')
    			return 1;
    	}
    	if(i == 0 && j-1 >= 0 && j+1 < seats[i].length){
    		if(seats[i+1][j+1] != '$' && seats[i+1][j-1] != '$')
    		 {
    			System.out.println(i + " " + j);
    			return 1;
    		}
    			
    	}
    	
    	if(i == seats.length-1 && j <= 0)
    		if(seats[i-1][j+1] != '$')
    			return 1;
    	
    	if(i == seats.length-1 && j-1 >= 0 && j+1 < seats[i].length)
    		if(seats[i-1][j+1] != '$' && seats[i-1][j-1] != '$')
    		 {
    			System.out.println(i + " " + j);
    			return 1;
    		}
    			
    	
    	if(j == 0 && i-1 >= 0 && i+1 < seats.length)
    		if(seats[i+1][j+1] != '$' && seats[i-1][j+1] != '$')
    		 {
    			System.out.println(i + " " + j);
    			return 1;
    		}
    			
    	
    	if(j == seats[i].length-1 && i-1 >= 0 && i+1 < seats.length)
    		if(seats[i+1][j-1] != '$' && seats[i-1][j-1] != '$') {
    			System.out.println(i + " " + j);
    			return 1;
    		}
    			
    	
    	return 0;
    }
	
	public static void main(String[] args) {
		char[][] seats = {{'.','#'},{'#','#'},{'#','.'},{'#','#'},{'.','#'}};
		System.out.println(maxStudents(seats));
	}
}
