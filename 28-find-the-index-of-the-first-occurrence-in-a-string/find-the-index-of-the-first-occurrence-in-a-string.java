class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0, n = haystack.length(), m = needle.length();
        char start = needle.charAt(0);
        
        if(m > n)
            return -1;
        while(i < n){
            char ch = haystack.charAt(i);
            
            if(ch == start){
                if(contains(i, m, haystack, needle))
                    return i;
            }
            i++;
        }
        
        return -1;
    }
    public boolean contains(int s, int n, String a, String b){
        int j = 0;
        for(int i = s; i < a.length() && j < n; i++){
            if(a.charAt(i) == b.charAt(j)){
                j++;
            }else{
                return false;
            }
            
        }
        
        return j == n ? true : false;
    }
}