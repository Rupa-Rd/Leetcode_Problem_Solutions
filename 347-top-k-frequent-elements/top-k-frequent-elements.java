class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Bruteforce: O(N logN)
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(int i: nums)
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        
        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(freq.entrySet());
        sortedList.sort((b, a) -> a.getValue() - b.getValue());
        
        System.out.println(sortedList);
        int[] res = new int[k];
        for(int i = 0; i< k; i++){
            res[i] = sortedList.get(i).getKey();
        }
        
        return res;
    }
}