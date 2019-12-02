package pm.test;

import java.util.Arrays;

public class BurstBalloons {
	public static int countArrows(int points[][]) {
		Arrays.sort(points,(a,b) -> a[1] - b[1]);
		//System.out.println(Arrays.deepToString(points));
		int pos = points[0][1];
		//System.out.println(pos);
		int count = 1;
		for(int i = 1; i < points.length; i++)
		{
			if(pos >= points[i][0])
				continue;
			count = count + 1;
			pos = points[i][1];
			//System.out.println(pos);
		}
		
		return count;
	}
	
	public static  void main(String args[]) {
		int[][] points = new int[][] {{2,8},{1,6},{7,12},{10,16}};
		int result = BurstBalloons.countArrows(points);
		System.out.println(result);
	}
}

