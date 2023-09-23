class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height) <=1:
            return 0
        max_area = 0
        l = 0
        r = len(height) - 1
       
        while l < r:
            length = min(height[l],height[r])
            width = r - l
            area = length * width
            max_area = max(area,max_area)
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
 

        return max_area

        