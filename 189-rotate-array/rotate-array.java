class Solution {
    public void rotate(int[] nums, int k) {
        // Bruteforce :O(n^2)
//         int n = nums.length;
//         while(k != 0){
//             int temp = nums[n - 1];
            
//             for(int i = n - 1; i >= 1; i --){
//                 nums[i] = nums[i - 1];
//             }
//             System.out.println(Arrays.toString(nums));
//             nums[0] = temp;
            
//             k --;
//         }
        // if(nums.length == 1)
        //     return;
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    
    public void reverse(int[] nums, int start, int end){
        
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end --;
        }
    }
}