package pm.test;

import java.util.Arrays;

public class InsertionSort {
	
	public static void insertSort(int[] a) {
		int key = 0;
		int i = 0;
		for(int j = 1; j < a.length; j++) {
			key = a[j];
			i = j - 1;
			while(i >= 0 && a[i] > key) {
				a[i+1] = a[i];
				i--;
			}
			a[i+1] = key;
			
		}
	}

	
	public static void main(String args[]) {
		int a[] = new int[] {10,9,8,7,6,5,4,3,2,1};
		insertSort(a);
		System.out.println(Arrays.toString(a));
	}
}
