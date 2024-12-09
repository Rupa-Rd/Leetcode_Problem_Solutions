class Solution {
    public void solve(char[][] board) {
        int n = board.length, m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        
        for(int i = 0; i < n; i++){
            if(board[i][0] == 'O' && !visited[i][0]){
                        dfs(i, 0, board, visited);
            }
            if(board[i][m - 1] == 'O' && ! visited[i][m - 1]){
                dfs(i, m - 1, board, visited);
            }
            
        }
        
        for(int j = 0; j < m; j++){
            if(board[0][j] == 'O' && !visited[0][j]){
                        dfs(0, j, board, visited);
            }
            if(board[n - 1][j] == 'O' && ! visited[n - 1][j]){
                dfs(n - 1, j, board, visited);
            }
            
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 'O' && !visited[i][j]){
                    convertRegionUsingDFS(i, j, board, visited);
                }
            }
        }
    }
    public void convertRegionUsingDFS(int row, int col, char[][] board, boolean[][] visited){
        if(row <= 0 || col <= 0 || row >= board.length - 1 || col >= board[0].length - 1 || board[row][col] != 'O' || visited[row][col]){
            return;
        }
        
        board[row][col] = 'X';
        visited[row][col] = true;
        
        convertRegionUsingDFS(row - 1, col, board, visited);
        convertRegionUsingDFS(row + 1, col, board, visited);
        convertRegionUsingDFS(row, col - 1, board, visited);
        convertRegionUsingDFS(row, col + 1, board, visited);
        
    }
    public void dfs(int row, int col, char[][] board, boolean[][] visited){
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != 'O' || visited[row][col]){
            return;
        }
        
        visited[row][col] = true;
        
        dfs(row - 1, col, board, visited);
        dfs(row + 1, col, board, visited);
        dfs(row, col - 1, board, visited);
        dfs(row, col + 1, board, visited);
    }
}