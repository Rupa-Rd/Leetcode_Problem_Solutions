class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            
            int CorrectIndex = arr[i] - 1;
            if (arr[i] != arr[CorrectIndex]) {
                swap(arr, i, CorrectIndex);
            } else {
                i++;
            }
        }
        List <Integer> ans = new ArrayList();
        for(int j = 0; j < arr.length; j ++){
            if(arr[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    void swap(int[] arr, int PrePos, int CurPos) {
        int temp = arr[PrePos];
        arr[PrePos] = arr[CurPos];
        arr[CurPos] = temp;
    }
}