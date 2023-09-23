class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        N = len(nums)
        if N <= 1:
            return 0

        total_sum = sum(nums)
        left_sum = 0

        for i,num in enumerate(nums):
            total_sum -= num

            if left_sum == total_sum :
                return i
                break
            left_sum += num

        return -1
        