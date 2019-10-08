package pm.test;

import java.util.Arrays;

public class AddSortArrays {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] numsCopy = new int[m];
        System.arraycopy(nums1,0,numsCopy,0,m);
        
        int p1 = 0,p2 = 0, p = 0;
        while((p1 < m) && (p2 < n))
            nums1[p++] = (numsCopy[p1] < nums2[p2]) ? numsCopy[p1++] : nums2[p2++]; 
        
        if(p1 < m)
            System.arraycopy(numsCopy,p1,nums1,p1+p2,m+n-p1-p2);
        if(p2 < n)
            System.arraycopy(nums2,p2,nums1,p1+p2,m+n-p1-p2);
        
        System.out.println(Arrays.toString(nums1));
    }
	
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		merge(nums1,nums1.length-3,nums2,nums2.length);
	}

}
