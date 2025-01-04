/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(root == null)
        return null;
        // Map the nodes to parents using BFS
        HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
        mapParents(root, parentMap);

        // BFS in 3 directions till k distance
        Queue<TreeNode> bfs = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        bfs.add(target);
        int distance = 0;

        while(!bfs.isEmpty()){
            int size = bfs.size();
            
            if(distance == k){
                break;
            }

            for(int i = 0; i < size; i++){
                TreeNode top = bfs.poll();
                visited.add(top);
                // 3 directions
                if(top.left != null && !visited.contains(top.left)){
                    bfs.add(top.left);
                }
                if(top.right != null && !visited.contains(top.right)){
                    bfs.add(top.right);
                }
                if(parentMap.get(top) != null && !visited.contains(parentMap.get(top))){
                    bfs.add(parentMap.get(top));
                }

            }
            distance ++;
        }

        List<Integer> ans = new ArrayList<>();

        while(!bfs.isEmpty()){
            ans.add(bfs.poll().val);
        }
        return ans;
    }
    public void mapParents(TreeNode root, HashMap<TreeNode, TreeNode> parentMap){
        parentMap.put(root, null);

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while(!nodes.isEmpty()){
            int size = nodes.size();
            
            for(int i = 0; i < size; i++){
                TreeNode top = nodes.poll();
                if(top.left != null){
                    nodes.add(top.left);
                    parentMap.put(top.left, top);
                }
                if(top.right != null){
                    nodes.add(top.right);
                    parentMap.put(top.right, top);
                }
            }
        }
    }
}