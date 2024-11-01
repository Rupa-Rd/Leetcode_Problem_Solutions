class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for(int[] r: dp)
            Arrays.fill(r, -1);
    
        for(int j = 0; j <= amount; j++){
            if(j % coins[0] == 0)
                dp[0][j] = j / coins[0];
            else
                dp[0][j] = (int) Math.pow(10, 9);
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= amount; j++){
                int notTaken = dp[i - 1][j];
                int taken = (int) Math.pow(10, 9);
                if(coins[i] <= j){
                    taken = 1 + dp[i][j - coins[i]];
                }
                dp[i][j] = Math.min(taken, notTaken);
            }
        }
        
        if(dp[n - 1][amount] == (int)Math.pow(10, 9))
            return -1;
        return dp[n - 1][amount];
        // return memo(coins, n, amount, dp);
        // return recursiveSolution(coins, coins.length - 1, amount);
    }
    int memo(int[] coins, int n, int target, int[][] dp){
        if(n == 0){
            if(target % coins[0] == 0){
                return target / coins[0];
            }else{
                return (int) Math.pow(10, 9);
            }
        }
        if(dp[n][target] != -1)
            return dp[n][target];
        int notTaken = memo(coins, n - 1, target, dp);
        int taken = (int) Math.pow(10, 9);
        
        if(coins[n - 1] <= target){
            taken = 1 + memo(coins, n, target - coins[n - 1], dp);
        }
        return Math.min(taken, notTaken);
    }
    int recursiveSolution(int[] coins, int n, int target){
        if(n == 0){
            if(target % coins[0] == 0){
                return target / coins[0];
            }else{
                return (int)Math.pow(10, 9);
            }
        }
        int notTaken = 0 + recursiveSolution(coins, n - 1, target);
        int taken = (int)Math.pow(10, 9);
        
        if(coins[n] <= target){
            taken = 1 + recursiveSolution(coins, n, target - coins[n]);
        }
        
        return Math.min(taken, notTaken);
    }
}