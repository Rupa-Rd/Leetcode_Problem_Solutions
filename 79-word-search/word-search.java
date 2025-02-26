class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length, col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for(int i = 0; i < row; i++)   {
            for(int j = 0; j < col; j++){
                if(board[i][j] == word.charAt(0)){
                    if(solution(i, j, row, col, board, 0, word, visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean solution(int i, int j, int row, int col, char[][] board, int indx, String word, boolean[][] visited){
        if(indx == word.length()){
            return true;
        }
        if(i < 0 || j < 0 || i >= row || j >= col || board[i][j] != word.charAt(indx) || visited[i][j]){
            return false;
        }

        visited[i][j] = true;

        if(solution(i + 1, j, row, col, board, indx + 1, word, visited) ||
        solution(i - 1, j, row, col, board, indx + 1, word, visited) ||
        solution(i, j + 1, row, col, board, indx + 1, word, visited) ||
        solution(i, j - 1, row, col, board, indx + 1, word, visited) ){
            return true;
        }
    visited[i][j] = false;
        return false;
    }
}