package pm.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryContiguousArray {
	
	public int findMaxLength(int[] nums) {
		for(int i = 0; i < nums.length; i++)
			if(nums[i]==0)
				nums[i] = -1;
		
		//System.out.println(Arrays.toString(nums));
		Map<Integer,Integer> sumToIndex = new HashMap<>();
		sumToIndex.put(0,-1);
		System.out.println(Arrays.asList(sumToIndex));
		int sum = 0, maxLen = 0;
		for(int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			//System.out.println("Sum"+sum);
			if(sumToIndex.containsKey(sum))
				maxLen = Math.max(maxLen, i - sumToIndex.get(sum));
			else
				sumToIndex.put(sum, i);
			System.out.println(Arrays.asList(sumToIndex));
		}
		
		return maxLen;
	}

	public static void main(String args[]) {
		int a[] = new int[] {0, 1};
		BinaryContiguousArray obj = new BinaryContiguousArray();
		int result = obj.findMaxLength(a);
		System.out.println(result);
	}
}
