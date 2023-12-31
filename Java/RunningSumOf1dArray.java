// https://leetcode.com/problems/running-sum-of-1d-array/description/

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums) {
        int tempSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tempSum = tempSum + nums[i];
            nums[i] = tempSum;
            // nums[i] = nums[i-1] + nums[i];

        }
        return nums;
    }
}
