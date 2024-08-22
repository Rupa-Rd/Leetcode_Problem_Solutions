class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        ans = merge(word1.length(), word2.length(), word1, word2, ans);
        
        return ans;
    }
    public String merge(int n, int m, String str1, String str2, String ans){
        int i = 0, j = 0, k = 0;
        
        while(i < n && j < m){
            if(k % 2 == 0){
                ans = ans + str1.charAt(i);
                i ++;
            }else{
                ans = ans + str2.charAt(j);
                j ++;
            }
            k ++;                
        }
        
        while(i < n){
            ans += str1.charAt(i);
            i++;
        }
        
        while(j < m){
            ans += str2.charAt(j);
            j ++;
        }
        System.out.println(ans);
        
        return ans;
    }
}