package pm.test;

import java.util.HashMap;

public class LargestArithmeticSubsequence {
    public static int longestArithSeqLength(int[] A) {
    	  int res = 2, n = A.length;
          HashMap<Integer, Integer>[] dp = new HashMap[n];
          //System.out.println(Arrays.toString(dp));
             for (int i = 0; i < n; i++) {
             dp[i] = new HashMap<>();
             for (int j = 0; j < i; j++) {
                 int d = A[i] - A[j];
                 dp[i].put(d, dp[j].getOrDefault(d, 1) + 1);
                 //System.out.println(dp);
                 res = Math.max(res, dp[i].get(d));
             }
         }
         return res;
    }
    
    public static void main(String args[]) {
    	int a[] = {20,1,15,3,10,5,8};
    	System.out.println(longestArithSeqLength(a));
    }

}
