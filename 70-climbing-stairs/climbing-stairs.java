class Solution {
    public int climbStairs(int n) {
        // Recursion : O(2 ^ n)
        // Modifying code to do memoization

//         int[] dp = new int[n + 1];
//         Arrays.fill(dp, -1);
//         int ans = nWays(n, dp);
        
//         return ans;
        // Space optimization
        int prev1 = 1, prev2 = 1,curr = 1;
        
        for(int i = 2; i <= n; i++){
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        
        return curr;
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
