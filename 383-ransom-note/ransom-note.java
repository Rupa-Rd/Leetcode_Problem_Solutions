class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(Character r: ransomNote.toCharArray())
            map.put(r, map.getOrDefault(r, 0) + 1);
        
        for(Character m: magazine.toCharArray()){
            if(map.containsKey(m) && map.get(m) != 0){
                map.put(m, map.get(m) - 1);
            }
        }
        
        for(Integer i: map.values()){
            if(i != 0){
                System.out.println(i);
                return false;
            }
        }
        
        return true;
    }
}