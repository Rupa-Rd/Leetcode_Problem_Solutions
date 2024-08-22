class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int leftProduct = 1, rightProduct = 1, n = nums.length;
        
        // Prefix product
        for(int i = 0; i < n; i ++){
            res[i] = leftProduct;
            leftProduct *= nums[i];
        }
        
        // Suffix Product
        
        for(int i = n - 1; i >= 0; i --){
            res[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return res;
    }
}