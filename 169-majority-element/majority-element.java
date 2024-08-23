class Solution {
    public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> ans = new HashMap<>();
        
//         for(int i = 0; i < nums.length; i ++)
//             ans.put(nums[i], ans.getOrDefault(nums[i], 0) + 1);
        
//         int n = nums.length;
        
//         for(Map.Entry<Integer,Integer> map: ans.entrySet()){
//             if(map.getValue() > n / 2)
//                 return map.getKey();
//         }
        
//         return -1;
        int candidate = nums[0], count = 0;
        for(int i = 0; i < nums.length; i ++){
            if(count == 0)
                candidate = nums[i];
            
            count += (candidate == nums[i]) ? 1 : -1;
        }
        
        return candidate;
    }
}