class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0, start = 0;
        String ans = "";
        
        for(int i = 0; i < s.length(); i++){
            
            for(int j = 0; j <= 1; j++){
                int low = i, high = i + j;
                
                
                while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
                    int currLen = high - low + 1;
                    if(currLen > maxLen){
                        maxLen = currLen;
                        start = low;
                    }
                    low --;
                    high++;
                }
                ans = s.substring(start, start + maxLen);
            }
        }
        return ans;
    }
}