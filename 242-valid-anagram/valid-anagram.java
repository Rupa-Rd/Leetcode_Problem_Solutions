class Solution {
    public boolean isAnagram(String s, String t) {
        // Bruteforce: O(n^2)
//         boolean check = false;
        
//         if(s.length() != t.length())
//             return check;
//         for(int i = 0; i < s.length(); i ++){
//             for(int j = 0; j < t.length(); j ++){
//                 if(s.charAt(i) == t.charAt(j)){
//                     check = true;
//                     break;
//                 }else{
//                     check = false;
//                 }
//             }
//         }
        
//         return check;
        
        // Optimal: O(n)
        HashMap<Character, Integer> map = new HashMap<>();
        
        if(s.length() != t.length())
            return false;
        
        for(int i = 0; i < s.length(); i ++){
            char sChar = s.charAt(i);
            map.put(sChar, map.getOrDefault(sChar, 0) + 1);
        }
        
        System.out.println(map);
        for(int i = 0; i < t.length(); i ++){
            char tChar = t.charAt(i);
            if(!map.containsKey(tChar) || map.get(tChar) == 0)
                return false;
            map.put(tChar, map.get(tChar) - 1);
        }
        System.out.println(map);
        // for(Integer val: map.values()){
        //     if (val != 0)
        //         return false;
        // }
        return true;
    }
}