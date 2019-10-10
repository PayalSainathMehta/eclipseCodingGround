package pm.test;

import java.util.Arrays;

public class MoveZeroes {
	 
	public static int[] moveZeroes(int[] nums) {
		int lastFoundNonZero = 0;
		for(int i = 0 ; i< nums.length; i++)
			if(nums[i] != 0)
				nums[lastFoundNonZero++] = nums[i];
		
		for(int i = lastFoundNonZero; i < nums.length; i++)
			nums[i] = 0;
		
//		for(int i = 0; i < nums.length; i++) {
//			if(nums[i] == 0) {
//				firstZero = i;
//				continue;
//			}else if(nums[i] != 0 && firstZero != -1) {
//				int temp = nums[i];
//				nums[i] = nums[firstZero];
//				nums[firstZero] = temp;
//				firstZero = -1;
//				i--;
//			}			
		return nums;

		}
		//System.out.println(count);

		
		
	

	
	public static void main(String[] args) {
		int[] a = new int[] {0,1,0,3,12};
		int[] result = moveZeroes(a);
		System.out.println(Arrays.toString(result));
	}

}
