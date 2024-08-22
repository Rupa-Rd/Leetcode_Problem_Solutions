class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length == 0)
            return ans;
        
        int start = nums[0], end = nums[0];
        // String temp = "";
        
        for(int i = 1; i < nums.length; i ++){
            if(nums[i] != nums[i - 1] + 1){
                end = nums[i - 1];
                if(start == end){
                    ans.add(String.valueOf(start));
                }else{
                    ans.add(start + "->" + end);    
                }
                
                // ans.add(temp);
                start = nums[i];
            }
            
        }
        if(start == nums[nums.length - 1]){
            // temp = ""+ nums[nums.length - 1];
            ans.add(String.valueOf(nums[nums.length - 1]));
        }else{
            // temp = start + "->" + nums[nums.length - 1];
            ans.add(start + "->" + nums[nums.length - 1]);
        }
        
        return ans;
    }
}