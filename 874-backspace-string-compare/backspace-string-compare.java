class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        
        for(Character c: s.toCharArray()){
            if(c=='#' && stack.isEmpty())
                continue;
            else if(c == '#' ){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        
        String modS = "";
        while(!stack.isEmpty()){
            modS = stack.pop() + modS;
        }
        
        for(Character c: t.toCharArray()){
            if(c=='#' && stack.isEmpty())
                continue;
            else if(c == '#'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        
        String modT = "";
        while(!stack.isEmpty()){
            modT = stack.pop() + modT;
        }
        System.out.println(modS + " "+modT);
        return modS.equals(modT);
    }
}