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
    public int kthSmallest(TreeNode root, int k) {
        // Bruteforce: O(N), O(N)
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        //Optimized: O(N), O(1)
        int[] finalAns = {Integer.MAX_VALUE};
        int[] counter = {0};
        inOrder(root, counter, finalAns, k);
        
        return finalAns[0];
        // return ans.get(k - 1);
    }
    public void inOrder(TreeNode root, int[] counter, int[] finalAns, int k){
        if(root == null || counter[0] > k)
            return;
        inOrder(root.left, counter, finalAns, k);
        counter[0] ++;
        if(counter[0] == k){
            finalAns[0] = root.val;
            return;
        }
        inOrder(root.right, counter, finalAns, k);
    }
    public void inorder(TreeNode root, ArrayList<Integer> ans){
        if(root == null)
            return;
        
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }
}