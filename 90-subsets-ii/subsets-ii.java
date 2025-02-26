class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> finalAns = new ArrayList<>();
        Arrays.sort(nums);
        solution(0, nums.length, nums, finalAns, new ArrayList<>());

        

        return finalAns;
    }
    public void solution(int indx, int n, int[] nums, List<List<Integer>> ans, List<Integer> temp){
        ans.add(new ArrayList<>(temp));
        
        for(int i = indx; i < n; i++){
            if(i != indx && nums[i] == nums[i - 1]){
                continue;
            }
            temp.add(nums[i]);
            solution(i + 1, n, nums, ans, temp);
            temp.remove(temp.size() - 1);
            // solution(indx + 1, n, nums, ans, temp);
        }

        
    }
}