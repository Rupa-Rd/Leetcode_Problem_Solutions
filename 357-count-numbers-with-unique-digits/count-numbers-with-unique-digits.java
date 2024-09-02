class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int count = 0, total = (int)Math.pow(10, n);
        
        for(int i = 0; i < total; i++){
            if(checkUnique(i)){
                count++;
            }
        }
        
        return count;
    }
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