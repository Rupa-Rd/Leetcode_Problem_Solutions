//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(ans(arr, target)));
    }

    static int[] ans(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int j = i + 1;
            while (j < numbers.length) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] { i + 1, j + 1 };
                } else {
                    j++;
                }

            }
        }
        return new int[] { -1, -1 };

    }

}
