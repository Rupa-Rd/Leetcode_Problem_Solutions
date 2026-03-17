class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        no_dups = {}
        for index, val in enumerate(nums):
            need = target - val

            if need in no_dups:
                need_index = no_dups[need]
                return [index, need_index]
            no_dups[val] = index
        
        return []

        