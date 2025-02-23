class Solution {
    public int strStr(String haystack, String needle) {
        int j = 0, n = haystack.length(), m = needle.length();

        if(m > n){
            return -1;
        }
        for(int i = 0; i < n - m + 1; i++){
            int k = i;
            while(j < m && k < n && haystack.charAt(k) == needle.charAt(j)){
                j++;
                k++;
            }

            if(j == m){
                return i;
            }else{
                j = 0;
            }
        }

        return -1;
    }
}