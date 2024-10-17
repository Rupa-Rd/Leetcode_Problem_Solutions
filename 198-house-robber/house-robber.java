class Solution {
    public int rob(int[] nums) {
        // Recursion, Memoization
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        // Tabulation: O(N)
        // dp[0] = nums[0];
        // for(int i = 1; i < n; i++){
        //     int taken = nums[i];
        //     if(i > 1)
        //         taken = nums[i] + dp[i - 2];
        //     int notTaken = dp[i - 1];
        //     dp[i] = Math.max(taken, notTaken);
        // }
        // return dp[n - 1];
        // return solve(nums, n - 1, dp);
        
        // Space optimized
        int prev = 0, curr = nums[0];
        for(int i = 1; i < n; i++){
            int taken = nums[i];
            if(i > 1)
                taken = nums[i] + prev;
            int notTaken = curr;
            
            prev = curr;
            curr = Math.max(taken, notTaken);
        }
        return curr;
    }
    public int solve(int[] A, int n, int[] dp){
        if(n == 0)
            return A[0];
        if(n < 0)
            return 0;
        if(dp[n] != -1)
            return dp[n];
        int taken = A[n] + solve(A, n - 2, dp);
        int notTaken = solve(A, n - 1, dp);
        
        return dp[n] = Math.max(taken, notTaken);
    }
}