class Solution {
    public String largestOddNumber(String num) {
        String ans = "";
        int index = -1;
        for(int i = num.length() - 1; i >= 0; i--){
            char ch = num.charAt(i);
            int val = ch - '0';
            
            if(val % 2 != 0){
                index = i;
               break; 
            }
        }
        if(index >= 0){
            ans = num.substring(0, index + 1);
        }

        return ans;
    }
}