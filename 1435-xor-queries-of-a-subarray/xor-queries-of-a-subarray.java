class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] res = new int[queries.length];
        int k = 0;
        
        for(int[] q: queries){
            int l = q[0], r = q[1], ans = arr[l];
            
            for(int i = l + 1; i <= r; i++){
                ans ^= arr[i];
            }
            res[k++] = ans;
        }
        
        return res;
    }
}