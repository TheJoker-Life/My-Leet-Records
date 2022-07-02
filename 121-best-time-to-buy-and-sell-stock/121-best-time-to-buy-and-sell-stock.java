class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length<2){
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        
        for (int i = 0; i<prices.length; i++){
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
            if (prices[i] - minPrice >profit){
                profit = prices[i] - minPrice; 
            }
        }
        return profit;
    }
}