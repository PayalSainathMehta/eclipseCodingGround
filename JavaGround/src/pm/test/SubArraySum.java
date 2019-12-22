package pm.test;

import java.util.HashMap;

import java.util.Map;

public class SubArraySum {
    public static int subarraySum(int[] nums, int k) {
    	int sum = 0, count = 0;
    	Map<Integer, Integer> map = new HashMap<>();
    	//remain, count
    	map.put(0,1); //when remain equals 0 then we add count as 1 
    	for(int i = 0; i < nums.length; i++) {
    		//contiguous sum
    		sum = sum + nums[i];
    		//check if the remaining is present in the map
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
