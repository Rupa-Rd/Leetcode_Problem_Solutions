class Solution {
    public boolean canPartition(int[] nums) {
        // Optimized solution with space complexity: O(sum), TC:O(n*sum)
        int sum = 0, n = nums.length;
        
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        
        if(sum % 2 != 0)
            return false;
        
        boolean[] dp = new boolean[sum / 2 + 1];
        dp[0] = true;
        // System.out.println(sum / 2);
        for(int i = 0; i < n; i++){
            for(int j = sum / 2; j >= nums[i]; j--){
                
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        // System.out.println(Arrays.toString(dp));
        return dp[sum / 2];
    }
}