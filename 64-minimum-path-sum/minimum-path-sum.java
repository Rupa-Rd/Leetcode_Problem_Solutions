class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row: dp)
            Arrays.fill(row, -1);
        
        // Tabulation
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0)
                    dp[i][j] = grid[i][j];
                else{
                int up = grid[i][j], left = grid[i][j];
                if(i > 0)
                    up += dp[i - 1][j];
                else
                    up += (int) Math.pow(10, 9);
                if(j > 0)
                    left += dp[i][j - 1];
                else
                    left += (int) Math.pow(10, 9);
                dp[i][j] = Math.min(up, left);
                }
            }
        }
        return dp[m - 1][n - 1];
        // return recursion(m - 1, n - 1, grid, dp);
    }
    // Memoization
    public int recursion(int m, int n, int[][] grid, int[][] dp){
        if(m == 0 && n == 0)
            return grid[m][n];
        if(m < 0 || n < 0)
            return (int) Math.pow(10, 9);
        if(dp[m][n] != -1)
            return dp[m][n];
        int up = grid[m][n] + recursion(m - 1, n, grid, dp);
        int left = grid[m][n] + recursion(m, n - 1, grid, dp);
        
        return dp[m][n] = Math.min(up, left);
    }
}