class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        // Set col as non zero 
        int col0 = 1;
        // Traverse to find the 0 element
        for(int i = 0; i < n ; i ++){
            for(int j = 0; j < m; j ++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j != 0){
                    matrix[0][j] = 0;
                }else{
                    col0 = 0;
                }
                }
                
            }
        }
        
        // Convert 1 as 0 for elements except 0th row and 0th col
        for(int i = 1; i < n; i ++){
            for(int j = 1; j < m; j ++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        
        // 0th row and 0th col elements
        if( matrix[0][0] == 0){
            for(int j = 0; j <m; j++){
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0){
            for(int i = 0; i < n; i ++){
                matrix[i][0] = 0;
                
            }
        }
      
        
    }
    
}