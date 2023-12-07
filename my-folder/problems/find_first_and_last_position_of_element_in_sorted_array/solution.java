class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] ans = {-1,-1};
       ans[0] = search(nums,target,true);
       ans[1] = search(nums,target,false);
       return ans;

    }
    public int search(int[] nums,int target, boolean firstOccurence){
        int beg = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (beg <= end){
            int mid = (beg + end) / 2;
            if (target < nums[mid]){
                end = mid - 1;
            }
            else if (target > nums[mid]){
                beg = mid + 1;
            }
            else{
                ans = mid;
                if (firstOccurence){
                    end = mid - 1;
                }
                else{
                    beg = mid + 1;
                }
            }
        }
        return ans;
    }
}