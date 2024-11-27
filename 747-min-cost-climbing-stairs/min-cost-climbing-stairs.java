class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        
        // Tabulation: O(n)
        dp[0] = 0; dp[1] = 0;
        for(int i = 2; i <= n; i++){
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        
        return dp[n];
        // return Math.min(recursion(cost, n - 1, dp), recursion(cost, n - 2, dp));
    }
    int recursion(int[] cost, int indx, int[] dp){

        if(indx < 0)
            return 0;
        if(dp[indx] != -1)        
            return dp[indx];
        
        int doubleStep = cost[indx] + recursion(cost, indx - 2, dp);
        int singleStep = cost[indx] + recursion(cost, indx - 1, dp);
        
        dp[indx] = Math.min(singleStep, doubleStep);
        return dp[indx];
    }
}