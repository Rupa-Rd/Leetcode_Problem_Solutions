class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0 && nums[i] < 10)
                singleDigitSum += nums[i];
            else
                doubleDigitSum += nums[i];            
        }
        // System.out.println(doubleDigitSum);
        return singleDigitSum == doubleDigitSum ? false : true;
        
    }
}