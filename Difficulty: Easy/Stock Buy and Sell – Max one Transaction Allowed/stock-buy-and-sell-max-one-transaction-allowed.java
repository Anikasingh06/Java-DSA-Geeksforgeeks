// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int maximumProfit = 0;
        int bestbuy = prices[0];
        
        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] > bestbuy){
                maximumProfit = Math.max(maximumProfit, prices[i] - bestbuy);
            }
            else{
                bestbuy = Math.min(bestbuy , prices[i]);
            }
        }
        
         return maximumProfit;
    }
}