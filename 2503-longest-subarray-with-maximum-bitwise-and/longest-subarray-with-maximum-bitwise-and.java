class Solution {
    public int longestSubarray(int[] nums) {
//         int maxAND = Integer.MIN_VALUE, length = 0;
        
//         for(int i = 0; i < nums.length; i++){
//             int temp = nums[i];
//             for(int j = i + 1; j < nums.length; j++){
//                 temp &= nums[j];
//                 if(temp > maxAND){
//                     maxAND = temp;
//                     length = (j - i) + 1;
//                     System.out.println(length);
//                 }
//                 if(temp == maxAND){
//                     length = Math.max(length, (j - i) + 1);
//                 }
                
//             }
//             if(nums[i] > maxAND){
                
//                 maxAND = nums[i];
//                 length = 1;
//             }
//         }
        
//         return length;
        int ans = 0, length = 0, maxAND = 0;
        for(int n: nums){
            if(maxAND < n){
                maxAND = n;
                ans = length = 0;
            }
            if(n == maxAND){
                length++;
            }else{
               length = 0; 
            }
            
            ans = Math.max(ans, length);
        }
        
        return ans;
    }
}