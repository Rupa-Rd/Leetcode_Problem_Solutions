class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        
        generateAll(new char[2 * n], 0, ans);
        
        return ans;
    }
    public void generateAll(char[] charArr, int size, List<String> ans){
        if(charArr.length == size){
            if(isValid(charArr)){
                ans.add(new String(charArr));
            }
        }else{
            charArr[size] = '(';
            generateAll(charArr, size + 1, ans);
            charArr[size] = ')';
            generateAll(charArr, size + 1, ans);
        }
    }
    public boolean isValid(char[] arr){
        int balance = 0;
        
        for(char c: arr){
            if(c == '(')
                balance ++;
            else
                balance --;
            if(balance < 0)
                return false;
        }
        
        return balance == 0;
    }
}