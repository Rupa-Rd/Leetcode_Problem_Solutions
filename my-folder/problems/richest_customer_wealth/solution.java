class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = Integer.MIN_VALUE;
        for(int row = 0; row < accounts.length; row ++){
            int sum = 0;
            for(int col = 0; col < accounts[row].length; col ++){
                sum = sum + accounts[row][col];
            }
            if (sum > max_wealth){
                max_wealth = sum;
            }
        }
        return max_wealth;
    }
}