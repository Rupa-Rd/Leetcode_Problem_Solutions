class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        String balloon = "balloon";
        
        for(Character c: text.toCharArray())
            if(balloon.indexOf(c) != -1)
                map.put(c, map.getOrDefault(c, 0) + 1);
        
        if(!map.containsKey('b') || !map.containsKey('a') || !map.containsKey('l') || !map.containsKey('o') || !map.containsKey('n'))
            return 0;
        else
            return Math.min(map.get('b'), Math.min(map.get('a'), Math.min(map.get('l')/2, Math.min(map.get('o')/2, map.get('n')))));
        
    }
}