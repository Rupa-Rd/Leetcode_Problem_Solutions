class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // Bruteforce: O(N logN)
//         List<int[]> in = new ArrayList<>(Arrays.asList(intervals));
//         in.add(newInterval);
        
//         in.sort(Comparator.comparingInt(a -> a[0]));
        
//         List<int[]> merged = new ArrayList<>();
//         int[] curr = in.get(0);
//         merged.add(curr);
//         for(int[] i: in){
//             if(curr[1] >= i[0]){
//                 curr[1] = Math.max(curr[1], i[1]);
//             }else{
//                 curr = i;
//                 merged.add(curr);
//             }
//             for(int[] j: merged)
//                 System.out.print(Arrays.toString(j)+" ");
//         }
        
//         return merged.toArray(new int[merged.size()][]);
        // Optimized solution: O(N)
        List<int[]> merged = new ArrayList<>();
        int i = 0, n = intervals.length;
        
        while(i < n && intervals[i][1] < newInterval[0]){
            merged.add(intervals[i]);
            i++;
        }
        
        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        merged.add(newInterval);
        
        while(i < n){
            merged.add(intervals[i]);
            i++;
        }
        
        return merged.toArray(new int[merged.size()][]);
    }
}