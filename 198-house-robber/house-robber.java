class Solution {
    public int rob(int[] nums) {
        // Recursive sol: O(n^2)
        // return recursiveSol(nums.length - 1, nums);
        // Top down using dp: O(n)
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        // return memo(n - 1, nums, dp);
        // Bottom up : O(N)
        dp[0] = nums[0];
        for(int i = 1; i < n; i++){
            int taken = nums[i], notTaken = dp[i - 1];
            if(i > 1){
                taken += dp[i - 2];
            }
            dp[i] = Math.max(taken, notTaken);
        }
        // [1, ]
        return dp[n - 1];
    }
    public int memo(int n, int[] nums, int[] dp){
        if(n == 0){
            return nums[0];
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int taken = 0, notTaken = 0;
        taken = nums[n] + memo(n - 2, nums, dp);
        notTaken = memo(n - 1, nums, dp);
        return dp[n] = Math.max(taken, notTaken);
    }
    public int recursiveSol(int n, int[] nums){
        // max(recursiveSol(n - 1), recursiveSol(n - 2))
        // if (n == 0) return nums[0], n < 0 -> 0
        if(n == 0){
            return nums[0];
        }
        if(n < 0){
            return 0;
        }
        int take = 0, notTake = 0;
        take = nums[n] + recursiveSol(n - 2, nums);
        notTake = recursiveSol(n - 1, nums);
        return Math.max(take, notTake);
        
            
        }
}