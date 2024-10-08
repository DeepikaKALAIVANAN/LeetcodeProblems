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
    public TreeNode invertTree(TreeNode root) {
        // TreeNode left;
        // TreeNode right;
        if(root == null){
            return root;
        }
        TreeNode leftInv = invertTree(root.left);
        TreeNode rightInv = invertTree(root.right);
        root.left = rightInv;
        root.right = leftInv;
        return root;
    }
}