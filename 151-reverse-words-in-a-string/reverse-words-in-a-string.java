class Solution {
    public String reverseWords(String s) {
        StringBuilder output = new StringBuilder();
        String[] words = s.trim().split(" ");
        
        for(int i = words.length - 1; i >= 0; i--){
            String word = words[i];
            if(word.length() != 0 && i != 0){
                output.append(word).append(" ");
                
            }
            else if(i == 0 && word.length() != 0){
                output.append(word);
            }
        }

        return output.toString();
    }
}