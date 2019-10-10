package pm.test;

public class HouseRobber {
	
	public static int rob(int[] nums) {
		//dp solution
		/*
		 * Logic
		 * if you got just value, return that
		 * if two values, return max of that
		 */
		if(nums.length == 1) return nums[0];
		if(nums.length == 2) return Math.max(nums[0], nums[1]);
		int [] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		for(int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
			//System.out.println(dp[i]);
		}
	
		return dp[nums.length-1];
	}
	
	
	
	
	public static void main(String args[]) {
		int[] input = new int[] {1,3,1};
		int res = rob(input);
		System.out.println(res);
	}

}
