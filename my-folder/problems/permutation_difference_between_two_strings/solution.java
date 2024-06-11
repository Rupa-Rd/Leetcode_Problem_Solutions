class Solution {
    public int findPermutationDifference(String s, String t) {
        int score = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i ++){
            char ch1 = s.charAt(i);
            map.put(ch1, i);
            
        }
        for(int j = 0; j < t.length(); j ++){
            char ch2 = t.charAt(j);
            score += Math.abs(map.get(ch2) - j);
        }
        
        return score;
    }
}