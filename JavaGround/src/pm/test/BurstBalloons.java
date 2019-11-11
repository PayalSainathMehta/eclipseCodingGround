package pm.test;

import java.util.Arrays;

public class BurstBalloons {
	public static int countArrows(int points[][]) {
		Arrays.sort(points,(a,b) -> a[1] - b[1]);
		int pos = points[0][1];
		int count = 1;
		for(int i = 1; i < points.length; i++)
		{
			if(pos >= points[i][0])
				continue;
			count = count + 1;
			pos = points[i][1];
		}
		
		return count;
	}
	
	public static  void main(String args[]) {
		int[][] points = new int[][] {{1,6},{2,8},{7,12},{10,16}};
		int result = BurstBalloons.countArrows(points);
		System.out.println(result);
	}
}

