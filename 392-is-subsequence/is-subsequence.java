class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0, n = t.length(), m = s.length();
        
        while(i < n && j < m){
            if(t.charAt(i) == s.charAt(j))
                j ++;
            i ++;
        }
        
        return j == m;
    }
}