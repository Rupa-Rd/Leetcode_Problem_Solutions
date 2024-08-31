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
    public List<Integer> rightSideView(TreeNode root) {
        // Bruteforce -> TC: O(N), SC: O(w)
//         List<Integer> res = new ArrayList<>();
        
//         if(root == null)
//             return res;
        
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
        
//         while(!q.isEmpty()){
//             int size = q.size();
//             for(int i = 0; i < size; i ++){
//                 TreeNode curr = q.poll();
                
//                 if(i == size - 1){
//                     res.add(curr.val);
//                 }
                
//                 if(curr.left != null)
//                     q.add(curr.left);
                
//                 if(curr.right != null)
//                     q.add(curr.right);
//             }
//         }
        
//         return res;
        
        // Optimal -> TC: O(N), SC: O(levels)
        List<Integer> res = new ArrayList<>();
        
        if(root == null)
            return res;
        
        rightTraversal(root, 0, res);
        
        return res;
        
    }
    
    public void rightTraversal(TreeNode root, int level, List<Integer> res){
        if(root == null)
            return;
        
        if(level == res.size()){
            res.add(root.val);
        }
        
        rightTraversal(root.right, level + 1, res);
        rightTraversal(root.left, level + 1, res);
    }
}