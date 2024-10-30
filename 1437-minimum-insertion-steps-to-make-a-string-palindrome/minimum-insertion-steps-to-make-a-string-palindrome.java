class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        String t = new StringBuilder(s).reverse().toString();
        int[][] dp = new int[n + 1][n + 1];
        for(int[] r: dp)
            Arrays.fill(r, -1);
        for(int i = 0; i <= n; i++){
            dp[i][0] = 0;
            dp[0][i] = 0;
        }
        
        int k = lcs(s, t, n, dp);
        
        return n - k;
    }
    public int lcs(String s, String t, int n, int[][] dp){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return dp[n][n];
    }
}