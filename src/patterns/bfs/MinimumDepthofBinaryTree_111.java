package patterns.bfs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import patterns.TreeNode;

public class MinimumDepthofBinaryTree_111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new ArrayDeque<>(Arrays.asList(root));
        int res = 1;

        while (!q.isEmpty()) {
            int n = q.size();

            for (int i = n; i > 0; i--) {
                TreeNode node = q.poll();
                if (node.left == null && node.right == null) {
                    return res;
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            res++;
        }
        return res;
    }
}
