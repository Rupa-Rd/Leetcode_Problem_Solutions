class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, count = 0;
        boolean[] visited = new boolean[n + 1];
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(i, isConnected, visited);
                count++;
            }
        }
        
        return count;
    }
    void dfs(int vertex, int[][] isConnected, boolean[] visited){
        visited[vertex] = true;
        
        for(int i = 0; i < isConnected.length; i++){
            if(isConnected[vertex][i] == 1 && !visited[i]){
                dfs(i, isConnected, visited);
            }
        }
    }
}