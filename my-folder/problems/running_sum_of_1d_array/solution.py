class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        n = len(nums)
        #sum1 = 0
        res = [nums[0]]
        for i in range(1,n):
            res.append(res[i-1]+nums[i])
        return res