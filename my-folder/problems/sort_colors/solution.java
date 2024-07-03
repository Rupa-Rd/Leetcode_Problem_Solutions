class Solution {
    public void sortColors(int[] nums) {
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        
        // Traverse to find the count of the each color
        for(int i = 0; i < nums.length; i ++){
            if(nums[i]== 0){
                count_0 ++;
            }else if(nums[i] == 1){
                count_1 ++;
            }else{
                count_2 ++;
            }
        }
        
        // Replace the frequency of colors in nums
        int j = 0;
        while(j < count_0){
            nums[j++] = 0;
        }
        while(j < count_0 + count_1){
            nums[j++] = 1;
        }while(j < nums.length){
            nums[j++] = 2;
        }
    }
}