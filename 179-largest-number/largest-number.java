class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] number =  new String[n];
        
        for(int i = 0; i < n; i++){
            number[i] = Integer.toString(nums[i]);
        }
        
        Arrays.sort(number, (a, b) -> (b + a).compareTo(a + b));
        
        if(number[0].equals("0")){
            return "0";
        }
        
        StringBuilder ans = new StringBuilder();
        
        for(String temp: number){
            ans.append(temp);
        }
        
        return ans.toString();
        
    }
}