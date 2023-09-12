class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        n = len(candies)
        res = [False] * n
        max_candies = max(candies)
        for i in range(n):
            if candies[i] + extraCandies >= max_candies:
                res[i] = True
        return res
