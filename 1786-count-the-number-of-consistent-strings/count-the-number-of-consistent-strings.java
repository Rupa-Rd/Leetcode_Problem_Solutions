class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // Bruteforce using set
        Set<Character> set = new HashSet<>();
        for(char c: allowed.toCharArray())
            set.add(c);
        
        int res = 0;
        for(String s: words){
            int charCount = 0;
            for(char ch: s.toCharArray()){
                if(set.contains(ch)){
                   charCount++; 
                }
            }
            if(charCount == s.length())
                res++;
        }
        
        return res;
    }
}