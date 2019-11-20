package pm.test;

public class FindPeakElement {
	//find peak element and return its index
	public static int findIndex(int[] a) {
//		int l = 0; 
//		int r = a.length - 1;
//		int mid;
//		while(l < r) {
//			mid = (l + r) / 2;
//			if(a[mid] > a[mid + 1])
//				r = mid;
//			else
//				l  = mid + 1;
//		}
//		return l;
		
		int l = 0, h = a.length - 1;
		while( l < h) {
			if(l + 1 == h)
				return a[l] > a[h] ? l : h;
			int mid = l + (h - l)/2;
			if(a[mid] > a[mid + 1] && a[mid] > a[mid - 1])
				return mid;
			else if(a[mid] > a[mid - 1] && a[mid] < a[mid + 1])
				l = mid + 1;
			else
				h = mid - 1;
					
		}
		return l;
	}
	
	public static void main(String args[]) {
		int a[] = {1,2,3,1,2,3,5,4,2,1,6,7};
		System.out.println(findIndex(a));
	}
}
