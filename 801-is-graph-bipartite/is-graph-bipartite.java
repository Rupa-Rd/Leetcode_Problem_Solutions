class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        
        for(int i = 0; i < n; i++){
            color[i] = -1;
        }
        for(int i = 0; i < n; i++){
            if(color[i] == -1){
                if(dfs(i, graph, 0, color) == false){
                    return false;
                }    
            }
            
        }
        
        return true;
    }
    boolean dfs(int start, int[][] graph, int col, int[] color){
        
        color[start] = col;
        
        for(int i = 0; i < graph[start].length; i++){
            if(color[graph[start][i]] == -1){
                if(dfs(graph[start][i], graph, 1 - col, color) == false)
                    return false;
            }else if(color[graph[start][i]] == col){
                return false;
            }
        }
        return true;
    }
}