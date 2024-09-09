class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];
        merged.add(prev);
        // int[] curr = intervals[1];
        int i = 1, n = intervals.length;
        while(i < n){
            int currEnd = prev[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            if(nextStart <= currEnd){
                prev[0] = Math.min(prev[0], nextStart);
                prev[1] = Math.max(currEnd, nextEnd);
                
            }else{
                prev = intervals[i];
                merged.add(prev);
                
            }
            // curr = intervals[i];
            i++;
        }
        // if(prev == curr)
        //     merged.add(prev);
        return merged.toArray(new int[merged.size()][]);
    }
}