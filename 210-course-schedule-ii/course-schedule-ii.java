class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for(int i = 0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i = 0; i < prerequisites.length; i++){
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        int[] indegree = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            for(int neigh: graph.get(i)){
                indegree[neigh] ++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int[] topo = new int[numCourses];
        int i = 0;
        
        while(!q.isEmpty()){
            int top = q.poll();
            topo[i++] = top;    
            
            for(int neigh: graph.get(top)){
                indegree[neigh] --;
                if(indegree[neigh] == 0){
                    q.add(neigh);
                }
            }
        }
        
        if(i == numCourses){
            return topo;
        }else{
            return new int[]{};
        }
    }
}