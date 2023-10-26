package patterns.dfs;

import patterns.TreeNode;

public class PathSum_112 {
    public boolean hasPathSum(TreeNode node, int target) {
        if (node == null) {
            return false;
        }
        target -= node.val;
        if (node.left == null && node.right == null) {
            return target == 0;
        }
        return hasPathSum(node.left, target) || hasPathSum(node.right, target);
    }
}
