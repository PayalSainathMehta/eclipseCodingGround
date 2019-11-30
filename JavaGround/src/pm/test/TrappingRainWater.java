package pm.test;

public class TrappingRainWater {
    public int trap(int[] height) {
    	int result = 0;
    	int n = height.length;
    	if(height.length == 0) return 0;
    	int[] left_max = new int[n];
    	int[] right_max = new int[n];
    	left_max[0] = height[0];
    	right_max[n-1] = height[n-1];
    	for(int i = 1; i < n-1; i++) {
    		
    	}
    	
    	
    	
    	
    	return result;
    }
    
    public static void main(String args[]) {
    	TrappingRainWater obj = new TrappingRainWater();
    	int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    	System.out.println(obj.trap(height));
    	
    }
    

}
