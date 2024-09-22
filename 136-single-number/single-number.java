class Solution {
    public int singleNumber(int[] nums) {
        int singleFreq = 0;
        for(int i: nums){
            singleFreq ^= i;
        }
        
        return singleFreq;
    }
}