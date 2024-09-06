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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null)
            return ans;
        Queue<TreeNode> temp = new LinkedList<>();
        temp.add(root);
        
        while(!temp.isEmpty()){
            int size = temp.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i = 0; i < size; i++){
                TreeNode tempRoot = temp.poll();
                
                list.add(tempRoot.val);
                
                if(tempRoot.left != null)
                    temp.add(tempRoot.left);
                if(tempRoot.right != null)
                    temp.add(tempRoot.right);
                
            }
            ans.add(list);
        }
        
        return ans;
    }
}