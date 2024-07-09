class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for(Integer i: nums){
            if(i % 3 != 0){
                ans ++;
            }
        }
        
        return ans;
    }
}