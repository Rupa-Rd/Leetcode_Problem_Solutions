class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int awayFromBoundary = 0;
        int count = 0;
        for(int a = 0; a < nums.length; a ++){
            awayFromBoundary += nums[a];
            if(awayFromBoundary == 0 && a != 0){
                    count++;
            }
        }
        return count;
    }
}