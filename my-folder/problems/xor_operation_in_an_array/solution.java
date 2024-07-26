class Solution {
    public int xorOperation(int n, int start) {
        // Bruteforce
        int[] arr = new int[n];
        int ans = 0;
        for(int i = 0; i < n; i ++){
            arr[i] = start + 2 * i;
            ans ^= arr[i];
        }
        System.out.println(Arrays.toString(arr));
        return ans;
    }
}