package pm.test;

import java.util.Arrays;

public class PreviousPermutationOneSwap {
    public static int[] prevPermOpt1(int[] A) {
    	
    	 int  i = A.length - 2, j = A.length - 1;
         while (i >= 0  && A[i] <= A[i + 1]) 
        	 i--;
         if (i < 0) 
        	 return A;
         while (A[i] <= A[j]) 
        	 j--;
         while (A[j - 1] == A[j]) 
        	 j--;
         swap(A, i, j);
         return A;
    }    
    
    public static void swap(int[]A, int i, int j) {
    	int temp = A[i]; 
        A[i] = A[j]; 
        A[j] = temp;
    }
    
    public static void main(String args[]) {
    	int nums[] = new int[]{3,1,1,3};
    	PreviousPermutationOneSwap.prevPermOpt1(nums);
    	System.out.println(Arrays.toString(nums));
    }
}
