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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        
        findPath(root, targetSum, ans, new ArrayList<>(), 0);
        
        return ans;
    }
    public void findPath(TreeNode root, int target, List<List<Integer>> ans, ArrayList<Integer> temp, int tempSum){
        
        if(root == null)
            return;
        
        temp.add(root.val);
        tempSum+= root.val;
        
        if(root.left == null && root.right == null && tempSum == target){
            ans.add(new ArrayList<>(temp));
            
        }
        
        
        findPath(root.left, target, ans, temp, tempSum);
        findPath(root.right, target, ans, temp,tempSum);
        temp.remove(temp.size() - 1);
    }
}