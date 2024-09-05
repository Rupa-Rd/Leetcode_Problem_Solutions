class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length, sum = 0;
        for(int i: rolls){
            sum+=i;
        }
        int nMean = ((n + m) * mean) - sum, val = nMean / n, rem = nMean % n;
        
        int[] res = new int[n];
        
        if(nMean > 6 * n || nMean < n)
            return new int[0];
        Arrays.fill(res, val);
        
        for(int i = 0; i < rem ;i ++){
            res[i]++;
        }
        // float newMedian = (float)(nSum + sum) / (float)(n + m);
        // System.out.println(nSum);
        return res;
        
        
    }
}