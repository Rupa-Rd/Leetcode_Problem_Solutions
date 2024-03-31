// import math;
class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int badi = -1;
        int mini = -1;
        int maxi = -1;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] < minK || nums[i]> maxK){
                badi = i;
            }
            if(nums[i] == minK){mini = i;}
            if(nums[i] == maxK){maxi = i;}
            ans += Math.max(0, Math.min(maxi,mini) - badi);
        }
        return ans;
    }
}