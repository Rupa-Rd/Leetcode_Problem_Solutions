class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # Kadane's algorithm
        current_sum = 0
        max_sum = float('-inf')
        
        for num in nums:
            current_sum += num
            max_sum = max(max_sum, current_sum)
            
            if current_sum < 0:
                current_sum = 0
                
        # Time complexity = O(n)
        # Space complexity = O(1)
        return max_sum