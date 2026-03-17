class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        if len(nums) == 1:
            return False
        without_duplicates = set()
        for num in nums:
            # if num in without_duplicates:
            #     return True
            without_duplicates.add(num)
        return False if len(nums) == len(without_duplicates) else True