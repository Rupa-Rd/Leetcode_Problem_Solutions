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
    public boolean isBalanced(TreeNode root) {
        int res = recursion(root);
        return res == -1 ? false : true;
    }
    public int recursion(TreeNode root){
        if(root == null)
            return 0;
        int lh = recursion(root.left);
        if(lh == -1)
            return -1;
        int rh = recursion(root.right);
        if(rh == -1)
            return -1;
        if(Math.abs(lh - rh) > 1)
            return -1;
        
        return 1 + Math.max(lh, rh);
            
        
        
        
    }
}