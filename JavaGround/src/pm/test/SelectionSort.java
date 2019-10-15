package pm.test;


import java.util.Arrays;

public class SelectionSort {
	
	public static void selectSort(int[] a) {
		for(int j = 0; j < a.length; j++) {
			int min = j;
			for(int i = j + 1; i < a.length; i++) {
				if(a[i] < a[min])
					min = i;
			}
			int temp = a[j];
			a[j] = a[min];
			a[min] = temp;
			
		}
	}

	
	public static void main(String args[]) {
		int a[] = new int[] {10,9,8,7,6,5,4,3,2,1};
		selectSort(a);
		System.out.println(Arrays.toString(a));
	}
}

