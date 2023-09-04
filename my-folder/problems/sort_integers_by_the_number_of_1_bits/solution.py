class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        def findWeight(num):
            weight = 0
            mask = 1
            while num >0 :
                weight += 1
                num = num & (num - 1)
            return weight
        
        arr.sort(key=lambda num:(findWeight(num), num))
        return arr