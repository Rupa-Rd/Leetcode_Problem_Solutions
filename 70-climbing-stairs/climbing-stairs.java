class Solution {
    public int climbStairs(int n) {
        // Recursive solution: T(2^n)
        // return recursiveSol(n);
        // Top up using dp: O(N)
        int[] dp = new int[n + 1];
        Arrays.fill(dp,  -1);
    //    memo(n, dp);
    //    return dp[n];
       // Bottom up
       dp[0] = 1;
       for(int i = 1; i <= n; i++){
        int twoStep = 0, singleStep = dp[i - 1];
        if(i > 1){
            twoStep = dp[i - 2];
        }
        dp[i] = singleStep + twoStep;
       }
       return dp[n];
    }

    public int memo(int n, int[] dp){
        // rec(n - 1) + rec(n - 2)
        // if n == 0 -> 1, if n < 0 -> 0

        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = recursiveSol(n - 1) + recursiveSol(n - 2);
    }

    public int recursiveSol(int n){
        // rec(n - 1) + rec(n - 2)
        // if n == 0 -> 1, if n < 0 -> 0

        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        return recursiveSol(n - 1) + recursiveSol(n - 2);
    }
}