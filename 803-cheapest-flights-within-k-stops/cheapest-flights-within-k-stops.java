class Pair{
    int dest, price;
    Pair(int dest, int price){
        this.dest = dest;
        this.price = price;
    }
}
class Triple{
    int src, price, stops;
    Triple(int src, int price, int stops){
        this.src = src;
        this.price = price;
        this.stops = stops;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] price = new int[n];
        Arrays.fill(price, Integer.MAX_VALUE);
        
        price[src] = 0;
        
        Queue<Triple> q = new LinkedList<>();
        q.add(new Triple(src, 0, 0));
        
        // Converting the flights list into graph
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < flights.length; i++){
            int sr = flights[i][0];
            int dt = flights[i][1];
            int pr = flights[i][2];
            
            adj.get(sr).add(new Pair(dt, pr));
        }
        
        while(!q.isEmpty()){
            Triple top = q.poll();
            
            int v = top.src;
            int pri = top.price;
            int stops = top.stops;
            
            
            if(stops > k){
                continue;
            }
            
            for(Pair edges: adj.get(v)){
               int dest = edges.dest;
                int cost = edges.price;
                
                if(pri + cost < price[dest] && stops <= k){
                    price[dest] = pri + cost;
                    q.add(new Triple(dest, price[dest], stops + 1));
                }
            }
        }
        
        if(price[dst] == Integer.MAX_VALUE)
            return -1;
        return price[dst];
    }
}