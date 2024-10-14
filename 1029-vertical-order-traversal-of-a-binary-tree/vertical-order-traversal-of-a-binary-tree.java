/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static class NodeInfo{
        TreeNode node;
        int col, row;
        
        NodeInfo(TreeNode node, int col, int row){
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        
        Queue<NodeInfo> queue = new LinkedList<>();
        queue.add(new NodeInfo(root, 0, 0));
        
        while(!queue.isEmpty()){
            NodeInfo curr = queue.poll();
            
            TreeNode node = curr.node;
            int col = curr.col;
            int row = curr.row;
            
            map
                .computeIfAbsent(col, x -> new TreeMap<>())
                .computeIfAbsent(row, x -> new PriorityQueue<>())
                .offer(node.val);
            
        if(node.left != null){
            queue.add(new NodeInfo(node.left, col - 1, row + 1));
        }
        if(node.right != null){
            queue.add(new NodeInfo(node.right, col + 1, row + 1));
        }
    }
    
    List<List<Integer>> ans = new ArrayList<>();
        
    for(TreeMap<Integer, PriorityQueue<Integer>> rows: map.values()){
        List<Integer> colList = new ArrayList<>();
        
        for(PriorityQueue<Integer> pq: rows.values()){
            while(!pq.isEmpty()){
                colList.add(pq.poll());
            }
        }
        ans.add(colList);
    }
        return ans;
}

}