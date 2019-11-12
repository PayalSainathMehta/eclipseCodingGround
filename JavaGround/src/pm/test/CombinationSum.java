package pm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, target, 0);
    return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
    if(remain < 0) return;
    else if(remain == 0) list.add(new ArrayList<>(tempList));   
    else{ 
        //System.out.println("List"+list);
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
            // System.out.println("TempList"+tempList);
            // System.out.println("List"+list);
            tempList.remove(tempList.size() - 1);
        }
    }
} 
    public static void main(String args[])
    {
    	CombinationSum obj = new CombinationSum();
    	int a[] = {1,0,1,0};
    	obj.combinationSum(a, 7);
    }
}
