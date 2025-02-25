class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        possibleSubsets(0, nums.length, nums, ans, new ArrayList<>());
        return ans;
    }
    public void possibleSubsets(int indx, int n, int[] nums, List<List<Integer>> ans, List<Integer> temp){
        if(indx == n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[indx]);
        possibleSubsets(indx + 1, n, nums, ans, temp);
        temp.remove(temp.size() - 1);
        possibleSubsets(indx + 1, n, nums, ans, temp);
    }
}