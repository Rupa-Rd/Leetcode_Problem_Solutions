class Trie{
    Trie[] links;
    
    Trie(){
        links = new Trie[2];
    }
    
    boolean containsKey(int key){
        return links[key] != null;
    }
    void put(int bit, Trie node){
        links[bit] = node;
    }
    Trie get(int bit){
        return links[bit];
    }
}
class Solution {
    Trie root = new Trie();
    public void insert(int num){
        Trie node = root;
        for(int i = 31; i >= 0; i--){
            int bit = (num >> i) & 1;
            
            if(!node.containsKey(bit)){
                node.put(bit, new Trie());
            }
            node = node.get(bit);
        }
    }
    public int getMax(int num){
        Trie node = root;
        int maximum = 0;
        
        for(int i = 31; i >= 0 ;i --){
            int bit = (num >> i) & 1;
            
            if(node.containsKey(1 - bit)){
                maximum |= (1 << i);
                
                node = node.get(1 - bit);
            }else{
                node = node.get(bit);
            }
        }
        
        return maximum;
    }
    public int findMaximumXOR(int[] nums) {
        for(int i: nums){
            insert(i);
        }
        
        int maxXOR = 0;
        for(int i: nums){
            maxXOR = Math.max(maxXOR, getMax(i));
        }
        
        return maxXOR;
    }
}