import java.util.*;

class Pair {
    int weight, row, col;
    
    Pair(int row, int col, int weight){
        this.row = row;
        this.col = col;
        this.weight = weight;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int v = grid.length;
        if (grid[0][0] == 1 || grid[v - 1][v - 1] == 1) {
            return -1; // Early return if the start or end is blocked
        }

        int[][] dist = new int[v][v];
        
        for (int i = 0; i < v; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        
        dist[0][0] = 0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.weight - y.weight);
        pq.add(new Pair(0, 0, 0));
        
        int[][] directions = {
            {0, 1}, {1, 0}, {0, -1}, {-1, 0}, // Horizontal and Vertical
            {1, 1}, {1, -1}, {-1, 1}, {-1, -1} // Diagonals
        };
        
        while (!pq.isEmpty()) {
            Pair top = pq.poll();
            int r = top.row;
            int c = top.col;
            int w = top.weight;
            
            if (r == v - 1 && c == v - 1) {
                return dist[r][c] + 1; // We have reached the bottom-right corner
            }

            for (int[] d : directions) {
                int rd = r + d[0];
                int cd = c + d[1];

                if (rd >= 0 && rd < v && cd >= 0 && cd < v && grid[rd][cd] == 0 && dist[r][c] + 1 < dist[rd][cd]) {
                    dist[rd][cd] = dist[r][c] + 1;
                    pq.add(new Pair(rd, cd, dist[rd][cd]));
                }
            }
        }
        
        return -1; // If we can't reach the destination
    }
}
