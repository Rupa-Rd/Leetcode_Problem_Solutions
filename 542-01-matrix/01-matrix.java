class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int[][] distance = new int[n][m];
        for(int[] a: distance)
            Arrays.fill(a, 0);
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i, j});
                }
            }
        }
        
        int[][] directions = {{-1, 0},{1, 0}, {0, -1}, {0, 1}};
        
        while(!q.isEmpty()){
            int[] top = q.poll();
            int r = top[0], c = top[1];
            
            for(int[] d: directions){
                int rd = r + d[0], cd = c + d[1];
                
                if(rd >= 0 && cd >= 0 && rd < n && cd < m && mat[rd][cd] == 1 && distance[rd][cd] == 0){
                    q.add(new int[]{rd, cd});
                    distance[rd][cd] = distance[r][c] + 1;
                    
                }
            }
        }
        
        return distance;
    }
}