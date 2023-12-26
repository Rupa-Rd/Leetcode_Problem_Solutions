class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i] != i +1){
            int CorrectIndex = arr[i] - 1;
            if (arr[i] != arr[CorrectIndex]) {
                swap(arr, i, CorrectIndex);
            } else {
                return arr[i];
            }
            }else{i++;}
        }
        
       return -1;
    }
    void swap(int[] arr, int PrePos, int CurPos) {
        int temp = arr[PrePos];
        arr[PrePos] = arr[CurPos];
        arr[CurPos] = temp;
    }
}