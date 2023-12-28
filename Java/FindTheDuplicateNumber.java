// https://leetcode.com/problems/find-the-duplicate-number/

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int CorrectIndex = arr[i] - 1;
                if (arr[i] != arr[CorrectIndex]) {
                    swap(arr, i, CorrectIndex);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    static void swap(int[] arr, int PrePos, int CurPos) {
        int temp = arr[PrePos];
        arr[PrePos] = arr[CurPos];
        arr[CurPos] = temp;
    }
}
