class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0, tempLen = 0;
        String palindrome = "";
        
        for(int start = 0; start < s.length(); start ++){
            for(int end = start + 1; end < s.length(); end ++){
                if(isPalindrome(s, start, end)){
                    tempLen = (end - start) + 1;
                    if(tempLen > maxLen){
                        maxLen = tempLen;
                        palindrome = s.substring(start, end + 1);
                    }
                }
            }
        }
        if(palindrome == ""){
            palindrome = s.charAt(0) + "";
        }
        return palindrome;
    }
    public boolean isPalindrome(String str, int s, int e){
        
        while(s < e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }        
        return true;
    }
}