// https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };

        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int CorrectIndex = nums[i] - 1;
            if (nums[i] != nums[CorrectIndex]) {
                swap(nums, i, CorrectIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return new int[] { nums[j], j + 1 };
            }
        }
        return new int[] { -1 };
    }

    static void swap(int[] nums, int i, int pos) {
        int temp = nums[i];
        nums[i] = nums[pos];
        nums[pos] = temp;
    }
}
