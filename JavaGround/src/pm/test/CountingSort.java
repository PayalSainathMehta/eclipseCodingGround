package pm.test;

import java.util.Arrays;

public class CountingSort {
	
	
	//best case, worst case, average case complexity - O(n)
   public static void countingSort(int a[]) {
	   int n = a.length;
	   int max = 0;
	   for(int i = 0; i < n; i++) {
		   if(a[i] > max)
			   max = a[i];
	   }
//	   System.out.println(max);
	   int count[] = new int[max + 1];
	   for(int i: a)
		   count[i]++;
//	   System.out.println(Arrays.toString(count));
	   int index = 0;
	   for(int i = 0; i < count.length; i++) {
		   while(count[i] > 0) {
			   a[index++] = i;
		       count[i]--;
		   }
			   
	   }
   }
	
	
	
	
	
	public static void main(String args[]) 
	 { 
	     int arr[] = {7,9,10,8,3,4,5}; 
	     countingSort(arr); 
	     System.out.println(Arrays.toString(arr)); 
	 } 
}
