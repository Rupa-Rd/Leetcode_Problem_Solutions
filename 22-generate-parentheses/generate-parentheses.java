class Solution {
    public List<String> generateParenthesis(int n) {
    // Bruteforce : O(2^2^n * n)
        //         List<String> ans = new ArrayList<>();
        
//         generateAll(new char[2 * n], 0, ans);
        
//         return ans;
        
        // Optimal solution: O(4^n)
        
        List<String> ans = new ArrayList<>();
        generate(ans, new StringBuilder(), 0, 0, n);
        
        return ans;
        
    }
    public void generate(List<String> ans, StringBuilder temp, int open, int close, int max){
        if(temp.length() == 2 * max){
            ans.add(new String(temp));
        }
        if(open < max){
            temp.append('(');
            generate(ans, temp, open + 1, close, max);
            temp.deleteCharAt(temp.length() - 1);
        }
        if(close < open){
            temp.append(')');
            generate(ans, temp, open, close + 1, max);
            temp.deleteCharAt(temp.length() -1);
        }
    }
//     public void generateAll(char[] charArr, int size, List<String> ans){
//         if(charArr.length == size){
//             if(isValid(charArr)){
//                 ans.add(new String(charArr));
//             }
//         }else{
//             charArr[size] = '(';
//             generateAll(charArr, size + 1, ans);
//             charArr[size] = ')';
//             generateAll(charArr, size + 1, ans);
//         }
//     }
//     public boolean isValid(char[] arr){
//         int balance = 0;
        
//         for(char c: arr){
//             if(c == '(')
//                 balance ++;
//             else
//                 balance --;
//             if(balance < 0)
//                 return false;
//         }
        
//         return balance == 0;
    
}