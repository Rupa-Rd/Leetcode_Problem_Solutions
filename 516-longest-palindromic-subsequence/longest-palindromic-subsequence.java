class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];
        StringBuilder temp = new StringBuilder();
        temp.append(s);
        String t = temp.reverse().toString();
        for(int[] r: dp)
            Arrays.fill(r, - 1);
        for(int i = 0; i <= n; i++)
            dp[i][0] = 0;
        for(int j = 0; j <= n; j++)
            dp[0][j] = 0;
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