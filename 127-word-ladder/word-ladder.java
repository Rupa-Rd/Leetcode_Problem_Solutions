class Pair{
    String word;
    int length;
    Pair(String word, int length){
        this.word = word;
        this.length = length;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>();
        
        for(String word: wordList)
            set.add(word);
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        
        set.remove(beginWord);
        while(!q.isEmpty()){
            Pair top = q.poll();
            String word = top.word;
            int steps = top.length;
            
            if(word.equals(endWord))
                return steps;
            
            for(int i = 0; i < word.length(); i++){
                for(char ch = 'a'; ch <= 'z'; ch++){
                    char[] letters = word.toCharArray();
                    letters[i] = ch;
                    String replaceWord = new String(letters);
                    
                    if(set.contains(replaceWord)){
                        set.remove(replaceWord);
                        q.add(new Pair(replaceWord, steps + 1));
                    }
                }
            }
        }
        
        return 0;
    }
}