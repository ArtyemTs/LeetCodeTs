package patterns.dfs;

import patterns.TreeNode;

public class MaximumDepthofBinaryTree_104 {
    public int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);

        return Math.max(left, right) + 1;
    }
}
