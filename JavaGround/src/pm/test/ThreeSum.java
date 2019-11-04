package pm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
    	if(nums.length == 0)
    		return result;
    	Arrays.sort(nums);
    	for(int i = 0; i < nums.length; i++) {
    		int left = i + 1;
    		int right = nums.length - 1;
    		while(left < right) {
    			int sum = nums[i] + nums[left] + nums[right];
    			if (sum == 0) {
    				List<Integer> list = new ArrayList<>();
    				list.add(nums[i]);
    				list.add(nums[left]);
    				list.add(nums[right]);
    				result.add(list);
    				
    				//checking duplicates
    				int leftVal = nums[left];
    				while(left < nums.length && nums[left] == leftVal) 
    					left++;
    				int rightVal = nums[right];
    				while(right > left && nums[right] == rightVal) 
    					right--;
    			}
    			else if (sum < 0)
    				++left;
    			else --right;
    		}
    		while(i + 1 < nums.length && nums[i] == nums[i+1])
    			++i;
    	}
    	
    	return result;
    } 	
    

}
