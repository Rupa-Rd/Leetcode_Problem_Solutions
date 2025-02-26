class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        solution(0, candidates.length, candidates, ans, target, new ArrayList<>());
        return ans;
    }
    public void solution(int indx, int n, int[] candidates, List<List<Integer>> ans, int target, List<Integer> temp){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(indx == n){
            return;
        }

        for(int i = indx; i < n; i++){
            if(i != indx && candidates[i] == candidates[i - 1]){
                continue;
            }
            if(candidates[i] > target){
                break;
            }
            temp.add(candidates[i]);
                solution(i + 1, n, candidates, ans, target - candidates[i], temp);
                temp.remove(temp.size() - 1);
            // solution(indx + 1, n, candidates, ans, target, temp);
        }
    }
}