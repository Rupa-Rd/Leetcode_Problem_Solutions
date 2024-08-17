class Solution {
    public int longestConsecutive(int[] nums) {
        
        // Bruteforce: O(n^2)
//         int maxLen = 0;
        
//         for(int i =0; i < nums.length; i ++){
//             int temp = nums[i];
//             int tempLen = 1;
//             int j = 0;
//             while(j < nums.length){
//                 if(isPresent(nums, temp + 1))
//                     tempLen++;
//                 else
//                     break;
//                 temp ++;
//                 j ++;
//             }
            
//             maxLen = Math.max(maxLen, tempLen);
//         }
        
//         return maxLen;
//     }
//     public boolean isPresent(int[] A, int n){
        
//         for(int i = 0; i < A.length; i ++){
//             if(A[i] == n)
//                 return true;
//         }
        
//         return false;
        
        // Better solution using Sorting
        if (nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        Arrays.sort(nums);
        int start = nums[0]+1, max = 1, len = 1;
        
        for(int i = 1; i < nums.length; i ++){
            System.out.println(start);
            if(nums[i] == start){
                len++;
            }else if(nums[i] == start - 1){
                start = start - 1;
            }else{
                start = nums[i];
                len = 1;
            }
            max = Math.max(max, len);
            
            start ++;
        }
        return max;
    }
}