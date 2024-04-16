class Solution {
    public boolean isValid(String s) {
        Stack<Character> obj = new Stack<>();
        // String s = "([{}])";
        if(s.length() % 2 != 0){
            // System.out.println("Invalid parenthesis");
            return false;
        }
        for(char i: s.toCharArray()){
            if(i == '(' || i == '[' || i == '{'){
                obj.push(i);
            }else{
                if(obj.isEmpty()){return false;}
                if(i == ')' &&  obj.peek() == '('){
                obj.pop();
                }else if(i == ']'&& obj.peek() == '['){
                obj.pop();
                }else if(i == '}'&& obj.peek() == '{'){
                System.out.println("Popped");
                obj.pop();
                }else{return false;}    
            }
            
            
        }
        return obj.isEmpty();
    }
}

