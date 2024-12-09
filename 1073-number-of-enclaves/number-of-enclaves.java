class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[] totalLand = {0};
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    totalLand[0] ++;
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            if(grid[i][0] == 1){
                dfs(i, 0, grid, totalLand);
            }
            if(grid[i][m - 1] == 1){
                dfs(i, m - 1, grid, totalLand);
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[0][j] == 1){
                    dfs(0, j, grid, totalLand);
                }
                if(grid[n - 1][j] == 1){
                    dfs(n - 1, j, grid, totalLand);
                }
            }
        }
        
        return totalLand[0];
    }
    
    public void dfs(int row, int col, int[][] grid, int[] totalLand){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0){
            return;
        }
        
        totalLand[0] --;
        grid[row][col] = 0;
        
        dfs(row - 1, col, grid, totalLand);
        dfs(row + 1, col, grid, totalLand);
        dfs(row, col - 1, grid, totalLand);
        dfs(row, col + 1, grid, totalLand);
    }
}
