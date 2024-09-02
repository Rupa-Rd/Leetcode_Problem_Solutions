class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Bruteforce: O(n^3)
//         List<List<Integer>> ans = new ArrayList<>();
//         int n = nums.length;
        
//         for(int i = 0; i < n; i ++){
            
//             for(int j = i + 1; j < n; j ++){
//                 for(int k = j + 1; k < n; k ++){
//                     ArrayList<Integer> temp = new ArrayList<>();
//                     if(nums[i] + nums[j] + nums[k] == 0){
//                         temp.add(nums[i]);
//                         temp.add(nums[j]);
//                         temp.add(nums[k]);
//                         Collections.sort(temp);
//                         if(!ans.contains(temp))
//                         ans.add(new ArrayList<>(temp));
                        
//                     }
                    
//                 }
                
//             }
//         }
        
//         return ans;
        
        // Optimal solution: O(n^2)
        if(nums.length < 3)
            return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -2 ; i++){
            if(i > 0 && nums[i] == nums[i - 1]) 
                continue;
            int left = i + 1, right = nums.length - 1;
            
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    while(left < right && nums[left] == nums[left + 1])
                            left++;
                    while(left < right && nums[right] == nums[right - 1])
                            right --;
                    
                    left++;
                    right--;
                }else if(sum <0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        
        return ans;
    }
        
       
}