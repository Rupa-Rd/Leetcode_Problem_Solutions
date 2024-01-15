// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/

public class CountNegativeNumbersinaSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 }
        };
        int numberOfNegatives = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] < 0) {
                    numberOfNegatives += 1;
                }
            }
        }
        System.out.println(numberOfNegatives);
    }
}
