class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int res = recursion(coins, amount, dp);
        
        return res != Integer.MAX_VALUE ? res : -1;
    }
    public int recursion(int[] coins, int amount, int[] dp){
        if(amount == 0)
            return 0;
        if(amount < 0)
            return Integer.MAX_VALUE;
        if(dp[amount] != -1)
            return dp[amount];
        
        int minCoins = Integer.MAX_VALUE;
        
        for(int c: coins){
            int res = recursion(coins, amount - c, dp);
            if(res != Integer.MAX_VALUE)
                minCoins = Math.min(minCoins, res + 1);
            
        }
        
        return dp[amount] = minCoins;
    }
}