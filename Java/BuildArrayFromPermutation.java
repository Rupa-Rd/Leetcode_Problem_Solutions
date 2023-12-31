// https://leetcode.com/problems/build-array-from-permutation/description/

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4 };
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
