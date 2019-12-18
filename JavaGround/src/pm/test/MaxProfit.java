package pm.test;

public class MaxProfit {
	public static void main(String[] args) {
		int[] prices = new int[] {7,1,5,3,6,4};
		System.out.println(maximizeProfit(prices));
		
	}
	
	
	public static int maximizeProfit(int[]prices) {
		// with more than one transactions
		int maxProfit = 0;
		for(int i = 1; i < prices.length;i++) {
			if(prices[i] > prices[i - 1])
				maxProfit += prices[i] - prices[i - 1]; 
		}
		
		//return maxProfit;
		
		
		//with one transactions 
		int maxcur = 0, maxsofar = 0;
		for(int i = 1; i < prices.length; i++) {
			maxcur = maxcur + prices[i] - prices[i - 1];
			maxcur = Math.max(0, maxcur);
			maxsofar = Math.max(maxcur, maxsofar);
		}
		return maxsofar;
		
	}
}
