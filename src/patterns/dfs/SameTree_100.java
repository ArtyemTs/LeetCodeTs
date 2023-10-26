package patterns.dfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import patterns.TreeNode;

public class SameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>(Arrays.asList(p, q));

        while (!queue.isEmpty()) {
            TreeNode pNode = queue.poll();
            TreeNode qNode = queue.poll();

            if (pNode == null && qNode == null) {
                continue;
            }
            if (pNode == null || qNode == null) {
                return false;
            }
            if (pNode.val != qNode.val) {
                return false;
            }

            queue.add(pNode.left);
            queue.add(qNode.left);
            queue.add(pNode.right);
            queue.add(qNode.right);
        }

        return true;
    }
        //recursive
//        if (p == null && q == null) {
//            return true;
//        } else if (p == null || q == null || p.val != q.val) {
//            return false;
//        }
//        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        //=========
//    }
}
