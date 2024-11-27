class Solution:
    def findGCD(self, nums: List[int]) -> int:
        high=max(nums)
        low=min(nums)
        gcd=1
        for i in range(2,low+1):
            if high%i==0 and low %i==0:
                gcd=i
        return gcd
        