class Solution {
    public int search(int[] nums, int target) {
        // Linear search: O(N)
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] == target){
//                 return i;
//             }
//         }
        
//         return -1;
        // Binary Search: O(logN)
        int low = 0, high = nums.length - 1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            System.out.println(mid);
            if(nums[mid] == target){
                return mid;
            }
            // If left side is sorted
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target < nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{ // right side is sorted
                if(target <= nums[high] && target > nums[mid]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        
        return -1;
    }
}