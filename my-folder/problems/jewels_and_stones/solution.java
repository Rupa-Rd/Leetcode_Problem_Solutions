class Solution {
    public int numJewelsInStones(String jewels, String stones) {
//          Brute Force
//         int res = 0;
//         if(stones.length() == 0){return 0;}
//         // char[] arr = jewels.toCharArray();
        
//         for(char ch1: stones.toCharArray()){
//             for(char ch2: jewels.toCharArray()){
//                 if (ch1 == ch2){res ++;}
//             }
//         }
//         return res;
        
        // Optimized Way
        
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i< jewels.length(); i++){
            map.put(jewels.charAt(i),i);
        }
        for(int j=0; j<stones.length(); j++){
            if(map.containsKey(stones.charAt(j))){
                res++;
            }
        }
        return res;
    }
}