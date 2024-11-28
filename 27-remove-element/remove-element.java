class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0, n = nums.length;
        
        while(j < n){
            if(nums[j] != val && nums[i] == val){
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j] = temp;
            }
            if(nums[i] != val){
                i++;
            }
            j++;
        }
        
        return i;
    }
}