class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        while(x > 0){
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        return original == reverse ? true : false;
        
        // Time complexity : O(log n)
    }
}