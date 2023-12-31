#Uncomment to run it in local machine
#from typing import List

class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for i in nums:
            if(i == 0):
                nums.remove(i)
                nums.append(0)
            else:
                continue
        return nums

# nums = [0,1,0,3,12]
# obj = Solution()
# print(obj.moveZeroes(nums))