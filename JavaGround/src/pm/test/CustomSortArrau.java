package pm.test;

public class CustomSortArrau {
	
	public static int segregateEvenOdd(int[] arr) {
		int l = 0, r = arr.length - 1;
		int count = 0;
		while(l < r) {
			while(arr[l] % 2 == 0 && l < r)
				l++;
			while(arr[r] % 2 == 1 && l < r)
				r--;
			if(l < r) {
				count++;
				l++;
				r--;
			}
		}
		return count;
	}
	
	 public static void main (String[] args) 
	    { 
	        int arr[] = {23,25,26,28}; 
	        int result = CustomSortArrau.segregateEvenOdd(arr); 
	        System.out.println(result);
	    } 

}
