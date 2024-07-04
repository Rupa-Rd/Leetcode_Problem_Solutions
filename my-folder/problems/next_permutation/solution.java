class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i = n - 2; i >= 0; i --){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        System.out.print(index);
        if(index == -1){
            reverse(nums);
        }else{
            for(int i = n- 1; i >= 0; i -- ){
                if(nums[i] > nums[index]){
                    System.out.println(nums[i]);
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            System.out.println(Arrays.toString(nums));
            // if(n-(index+1) == 2){
            //     int temp = nums[index+1];
            //     nums[index+1] = nums[n-1];
            //     nums[n-1] = temp;
            // }else{
            for(int i = index+1, j = n-1; i<j ; i ++, j--){
                System.out.println(nums[i]);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;}
        // }
            // Collections.reverse(Arrays.asList(a));
        }
        
        
    }
    public void reverse(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n /2; i ++){
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
    }
}