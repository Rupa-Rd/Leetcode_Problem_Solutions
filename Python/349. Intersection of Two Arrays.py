#https://leetcode.com/problems/intersection-of-two-arrays/description/

class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        dictionary = {}
        ans = []
        for i in nums1:
            dictionary[i] = 1
        for j in nums2:
            if j in dictionary and dictionary[j]!= 0:
                dictionary[j] -= 1
                ans.append(j)
        return ans
