class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int nrows = matrix.length;
        int ncols = matrix[0].length;
        int row = 0;
        
        for(int i = 0; i < nrows; i ++){
            if(target < matrix[i][ncols-1]){
                row = i;
                break;
            }
            else if(target == matrix[i][ncols-1])
                return true;
        }
        
        for(int i = 0; i < ncols; i ++)
            if(matrix[row][i] == target)
                return true;
        
        return false;
    }
}