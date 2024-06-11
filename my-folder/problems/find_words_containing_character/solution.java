class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        // Brute Force
        List<Integer> ans = new ArrayList<>();
        
        int i=0;
        for(String word: words){
            for(char ch: word.toCharArray()){
                if(ch == x){
                    ans.add(i);   
                    break;
                }
            }
            i ++;
        }
        return ans;
    }
}