class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0, maxCount = 0, maxLength = 0, n = s.length();
        HashMap<Character, Integer> countMap = new HashMap<>();
        
        for(int end = 0; end < n; end ++){
            char ch = s.charAt(end);
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
            maxCount = Math.max(maxCount, countMap.get(ch));
            
            if(end - start + 1 - maxCount > k){
                char startChar = s.charAt(start);
                countMap.put(startChar, countMap.get(startChar) - 1);
                start ++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}