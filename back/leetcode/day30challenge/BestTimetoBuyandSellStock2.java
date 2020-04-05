package day30challenge;

public class BestTimetoBuyandSellStock2 {
	public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
			return 0;
		}
		int result=0;
		for(int i=0;i<prices.length-1;i++){
			if(prices[i+1]>prices[i]){
				result+=prices[i+1]-prices[i];
			}
			
		}		
		
		return result;
    }

}
