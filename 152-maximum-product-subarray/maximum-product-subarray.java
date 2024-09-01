class Solution {
    public int maxProduct(int[] nums) {
        // Bruteforce: O(N^3)
        int maxProduct = Integer.MIN_VALUE, n = nums.length;
        
//         for(int i = 0; i < n; i++){
//             for(int j = i; j < n; j++){
//                 int currProduct = 1;
                
//                 for(int k = i; k <= j; k ++){
//                     currProduct *= nums[k];
//                     maxProduct = Math.max(maxProduct, currProduct);
//                 }
//             }
//         }
        
        // Better solution: O(N^2)
        
        for(int i = 0; i < n; i++){
            int curr = 1;
            for(int j = i; j < n; j++){
                curr *= nums[j];
                maxProduct = Math.max(maxProduct, curr);
            }
        }
        
        return maxProduct;
    }
}