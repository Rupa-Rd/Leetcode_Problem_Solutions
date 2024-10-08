/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        // Recursive method: O(2^n)
        List<Integer> ans = new ArrayList<>();
        
        recursion(root, ans);
        return ans;
        
    }
    public void recursion(Node root, List<Integer> ans){
        if(root == null)
            return;
        
        for(Node n: root.children)
            recursion(n, ans);
        
        ans.add(root.val);
    }
}