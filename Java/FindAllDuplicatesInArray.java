// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < arr.length) {

            int CorrectIndex = arr[i] - 1;
            if (arr[i] != arr[CorrectIndex]) {
                swap(arr, i, CorrectIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int PrePos, int CurPos) {
        int temp = arr[PrePos];
        arr[PrePos] = arr[CurPos];
        arr[CurPos] = temp;
    }
}
