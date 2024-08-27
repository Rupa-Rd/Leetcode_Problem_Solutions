class Solution {
    public boolean backspaceCompare(String s, String t) {
//         Stack<Character> stack = new Stack<>();
        
//         for(Character c: s.toCharArray()){
//             if(c=='#' && stack.isEmpty())
//                 continue;
//             else if(c == '#' ){
//                 stack.pop();
//             }else{
//                 stack.push(c);
//             }
//         }
        
//         String modS = "";
//         while(!stack.isEmpty()){
//             modS = stack.pop() + modS;
//         }
        
//         for(Character c: t.toCharArray()){
//             if(c=='#' && stack.isEmpty())
//                 continue;
//             else if(c == '#'){
//                 stack.pop();
//             }else{
//                 stack.push(c);
//             }
//         }
        
//         String modT = "";
//         while(!stack.isEmpty()){
//             modT = stack.pop() + modT;
//         }
//         System.out.println(modS + " "+modT);
//         return modS.equals(modT);
        return getString(s).equals(getString(t));
    }
    public String getString(String s){
        int n = s.length(), count = 0;
        String result = "";
        
        for(int i = n - 1; i >= 0; i --){
            char c = s.charAt(i);
            if(c == '#')
                count ++;
            else{
                if(count > 0)
                    count --;
                else
                    result += c;
            }
        }
        
        return result;
    }
}