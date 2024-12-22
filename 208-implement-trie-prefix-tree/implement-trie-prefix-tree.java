class Node{
    Node[] links = new Node[26];
    boolean flag = false;
    
    boolean containsKey(char ch){
        return links[ch - 'a'] != null;
    }
    
    void put(char ch, Node node){
        links[ch - 'a'] = node;
    }
    
    Node get(char ch){
        return links[ch - 'a'];
    }
    
    void setEnd(){
        flag = true;
    }
    
    boolean isEnd(){
        return flag;
    }
}
class Trie {
    private Node root;
    public Trie() {
       root = new Node();
    }
    
    public void insert(String word) {
        Node tempNode = root;
        
        for(char ch: word.toCharArray()){
            
            if(!tempNode.containsKey(ch)){
                tempNode.put(ch, new Node());
            }
            tempNode = tempNode.get(ch);
        }
        
        tempNode.setEnd();
    }
    
    public boolean search(String word) {
        Node tempNode = root;
        
        for(char ch: word.toCharArray()){
            if(!tempNode.containsKey(ch)){
                return false;
            }
            tempNode = tempNode.get(ch);
        }
        
        return tempNode.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        Node tempNode = root;
        
        for(char ch: prefix.toCharArray()){
            if(!tempNode.containsKey(ch)){
                return false;
            }
            tempNode = tempNode.get(ch);
        }
        
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */