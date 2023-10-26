package patterns.dfs;

import patterns.TreeNode;

public class InvertBinaryTree_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = right;
        root.right = left;

        invertTree(left);
        invertTree(right);

        return root;
    }
}
