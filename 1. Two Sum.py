class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        length = len(nums)
        for x in range(0, length):
            for y in range(x+1,length):
                if nums[x] + nums[y] == target:
                    return [x,y]
                # else:
                #     continue