class Solution {
    public int fib(int n) {
        // if(n == 0)
        //     return 0;
        // if(n == 1)
        //     return 1;
        
        // return fib(n - 1) + fib(n - 2);
        if(n == 0)
        return 0;
        int prev2 = 0, prev1 = 1, curr = 1;
        for(int i = 2; i < n; i++){
            prev2 = prev1;
            prev1 = curr;
            curr = prev1 + prev2;
        }

        return curr;
    }
}