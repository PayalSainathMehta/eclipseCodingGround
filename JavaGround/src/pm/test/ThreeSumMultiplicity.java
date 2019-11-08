package pm.test;

public class ThreeSumMultiplicity {
    public int threeSumMulti(int[] A, int target) {
    	int MOD = 1000000007;
    	long ans = 0;
    	long count[] = new long[101];
    	for(int x: A) count[x]++;
    	
    	
    	//all different
    	for(int i = 0; i < 101; i++)
    		for(int j = i + 1; j<101; j++) {
    			int k = target - i - j;
    			if(j<k && k < 101) {
    				ans = ans + count[i]*count[j]*count[k];
    				ans = ans%MOD;
    			}
    		}
    			
    	//all same
    	if(target%3 == 0) {
    		int i = target / 3;
    		if(0 <= i && i < 101) {
    			ans = ans + count[i] * (count[i]-1) * (count[i]-2) / 6;
    			ans = ans % MOD;
    		}
    	}
    	
    	
    	
    	//x!=y==z
    	 for (int x = 0; x <= 100; ++x) {
    		 if (target%2 == x%2) {
             int y = (target - x)/2;
             if (x < y && y <= 100) {
                 ans += count[x] * (count[y] - 1) / 2 * count[y];
                 ans %= MOD;
             }
             }
         }
    	
    	
    	//x==y!=z
    	 for (int x = 0; x <= 100; ++x) {
             int z = target - 2*x;
             if (x < z && z <= 100) {
                 ans += count[x] * (count[x] - 1) / 2 * count[z];
                 ans %= MOD;
             }
         }
    	
    	
    	return (int)ans;
   	
    }
    
    public static void main(String args[]) {
    	int a[] = new int[] {1,1,2,2,3,3,4,4,5,5};
    	ThreeSumMultiplicity obj = new ThreeSumMultiplicity();
    	int res = obj.threeSumMulti(a, 8);
    	System.out.println(res);
    }
}
