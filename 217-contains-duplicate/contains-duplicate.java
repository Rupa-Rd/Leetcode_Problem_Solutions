class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Bruteforce: O(nlogn + n)
//         Arrays.sort(nums);
        
//         for(int i = 1; i < nums.length; i ++){
//             if(nums[i] == nums[i - 1])
//                 return true;
//         }
        
//         return false;
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for(Integer i: nums)
//             map.put(i, map.getOrDefault(i, 0) + 1);
        
//         for(Map.Entry<Integer,Integer> entry: map.entrySet()){
//             if(entry.getValue() > 1)
//                 return true;
//         }
        
//         return false;
        
        // Using Hashset
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i ++){
            if(set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        
        return false;
    }
}