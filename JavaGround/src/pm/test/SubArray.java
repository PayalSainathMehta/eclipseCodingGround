package pm.test;
public class SubArray {
    public int maxSubArray(int[] nums) {
    	int n = nums.length;
    	int currSum = nums[0],maxSum = nums[0];
    	for(int i = 1; i < n; i++) {
    		currSum = Math.max(nums[i], currSum + nums[i]);
    		maxSum = Math.max(currSum,maxSum);
    	}
     return maxSum;  
    }
    
    public int maxSubArrayDP(int[] nums) {
    	int n = nums.length;
    	int maxSum = nums[0];
    	for(int i = 1; i < n; i++) {
    		if(nums[i-1]>0) nums[i] = nums[i] + nums[i-1];
    		maxSum = Math.max(nums[i], maxSum);
    	}
    	return maxSum;
    }
    
    public static void main(String[] args) {
    	SubArray obj = new SubArray();
    	int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
    	System.out.println(obj.maxSubArrayDP(nums));
    }
}