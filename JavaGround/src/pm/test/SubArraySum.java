package pm.test;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static int subarraySum(int[] nums, int k) {
    	int sum = 0, count = 0;
    	Map<Integer, Integer> map = new HashMap<>();
    	map.put(0,1);
    	for(int i = 0; i < nums.length; i++) {
    		sum = sum + nums[i];
    		if(map.containsKey(sum - k))
    			count = count + map.get(sum - k);
    		map.put(sum,map.getOrDefault(sum, 0) + 1);
    	}
    	return count;
    	
    }
    
    public static void main(String args[]) {
    	int nums[] = {1,1,1,1};
    	int result = subarraySum(nums, 2);
    	System.out.println(result);
    }
}
