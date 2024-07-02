class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        # Kadane's algorithm
        
        current_product = 1
        max_product = float('-inf')
        
        for num in range(len(nums)):
            current_product *= nums[num]
            max_product = max(max_product, current_product)
            
            if current_product == 0:
                current_product = 1
        current_product = 1
        max_product1 = float('-inf')
        for num in range(len(nums)-1,-1,-1):
            current_product *= nums[num]
            print(current_product)
            max_product1 = max(max_product1, current_product)
            
            if current_product == 0:
                current_product = 1
            
        return max(max_product, max_product1)