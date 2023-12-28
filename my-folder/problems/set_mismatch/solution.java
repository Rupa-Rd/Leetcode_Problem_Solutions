class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i <n){
            int CorrectIndex = nums[i] -1;
            if(nums[i] != nums[CorrectIndex]){
                swap(nums,i,CorrectIndex);
            }else{i++;}
        }
        for(int j = 0; j < n;j++){
            if(nums[j]!= j+1){
                return new int[] {nums[j],j+1};
            }
        }
        return new int[] {-1};
    }
    void swap(int[] nums, int i, int pos){
        int temp = nums[i];
        nums[i] = nums[pos];
        nums[pos] = temp;
    }
}