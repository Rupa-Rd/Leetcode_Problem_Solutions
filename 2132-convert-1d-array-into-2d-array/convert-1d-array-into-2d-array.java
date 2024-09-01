class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ans = new int[m][n];
        int k = 0, i = 0, size = original.length;
        
        if(size != m * n){
            return new int[0][0];
        }
        while(k < m){
            int j = 0;
            while(j < n){
                ans[k][j++] = original[i++];
            }
            
            k ++;
        }
        
        return ans;
    }
}