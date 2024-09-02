class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        
        for(int i = 0; i <= n; i++){
            res[i]= nBits(i);
            // System.out.println(temp);
        }
        
        return res;
    }
    public int nBits(int num){
        int bits =0;
        while(num != 0){
            bits++;
            num = num & (num - 1);
        }
        return bits;
    }
}