class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0, tempMax = 0;
        
        for(int i: nums){
            if(i == 0){
                maxOne = Math.max(maxOne, tempMax);
                tempMax = 0;
            }else{
                tempMax ++;
            }
        }
        maxOne = Math.max(maxOne, tempMax);
        
        return maxOne;
    }
}