class Solution {
    public int[][] generateMatrix(int n) {
        // int num = (n-1)*2 + 1;
        int[][] ans = new int[n][n];
        int left = 0, right = n-1, top = 0, bottom = n-1;
        int temp = 1;
        if(n==1){
            ans[0][0] = 1;
            return ans;
        }
        while(left<=right && top<=bottom){
            for(int i = left; i <= right; i ++){
                ans[top][i] =temp;
                temp ++;
            }
            top++;
            for(int i = top; i <= bottom; i ++){
                ans[i][right] = temp;
                temp ++;
            }
            right--;
            if(left<=right){
                for(int i = right; i>=left; i--){
                    ans[bottom][i] = temp;
                    temp ++;
                }
                bottom --;
            }
            if(top<=bottom){
                for(int i = bottom; i>=top; i--){
                    ans[i][left] = temp;
                    temp ++;
                }
                // temp--;
                left ++;
            }
            
        }
        return ans;
    }
}