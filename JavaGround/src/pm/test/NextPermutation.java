package pm.test;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
    	int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1])
            i--; //reach the point where your previous element is no longer greater than your next
         if(i >= 0){ // if you go here that means array isn't sorted in descending
             int j = nums.length - 1; //last element 
             while(j >= 0 && nums[i] >= nums[j])//- checking condition for swap
                 j--; 
             swap(nums,i,j);
         }
         reverse(nums,i+1); //if come here just reverse from the first point where the diff occurred
         
     }
     
     public static void reverse(int nums[], int start){
         int i = start, j = nums.length - 1;
         while(i < j){
             swap(nums, i, j); // keep swapping till i < j
             i++ ;
             j--;
         }
     }
     public static void swap(int nums[], int i, int j){
         int temp = nums[i];
         nums[i] = nums[j];
         nums[j] = temp;
     }
    
    
    
    public static void main(String args[]) {
    	int nums[] = new int[]{1,2,3};
    	NextPermutation.nextPermutation(nums);
    	System.out.println(Arrays.toString(nums));
    }
}
