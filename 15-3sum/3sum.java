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
        
        Set<List<Integer>> res  = new HashSet<>();
        // if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            int j =i+1;
           int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if (sum >0) k--;
                else if (sum<0) j++;
            }

        }
        return new ArrayList<>(res);
    }
        
       
}