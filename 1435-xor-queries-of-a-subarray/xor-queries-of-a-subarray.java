class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        // Bruteforce: O(N * Q)
//         int[] res = new int[queries.length];
//         int k = 0;
        
//         for(int[] q: queries){
//             int l = q[0], r = q[1], ans = arr[l];
            
//             for(int i = l + 1; i <= r; i++){
//                 ans ^= arr[i];
//             }
//             res[k++] = ans;
//         }
        
//         return res;
        // Better solution with addition space: O(N + Q)
//         int[] preXOR = new int[arr.length + 1];
//         int[] res = new int[queries.length];
//         for(int i = 0; i < arr.length; i++){
//             preXOR[i + 1] = preXOR[i] ^ arr[i];
//         }
        
//         for(int i = 0; i < queries.length; i++){
//             res[i] = preXOR[queries[i][1] + 1] ^ preXOR[queries[i][0]];
//         }
//         return res;
        // Optimal solution: O(n + q)
        int[] res = new int[queries.length];
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i - 1] ^ arr[i];
        }
        
        for(int i = 0; i < queries.length; i++){
            if(queries[i][0] > 0){
                res[i] = arr[queries[i][1]] ^ arr[queries[i][0] - 1];    
            }else{
                res[i] = arr[queries[i][1]];
            }
            
        }
        return res;
    }
}