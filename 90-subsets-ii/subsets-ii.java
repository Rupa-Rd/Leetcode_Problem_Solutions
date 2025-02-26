class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        solution(0, nums.length, nums, ans, new ArrayList<>());

        List<List<Integer>> finalAns = new ArrayList<>(ans);

        return finalAns;
    }
    public void solution(int indx, int n, int[] nums, Set<List<Integer>> ans, List<Integer> temp){
        if(indx == n){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[indx]);
        solution(indx + 1, n, nums, ans, temp);
        temp.remove(temp.size() - 1);
        solution(indx + 1, n, nums, ans, temp);
    }
}