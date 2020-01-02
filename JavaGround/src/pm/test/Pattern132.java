package pm.test;

import java.util.Arrays;

public class Pattern132 {
	//a 132 pattern exists when i < j < k and a[i] < a[k] < a[j]
	//return true if above pattern exists
	
    public static boolean find132pattern(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return false;
    	int n = nums.length;
    	int arr[] = Arrays.copyOf(nums, n);
    	System.out.println(Arrays.toString(arr));
    	//finding i ---> has to be the least to satisfy i < j < k
    	for(int i = 1; i < n; i++)
    		arr[i] = Math.min(nums[i-1], arr[i-1]);
    	System.out.println(Arrays.toString(arr));

    	//scan for j from behind 
    	for(int j = n - 1, k = n; j >= 0 ; j--) {
    		//check if nums[j] is greater than arr[j], if not simply continue to j - 1
    		if(nums[j] <= arr[j]) 
    			continue;
    		while(k < n && arr[k] <= arr[j]) 
    			k++;
    		if(k < n && nums[j] > arr[k]) 
    			return true;
    		arr[--k] = nums[j];
    			
    	}
    	return false;
    	
    }	
	
	public static void main(String[] args) {
		int nums[] = {3, 1, 4, 2};
		System.out.println(find132pattern(nums));
	}
}
