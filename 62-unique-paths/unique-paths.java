class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row: dp)
            Arrays.fill(row, -1);
        
        // Tabulation: O(N * M), O(N * M)
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0)
                    dp[i][j] = 1;
                else{
                    int down = dp[i - 1][j];
                    int right = dp[i][j - 1];
                    dp[i][j] = down + right;
                }
            }
        }
        
        // return dp[m - 1][n - 1];
        
        // Space optimization: O(N * M), O(N)
        int[] prevRow = new int[n];
        Arrays.fill(prevRow, -1);
        
        for(int i = 0; i < m; i ++){
            int[] tempArr = new int[n];
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0)
                 tempArr[j] = 1;
                else{
                    int down = prevRow[j];
                    int right = tempArr[j - 1];
                    tempArr[j] = down + right;
                }
            }
            prevRow = tempArr;
        }
        
        return prevRow[n - 1];
        // return recursiveSolution(m - 1, n - 1, dp);
    }
    // Memoization : O(N * M), O(N)
    public int recursiveSolution(int m, int n, int[][] dp){
        if(m == 0 && n == 0)
            return 1;
        if(m < 0 || n < 0)
            return 0;
        if(dp[m][n] != -1)
            return dp[m][n];
        int up = recursiveSolution(m - 1, n, dp);
        int left = recursiveSolution(m, n - 1, dp);
        
        return dp[m][n] = up + left;
    }
}