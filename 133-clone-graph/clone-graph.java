/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node, Node> visited = new HashMap<>();
        return clone(visited, node);
    }
    
    public Node clone(HashMap<Node, Node> visited, Node n){
        if(n == null){
            return null;
        }
        
        if(visited.containsKey(n)){
            return visited.get(n);
        }
        
        Node newNode = new Node(n.val, new ArrayList<Node>());
        visited.put(n, newNode);
        
        for(Node pn: n.neighbors){
            newNode.neighbors.add(clone(visited, pn));
        }
        
        return newNode;
    }
}