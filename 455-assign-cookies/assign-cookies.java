class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Brutefore: O(nlogn + mlogm + m * n)
//         ArrayList<Integer> sizeOfCookies = new ArrayList<>();
//         for(int i: s)
//             sizeOfCookies.add(i);
//         Arrays.sort(g);
//         Collections.sort(sizeOfCookies);
        
//         int count = 0;
        
//         for(int i = 0; i < g.length; i++){
//             int child = g[i];
            
//             for(int j = 0; j < sizeOfCookies.size(); j++){
//                 int temp = sizeOfCookies.get(j);
//                 if(temp >= child){
//                     count++;
//                     sizeOfCookies.remove(j);
//                     break;
//                 }
//             }
//         }
        
//         return count;
        // Optimized solution: O(nlogn + mlogm + m)
        Arrays.sort(g);
        Arrays.sort(s);
        
        int l = 0, r = 0, n = g.length, m = s.length;
        
        while(l < n && r < m){
            if(g[l] <= s[r]){
                l++;
            }
            
            r++;
        }
        
        return l;
    }
}