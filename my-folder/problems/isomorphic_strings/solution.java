import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map <Character, Character> map = new HashMap<>();

        if(s == null || t == null || s.length() != t.length()){return false;}
        char c = 'a';
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                c = map.get(s.charAt(i));
                if(c != t.charAt(i)){return false;}
            }else if(!map.containsValue(t.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
            }else{return false;}
            
        }
        return true;
    }
}