class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        recursiveSolution(0, candidates.length, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    // 7 - 2 = 5 - 2 = 3 - 2 = 1 + 2 = 3 => [2,2]
    public void recursiveSolution(int indx, int n, int[] candidates, int target, List<List<Integer>> ans, List<Integer> temp){

        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(indx == n){
            return;
        }
        
        if(candidates[indx] <= target){
            temp.add(candidates[indx]);
            recursiveSolution(indx, n, candidates, target - candidates[indx], ans, temp);
            temp.remove(temp.size() - 1);
        }
        recursiveSolution(indx + 1, n, candidates, target, ans, temp);

        
    }
}