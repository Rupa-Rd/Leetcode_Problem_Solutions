class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Memoization: O(N * M), O(N * M)
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row: dp)
            Arrays.fill(row, -1);
        
        // Tabulation: O(N *M), O(N*M)
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i >= 0 && j >= 0 && obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else if(i == 0 && j == 0)
                    dp[i][j] = 1;
                else{
                    int up = 0, left = 0;
                    if(i > 0){
                        up = dp[i - 1][j];
                    }
                    if(j > 0)
                        left = dp[i][j - 1];
                    dp[i][j] = up + left;
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
                if(i >= 0 && j >= 0 && obstacleGrid[i][j] == 1)
                    tempArr[j] = 0;
                else if(i == 0 && j == 0)
                    tempArr[j] = 1;
                else{
                    int up = 0, left = 0;
                    if(i > 0)
                        up = prevRow[j];
                    if(j > 0)
                        left = tempArr[j - 1];
                    
                    tempArr[j] = up + left;
                }
            }
            prevRow = tempArr;
        }
        
        return prevRow[n - 1];
        // return recursion(m - 1, n - 1, obstacleGrid, dp);
    }
    public int recursion(int m, int n, int[][] matrix, int[][] dp){
        if( m >= 0 && n >= 0 && matrix[m][n] == 1)
            return 0;
        if(m == 0 && n == 0)
            return 1;
        if(m < 0 || n < 0)
            return 0;
        if(dp[m][n] != -1)
            return dp[m][n];
        
        int up = recursion(m - 1, n, matrix, dp);
        int left = recursion(m, n - 1, matrix, dp);
        
        return dp[m][n] = up + left;
    }
}