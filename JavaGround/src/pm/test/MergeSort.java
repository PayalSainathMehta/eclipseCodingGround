package pm.test;

import java.util.Arrays;

public class MergeSort {
	
	public static void mergesort(int[]arr, int l, int r) {
		if(l < r) {
			int mid = (l + r) / 2;
			mergesort(arr,l,mid);
			mergesort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
		
	}
	
	public static void merge(int[]arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for(int i = 0 ; i < n1; i++)
			left[i] = arr[l + i];
		for(int j = 0; j < n2; j++)
			right[j] = arr[m + j + 1];
		
		int i = 0; int j = 0; int k = l;
		while(i < n1 && j < n2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			}
			else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
 	}
	
	public static void main(String args[]) {
		int a[] = new int[] {10,9,8,7,6,5,4,3,2,1};
		mergesort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}
