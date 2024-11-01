class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for(int[] r: dp)
            Arrays.fill(r, -1);
        
        for(int j = 0; j <= amount; j++){
            if(j % coins[0] == 0)
                dp[0][j] = 1;
            else
                dp[0][j] = 0;
        }
        
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= amount; j++){
                int notTaken = dp[i - 1][j];
                int taken = 0;
                if(coins[i] <= j){
                    taken = dp[i][j - coins[i]];
                }
                
                dp[i][j] = taken + notTaken;
            }
        }
        
        return dp[n - 1][amount];
        // return memo(coins, n - 1, amount, dp);
        // return recursiveSolution(coins, coins.length - 1, amount);
    }
    public int memo(int[] coins, int n, int amount, int[][] dp){
        if(n == 0){
            return (amount % coins[n] == 0) ? 1 : 0;
        }
        if(dp[n][amount] != -1)
            return dp[n][amount];
        int notTaken = memo(coins, n - 1, amount, dp);
        int taken = 0;
        
        if(coins[n] <= amount){
            taken = memo(coins, n, amount - coins[n], dp);
        }
        
        return dp[n][amount] = taken + notTaken;
    }
    public int recursiveSolution(int[] coins, int n, int amount){
        if(n == 0){
            return (amount % coins[0] == 0) ? 1 : 0;
        }
        
        int notTaken = recursiveSolution(coins, n - 1, amount);
        int taken = 0;
        
        if(coins[n] <= amount){
            taken = recursiveSolution(coins, n, amount - coins[n]);
        }
        
        return taken + notTaken;
    }
}