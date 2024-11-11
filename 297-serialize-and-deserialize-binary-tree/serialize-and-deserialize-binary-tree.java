/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder ans = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null){
                ans.append("#");
            }else{
                ans.append(curr.val);
                q.offer(curr.left);
                q.offer(curr.right);
            }
            if(!q.isEmpty()){
                ans.append(",");
            }
        }
        
        return ans.toString();
    }

    // Decodes your encoded data to tree.
public TreeNode deserialize(String data) {
    if (data == null || data.isEmpty()) return null;

    String[] s = data.split(",");
    if (s[0].equals("#")) return null;

    int index = 0;
    int value = Integer.parseInt(s[index++]);
    TreeNode root = new TreeNode(value);
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
        TreeNode curr = q.poll();

        // Process left child
        if (index < s.length && !s[index].equals("#")) {
            value = Integer.parseInt(s[index]);
            TreeNode left = new TreeNode(value);
            curr.left = left;
            q.add(left);
        }
        index++;

        // Process right child
        if (index < s.length && !s[index].equals("#")) {
            value = Integer.parseInt(s[index]);
            TreeNode right = new TreeNode(value);
            curr.right = right;
            q.add(right);
        }
        index++;
    }

    return root;
}



}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));