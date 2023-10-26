package patterns.bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import patterns.TreeNode;

public class AverageofLevelsinBinaryTree_637 {
    public List<Double> averageOfLevels(TreeNode root) {

         Queue<TreeNode> q = new ArrayDeque<>(Arrays.asList(root));
         List<Double> res = new ArrayList<>();

         while (!q.isEmpty()) {
             int n = q.size();
             double sum = 0;

             for (int i = n; i > 0; i--) {
                 TreeNode node = q.poll();
                 sum += node.val;

                 if (node.left != null) {
                     q.add(node.left);
                 }
                 if (node.right != null) {
                     q.add(node.right);
                 }
             }
             res.add(sum / n);
         }
         return res;
    }
}
