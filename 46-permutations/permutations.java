class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // Bruteforce
//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> temp = new ArrayList<>();
//         boolean[] flag = new boolean[nums.length];
//         Arrays.fill(flag, false);
        
//         recursivePermute(nums, temp, ans, flag);
        
//         return ans;
        // Optimized solution: O(N)
        List<List<Integer>> ans = new ArrayList<>();
        
        recursivePermute(0, nums, ans);
        
        return ans;
    }
    // Optimized solution
    public void recursivePermute(int indx, int[] nums, List<List<Integer>> ans){
        if(indx == nums.length){
            
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < nums.length; i ++){
                temp.add(nums[i]);
            }
            ans.add(new ArrayList<>(temp));
        }
        
        for(int i = indx; i < nums.length; i ++){
            swap(i, indx, nums);
            recursivePermute(indx+1, nums, ans);
            swap(i, indx, nums);
        }
    }
    
    public void swap(int i, int j, int[] A){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    // Time Complexity: O(n^2)
//     public void recursivePermute(int[] nums, List<Integer> temp, List<List<Integer>> ans, boolean[] flag){
//         if(temp.size() == nums.length)
//             ans.add(new ArrayList<>(temp));
        
//         for(int i =0; i < nums.length; i ++){
//             if(!flag[i]){
//                 temp.add(nums[i]);
//                 flag[i] = true;
//                 recursivePermute(nums, temp, ans, flag);
//                 temp.remove(temp.size() - 1);
//                 flag[i] = false;
//             }
//         }
    // }
}