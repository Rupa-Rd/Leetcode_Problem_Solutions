// https://leetcode.com/problems/richest-customer-wealth/description/

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int max_wealth = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum = sum + accounts[row][col];
            }
            if (sum > max_wealth) {
                max_wealth = sum;
            }
        }
        return max_wealth;
    }
}
