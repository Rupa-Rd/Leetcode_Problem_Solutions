class Pair{
    int row, col, diff;
    
    Pair(int row, int col, int diff){
        this.row = row;
        this.col = col;
        this.diff = diff;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length, m = heights[0].length;
        
        if(n == 1 && m == 1)
            return 0;
        
        int[][] dist = new int[n][m];
        
        for(int i = 0; i < n; i++){
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.diff - y.diff);
        pq.add(new Pair(0, 0, 0));
        
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        while(!pq.isEmpty()){
            Pair top = pq.poll();
            int r = top.row;
            int c = top.col;
            int we = top.diff;
            
            for(int[] d: directions){
                int rd = r + d[0], cd = c + d[1];
                
                if(rd >= 0 && rd < n && cd >= 0 && cd < m){
                    int newDiff = Math.max(we, Math.abs(heights[r][c] - heights[rd][cd]));
                    if(newDiff < dist[rd][cd]){
                    dist[rd][cd] = newDiff;
                    pq.add(new Pair(rd, cd, dist[rd][cd]));
                    }
                }
            }
        }
        
        if(dist[n - 1][m - 1] == Integer.MAX_VALUE){
            return -1;
        }
        return dist[n - 1][m - 1];
    }
}