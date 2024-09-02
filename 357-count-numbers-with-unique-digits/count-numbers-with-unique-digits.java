class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        // Time complexity: O(n * logN)
//         int count = 0, total = (int)Math.pow(10, n);
        
//         for(int i = 0; i < total; i++){
//             if(checkUnique(i)){
//                 count++;
//             }
//         }
        
//         return count;
        // Optimal: O(N)
        if(n ==0) return 1;
        
        int count = 10; // Unit digits 0...10
        int uniqueDigits = 9, availableDigits = 9;
        
        for(int i = 2; i <= n && availableDigits > 0; i++){
            uniqueDigits *= availableDigits;
            count += uniqueDigits;
            availableDigits --;
        }
        
        return count;
    }
    // Bruteforce: O(N)
    public boolean checkUnique(int n){
        boolean[] digits = new boolean[10];
        
        while(n != 0){
            int r = n % 10;
            
            if(digits[r] == true){
                return false;
            }else{
                digits[r] = true;
            }
            n /= 10;
        }
        
        return true;
    }
}