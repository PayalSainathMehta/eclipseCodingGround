package pm.test;

import java.util.Arrays;

public class ClosestDivisors {
	public static int[] closestDivisors(int num) {
	  int[] result = new int[2];
       int d1 = largestDivisor(num + 1);
       int d2 = largestDivisor(num + 2);
       if(Math.abs(d1 - (num + 1) / d1) < Math.abs(d2 - (num + 2) / d2))
       {
    	   result[0] = d1;
    	   result[1] = (num + 1) / d1;
       }
       else {
    	   result[0] = d2;
    	   result[1] = (num + 2) / d2;
       }
     return result;
    }
	
	private static int largestDivisor(int num) {
		int d = (int)Math.sqrt(num + 1);
	    while (num % d != 0) --d;
	    return d;
	}

	public static void main(String[] args) {
		int num = 8;
		System.out.println(Arrays.toString(closestDivisors(num)));
	}
	
}

