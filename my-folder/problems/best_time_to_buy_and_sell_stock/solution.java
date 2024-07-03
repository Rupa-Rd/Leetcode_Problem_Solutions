class Solution {
    public int maxProfit(int[] prices) {
        long max_profit = Long.MIN_VALUE;
        long current_profit = 0;
        
        int i = 0;
        int j = 1;
        while(i < j && j != prices.length){
            if(prices[i] < prices[j]){
                current_profit = prices[j] - prices[i];
                max_profit = Math.max(max_profit, current_profit);
                j ++;
            }else{
                i = j;
                j ++;
            }
        }
        return max_profit > 0 ? (int) max_profit : 0;
    }
}