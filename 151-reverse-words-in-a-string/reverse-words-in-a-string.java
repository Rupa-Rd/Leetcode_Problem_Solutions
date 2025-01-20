class Solution {
    public String reverseWords(String s) {
        StringBuilder output = new StringBuilder();
        String[] words = s.split("\\s+");
        
        for(int i = words.length - 1; i >= 0; i--){
            String word = words[i];
            output.append(word);
            if(i > 0){
                output.append(" ");
            }
        }

        return output.toString().trim();
    }
}