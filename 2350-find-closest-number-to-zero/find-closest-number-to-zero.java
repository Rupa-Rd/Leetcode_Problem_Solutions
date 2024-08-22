class Solution {
    public int findClosestNumber(int[] nums) {
        int minValue = nums[0];
        
        for(Integer i: nums){
            if(Math.abs(i) < Math.abs(minValue))
                minValue = i;
        }
        
        for(Integer i: nums)
            if(Math.abs(minValue) == i)
                return i;
        
        return minValue;
    }
}