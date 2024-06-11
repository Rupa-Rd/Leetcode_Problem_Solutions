class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int score = 0;
        for(int i =0; i< n-1; i++){
            int char1 = (int) s.charAt(i);
            int char2 = (int) s.charAt(i+1);
            int temp = Math.abs(char1 - char2);
            score += temp;
        }
        return score;
    } 
}