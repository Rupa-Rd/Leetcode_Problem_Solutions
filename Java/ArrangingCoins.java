//https://leetcode.com/problems/arranging-coins/description/

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 5;
        int rows = 0;
        int j = 1;
        // if(n == 1 || n == 0){
        // return n;
        // }
        while (n >= j) {
            n = n - j;
            j += 1;
            rows++;
        }
        System.out.println(rows);
    }
}
