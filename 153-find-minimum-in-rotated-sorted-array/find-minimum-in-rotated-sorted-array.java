class Solution {
    public int findMin(int[] nums) {
//         int min = nums[0], i = 0, n = nums.length;
        
//         while(i < n - 1){
//             if(nums[i] > nums[i+1]){
//                 min = nums[i+1];
//                 break;
//             }
//             i++;
//         }
        
//         return min;
        int low = 0, high = nums.length - 1, min = Integer.MAX_VALUE;
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(nums[low] <= nums[high]){
                min = Math.min(min,nums[low]);
                break;
            }
            if(nums[low] <= nums[mid]){
                min = Math.min(min,nums[low]);
                low = mid + 1;
            }else{
                min = Math.min(min,nums[mid]);
                high = mid - 1;
            }
        }
        return min;
    }
}