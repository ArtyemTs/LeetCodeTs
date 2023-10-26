package patterns.dfs;

import patterns.TreeNode;

public class LowestCommonAncestorOfBinarySearchTree_235 {
    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        while (node != null) {
            if (node.val < p.val && node.val < q.val) {
                node = node.right;
            } else if (node.val > p.val && node.val > q.val) {
                node = node.left;
            } else {
                return node;
            }
        }
        return null;
    }
}
