class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
           if(c == '('){
               
               if(st.size() > 0){
                   ans.append(c);
               }
               st.push(c);
           }else{
               st.pop();
               if(st.size() > 0){
                   ans.append(')');
               }
           }
        }
        return ans.toString();
    }
}