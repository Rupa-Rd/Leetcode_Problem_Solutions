class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // Bruteforce: O(m * n * k)
        int res = 0;
        for(int i = 0; i < words.length; i++){
            boolean isConsistent = true;
            
            for(int j = 0; j < words[i].length(); j++){
                char c = words[i].charAt(j) ;
                boolean isCharConsistent = false;
                
                for(int k = 0; k < allowed.length(); k++){
                    char s = allowed.charAt(k);
                    
                    if(s == c){
                        isCharConsistent =true;
                        break;
                    }
                }
                if(!isCharConsistent){
                    isConsistent = false;
                    break;
                }
                    
            }
            
            
            if(isConsistent)
                res++;
        }
        
        return res;
        // Optimized using set: O(m + n *k)
//         Set<Character> set = new HashSet<>();
//         for(char c: allowed.toCharArray())
//             set.add(c);
        
//         int res = 0;
//         for(String s: words){
//             boolean isConsistent = true;
            
//             for(char ch: s.toCharArray()){
//                 if(!set.contains(ch)){
//                    isConsistent = false;
//                     break;
//                 }
//             }
//             if(isConsistent)
//                 res++;
//         }
        
//         return res;
    }
}