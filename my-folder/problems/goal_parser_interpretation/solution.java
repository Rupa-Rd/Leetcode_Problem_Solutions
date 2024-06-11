class Solution {
    public String interpret(String command) {
        // Bruteforce using Hashmaps
        HashMap<Character, String> map = new HashMap<>();
        
        // map.put('G', "G");
        // map.put('()', "o");
        // map.put('(al)', "al");
        
//         for(int i = 0; i < command.length(); i++){
//             char ch = command.charAt(i);
//             System.out.print(ch+" ");
//         }
//         return "";
        
        // Optimized using replace
        
       
        
        return command.replace("(al)", "al").replace("()", "o");
    }
}