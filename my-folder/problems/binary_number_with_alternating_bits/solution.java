class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0){
            int shift1 = n&1;
            n >>=1;
            int shift2 = n & 1;
            if (shift1 == shift2) return false;
        }
        return true;
    }
}