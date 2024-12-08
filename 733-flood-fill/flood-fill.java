class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length, m = image[0].length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == sr && j == sc && image[i][j] != color){
                    bfs(image, sr, sc, color, image[i][j]);
                }
            }
        }
        
        return image;
    }
    public void bfs(int[][] image, int sr, int sc, int color, int startColor){
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr, sc});
        image[sr][sc] = color;
        
        while(!q.isEmpty()){
            int[] top = q.poll();
            int r = top[0], c = top[1];
            
            for(int[] d: directions){
                int rd = r + d[0], cd = c + d[1];
                
                if(rd >= 0 && rd < image.length && cd >= 0 && cd < image[0].length && image[rd][cd] == startColor){
                    image[rd][cd] = color;
                    q.add(new int[]{rd, cd});
                }
            }
        }
    }
}