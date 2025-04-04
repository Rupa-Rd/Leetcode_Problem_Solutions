class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freqSet = new HashMap<>();

        for(char ch: s.toCharArray()){
            freqSet.put(ch, freqSet.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(freqSet.entrySet());

        StringBuilder answer = new StringBuilder();

        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> singleEntry = pq.poll();

            answer.append(String.valueOf(singleEntry.getKey()).repeat(singleEntry.getValue()));
        }

        return answer.toString();

    }
}