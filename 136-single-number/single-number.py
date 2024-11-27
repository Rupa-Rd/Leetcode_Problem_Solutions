class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        s=set(nums)
        st=list(s)
        tot=[]
        for i in s:
            tot.append(nums.count(i))
        m=tot.index(1)
        return st[m]
        