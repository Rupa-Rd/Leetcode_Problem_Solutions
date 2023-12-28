// https://leetcode.com/problems/first-missing-positive/description/

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0 };
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] < n && nums[i] != nums[correct]) {
                swap(nums, i, correct);

            } else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return n + 1;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
