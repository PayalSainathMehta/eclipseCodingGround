package pm.test;

public class MedianOfSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int m = nums1.length;
    	int n = nums2.length;
    	if(m > n) {
    		int[] temp = nums1;
    		nums1 = nums2;
    		nums2 = temp;
    		
    	    int tmp = m;
    	    m = n;
    	    n = tmp;
    	}
    	
    	int iMin = 0, iMax = m, halflen = (m + n + 1) / 2;
    	while(iMin <= iMax) {
    		int i = (iMin + iMax) / 2;
    		int j = halflen - i;
    		if(i > iMin && nums2[j - 1] > )
    	}
    	
    	
    	
    	
    	
    	return 0.0;
    	
    	
    }

}
