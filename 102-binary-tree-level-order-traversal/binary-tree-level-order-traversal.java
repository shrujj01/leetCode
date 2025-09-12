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
        List<List<Integer>> finalList = new LinkedList<>();

        if(root == null){
            return finalList;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
           
            List<Integer> levelList = new LinkedList<>();
            for(int i = 0;i<size;i++){
                TreeNode out = q.poll();
                levelList.add(out.val);
                if(out.left !=null){
                    q.offer(out.left);
                }
                if(out.right!=null){
                    q.offer(out.right);
                }
            }
            finalList.add(levelList);
        }
        return finalList;
    }
}