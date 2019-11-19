package pm.test;

public class LonelyInteger {
	
	public static int findLoner(int[] a) {
		if(a.length % 2 == 0)
			return -1;
		int result = a[0];
		for(int i = 1; i < a.length; i++)
			result = result ^ a[i];
		return result;
	}
	public static void main(String args[]) {
		int []a = {1,2,1,2,4,4,3,5,5,3};
	    System.out.println(findLoner(a));
	}
}
