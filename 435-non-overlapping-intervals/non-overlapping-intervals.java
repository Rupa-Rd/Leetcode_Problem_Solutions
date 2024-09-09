class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int noOfOverlap = 0, i = 1, n = intervals.length;
        
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        System.out.println(Arrays.deepToString(intervals));
        int currEnd = intervals[0][1];
        while(i < n){
            int newEnd = intervals[i][1];
            int newStart = intervals[i][0];
            if(newStart < currEnd){
                noOfOverlap ++;
                
            }else{
                currEnd = newEnd;    
            }
            
            i++;
        }
        
        return noOfOverlap;
    }
}