class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int[] ans = new int[2];
//         for(int i = 0; i < nums.length; i++){
//             for (int j = i; j < nums.length; j ++){
//                 if (nums[i] + nums[j] == target){
//                     ans[0] = i;
//                     ans[1] = j;
//                     break;
//                 }
//             }
//         }
        
//         return ans;
        // Two pointer concept
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = {-1, -1};
        int n = nums.length;
        
        for(int i = 0; i < n; i ++){
            int temp = target - nums[i];
            
            if(map.containsKey(temp)){
                ans[0] = map.get(temp);
                ans[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }
        
        return ans;
    }
}