class Solution {
    public int[] runningSum(int[] nums) {
        int tempSum = nums[0];
        for(int i= 1; i<nums.length;i++){
            tempSum = tempSum + nums[i];
            nums[i] = tempSum;
            
            
        }
        return nums;
    }
}