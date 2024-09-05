class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Bruteforce: O(N logN)
//         HashMap<Integer, Integer> freq = new HashMap<>();
        
//         for(int i: nums)
//             freq.put(i, freq.getOrDefault(i, 0) + 1);
        
//         List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(freq.entrySet());
//         sortedList.sort((b, a) -> a.getValue() - b.getValue());
        
//         System.out.println(sortedList);
//         int[] res = new int[k];
//         for(int i = 0; i< k; i++){
//             res[i] = sortedList.get(i).getKey();
//         }
        
//         return res;
        
        // Optimal solution: O(N logK)
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(int i: nums)
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        
        for(Map.Entry<Integer, Integer> e: freq.entrySet()){
            pq.add(e);
            if(pq.size() > k){
                pq.poll();
            }
        }
        System.out.println(pq);
        
        int[] res = new int[k];
        int i = 0;
        while(!pq.isEmpty()){
            res[i++] = pq.remove().getKey();
        }
        return res;
    }
}