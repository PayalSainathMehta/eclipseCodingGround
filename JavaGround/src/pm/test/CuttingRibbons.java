package pm.test;

public class CuttingRibbons {
	public static int greatestLength(int[] arr, int k) {
		int maximum = 0;
		for(int a: arr)
			maximum = Math.max(maximum, a);
//		System.out.println(maximum);
		int l = 1;
		int h = maximum;
		while( l <= h) {
			int mid = l + (h - l) / 2;
			int len = getLength(arr,mid);
			if(len >= k) l = mid + 1;
			else h = mid - 1;
		}
		return h;
	}
	
	
	public static int getLength(int[] arr, int target) {
		int res = 0;
		for(int a: arr)
			res = res + a/target;
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 9};
	    System.out.println(greatestLength(arr, 5));
	}
}
