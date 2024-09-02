class Solution {
    public int findMin(int[] nums) {
        int min = nums[0], i = 0, n = nums.length;
        
        while(i < n - 1){
            if(nums[i] > nums[i+1]){
                min = nums[i+1];
                break;
            }
            i++;
        }
        
        return min;
        
    }
}