package patterns.dfs;

import patterns.TreeNode;

public class MergeTwoBinaryTrees_617 {
    public TreeNode mergeTrees(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return null;
        }
        if (node1 != null && node2 == null) {
            return node1;
        }
        if (node2 != null && node1 == null) {
            return node2;
        }
        node1.val = node1.val + node2.val;
        node1.left = mergeTrees(node1.left, node2.left);
        node1.right = mergeTrees(node1.right, node2.right);
        return node1;
    }
}
