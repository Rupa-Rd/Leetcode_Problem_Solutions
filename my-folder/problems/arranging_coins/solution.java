class Solution {
    public int arrangeCoins(int n) {
        int rows = 0;
        int j = 1;
        // if(n == 1 || n == 0){
        //     return n;
        // }
        while(n >= j){
            n = n - j;
            j +=1;
            rows++;
        }
        return rows;
    }
}