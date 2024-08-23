class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i = 0, j = 0, minLength = Integer.MAX_VALUE, strLen = strs.length;
        
        for(String s: strs)
            minLength = Math.min(minLength, s.length());
        
        // String ans = "";
        while(i < minLength){
            for(String s: strs){
                if(s.charAt(i) != strs[0].charAt(i))
                    return strs[0].substring(0,i);
            }
            i++;  
        }
        
        return strs[0].substring(0,i);
        
    }
}