class Solution {
    public int mostWordsFound(String[] sentences) {
//         int maxWords = 0;
        
//         for(String sentence: sentences){
//             int temp = 1;
//             for(char ch: sentence.toCharArray()){
//                 if (ch == ' '){
//                     temp ++;
//                 }
//             }
//             if(temp > maxWords){maxWords = temp;}
//         }
//         return maxWords;
        
        int max = -1;
        
        for(String sentence: sentences){
            max = Math.max(max, sentence.split(" ").length);
        }
        return max;
    }
}