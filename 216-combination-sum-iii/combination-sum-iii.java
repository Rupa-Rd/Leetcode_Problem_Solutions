class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = new int[9];
        for(int i = 0; i < 9; i++){
            nums[i] = i + 1;
        }
        List<List<Integer>> ans = new ArrayList<>();
        // solution(0, 0, k, nums, ans, n, new ArrayList<>());
        solution2(1, 0, k, ans, n, new ArrayList<>());
        return ans;
    }
    public void solution2(int indx, int currSum, int k, List<List<Integer>> ans, int target, List<Integer> temp){
        if(temp.size() == k){
            if(currSum == target){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        for(int i = indx; i <= 9; i++){
            
            temp.add(i);
            currSum += i;
            solution2(i + 1, currSum, k, ans, target, temp);
            currSum -= i;
            temp.remove(temp.size() - 1);
        }
    }
    public void solution(int indx, int j, int k, int[] nums, List<List<Integer>> ans, int target, List<Integer> temp){
        if(j == k){
            if(target == 0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(indx == 9){
            return;
        }

        if(nums[indx] <= target){
            temp.add(nums[indx]);
            solution(indx + 1, j + 1, k, nums, ans, target - nums[indx], temp);
            temp.remove(temp.size() - 1);
        }
        solution(indx + 1, j, k, nums, ans, target, temp);
    }
}