class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        
        for(int i = 0; i < n; i ++){
            int temp = nums[i];
            arr.add(temp);
            for(int j = i + 1; j < n; j ++){
                temp = temp + nums[j];
                arr.add(temp);
            }
        }
        Collections.sort(arr);
        int ans = 0, mod = (int) 1e9 + 7;
        for(int i = left - 1; i < right; i ++){
            ans = (ans + arr.get(i)) % mod;
        }
        
        return ans;
    }
}