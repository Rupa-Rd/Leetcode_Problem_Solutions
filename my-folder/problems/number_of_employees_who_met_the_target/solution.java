class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        for(Integer i: hours){
            if(i>=target){
                ans++;
            }
        }
        
        return ans;
    }
}