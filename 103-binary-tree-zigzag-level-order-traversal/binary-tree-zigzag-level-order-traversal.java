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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Bruteforce : O(N ^ 2)
        if(root == null)
            return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        int level = 0;
        s1.push(root);
        
        while(!s1.isEmpty() || !s2.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            if(level % 2 == 0){
                while(!s1.isEmpty()){
                    TreeNode t = s1.pop();
                    temp.add(t.val);
                    if(t.left != null)
                        s2.push(t.left);
                    if(t.right != null)
                        s2.push(t.right);
                }
            }else{
                    while(!s2.isEmpty()){
                        TreeNode t = s2.pop();
                        temp.add(t.val);
                        if(t.right != null)
                            s1.push(t.right);
                        if(t.left != null)
                            s1.push(t.left);
                    }
                }
                
                ans.add(temp);
                level ++;
            }
            return ans;
        
    }
}