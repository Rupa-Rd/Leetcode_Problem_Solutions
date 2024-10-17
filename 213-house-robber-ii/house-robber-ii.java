class Solution {
    public int rob(int[] nums) {
        List<Integer> A1 = new ArrayList<>();
        List<Integer> A2 = new ArrayList<>();
        
        int n = nums.length;
        if(n < 2)
            return nums[0];
        for(int i = 0; i < n; i++){
            if(i != 0){
                A2.add(nums[i]);
            }
            if(i != n - 1){
                A1.add(nums[i]);
            }
        }
        // int ans1 = Integer.MIN_VALUE, ans2 = Integer.MIN_VALUE;
        // if(!A1.isEmpty()){
        //     ans1 = solve(A1);
        // }
        // if(!A2.isEmpty()){
        //     ans2 = solve(A2);
        // }
        return Math.max(solve(A1), solve(A2));
        
    }
    public int solve(List<Integer> A){
        int n = A.size(), prev = 0, curr = A.get(0);
        
        for(int i = 1; i < n; i++){
            int taken = A.get(i);
            if(i > 1){
                taken += prev;
            }
            int notTaken = curr;
            
            prev = curr;
            curr = Math.max(taken, notTaken);
        }
        
        return curr;
    }
}