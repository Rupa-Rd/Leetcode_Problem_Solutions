class Solution {
    public int climbStairs(int n) {
        // Recursion : O(2 ^ n)
        // Modifying code to do memoization
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans = nWays(n, dp);
        
        return ans;
    }
    public int nWays(int n, int[] dp){
        if (n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = nWays(n - 1, dp) + nWays(n - 2, dp);
        
    }
}
