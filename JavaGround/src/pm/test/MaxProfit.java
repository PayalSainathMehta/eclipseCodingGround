package pm.test;

public class MaxProfit {
	public static void main(String[] args) {
		int res = 0;
		int[] prices = new int[] {7,1,5,3,6,4};
		System.out.println(maximizeProfit(prices));
		
	}
	
	
	public static int maximizeProfit(int[]prices) {
//		int minPrice = Integer.MAX_VALUE;
//		int maxProfit = 0;
//		for(int i = 0 ;i < prices.length; i++)
//		{
//			if (prices[i] < minPrice){
//				minPrice = prices[i];
//			}
//			else if(prices[i] - minPrice > maxProfit) {
//				maxProfit = prices[i] - minPrice;
//			}
//		}
		
		int maxProfit = 0;
		for(int i = 1; i < prices.length;i++) {
			if(prices[i] > prices[i - 1])
				maxProfit += prices[i] - prices[i - 1]; 
		}
		
		return maxProfit;
		
	}
}
