class Solution {
    public String triangleType(int[] nums) {
        if(triangle(nums)){
            int a = nums[0];
            int b = nums[1];
            int c = nums[2];
        
        if (a == b && a == c){
            return "equilateral";
        }else if(b == c || a == c || a == b){
            return "isosceles";
        }else{
            return "scalene";
        }
          }
        return "none";
    }
    public Boolean triangle(int[] nums){
        if(nums[0]+nums[1]>nums[2] && nums[0]+nums[2] > nums[1] && nums[1]+ nums[2] > nums[0]){
            return true;
        }
        return false;
    } 
}