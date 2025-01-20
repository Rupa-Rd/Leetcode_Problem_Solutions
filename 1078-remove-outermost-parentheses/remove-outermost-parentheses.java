class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int val = 0;
        StringBuilder tempArr = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch == '('){
                if(val != 0){
                    tempArr.append(ch);
                }
                val++;
            }else{
                val --;
                if(val == 0){
                    ans.append(tempArr);
                    tempArr = new StringBuilder();
                }else{
                    tempArr.append(ch);
                }
                
            }
        }

        return ans.toString();
    }
}