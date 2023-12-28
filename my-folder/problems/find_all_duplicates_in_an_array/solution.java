class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < arr.length) {
            
            int CorrectIndex = arr[i] - 1;
            if (arr[i] != arr[CorrectIndex]) {
                swap(arr, i, CorrectIndex);
            } 
            else{i++;}
        }
        for (int j = 0; j <arr.length;j++){
            if(arr[j] != j+1){
                ans.add(arr[j]);
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