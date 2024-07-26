class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        // Floyd warshall
        int[][] graph = new int[n][n];
        int res = 0, min = n;
        // Fill it with largest value
        for(int[] row: graph){
            Arrays.fill(row, 100000);
        }
        // Diagonal are 0
        for(int i = 0; i < n; i ++){
            graph[i][i] = 0;
        }
        // Fill the actual value
        for(int[] e: edges){
            graph[e[0]][e[1]] = graph[e[1]][e[0]] = e[2];
        }
        
        // Floyd warsall algorithm
        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i ++){
                for(int j = 0; j < n; j++){
                    graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                }
            }
        }
        
        // To find the neightbour city
        for(int i = 0; i < n; i++){
            int count =0;
            for(int j = 0; j < n; j ++){
                if(graph[i][j] <= distanceThreshold){
                    count++;
                }
            }
            if(count <= min){
                res = i;
                min = count;
            }
        }
        
        return res;
    }
}