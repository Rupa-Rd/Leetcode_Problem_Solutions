class Solution {
    public int maxArea(int[] height) {
        // Bruteforce: O(N^2)
//         int maxArea = Integer.MIN_VALUE, n = height.length;
        
//         for(int i = 0; i < n; i ++){
//             int tempArea = 0;
//             for(int j = i + 1; j < n; j ++){
//                 int heightOfWall = Math.min(height[i], height[j]);
//                 int width = j - i;
//                 tempArea = heightOfWall * width;
//                 maxArea = Math.max(maxArea, tempArea);
//             }
//         }
        
//         return maxArea;
        // Optimal approach using slinding window : O(N)
        int maxArea = Integer.MIN_VALUE, j = height.length - 1, i =0;
        
        while(i < j){
            int tempArea = (j - i) * Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, tempArea);
            if(height[i] > height[j]){
                j--;
            }else{
                i++;
            }
        }
        
        return maxArea;
    }
}