class Solution {
    public boolean isCircularSentence(String sentence) {
        char start = sentence.charAt(0);
        // char last = "";
        String[] s = sentence.split(" ");
        
        for(int i = 0; i < s.length; i++){
            char last = s[i].charAt(s[i].length() - 1);
            if(i != s.length - 1){
                char first = s[i + 1].charAt(0);
                
                if(last != first){
                    return false;
                }
            }else{
                if(last != start){
                    return false;
                }
            }
        }
        System.out.println(Arrays.toString(s));
        
        return true;
    }
}