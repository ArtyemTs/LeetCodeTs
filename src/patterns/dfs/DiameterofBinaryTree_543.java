package patterns.dfs;

import patterns.TreeNode;

public class DiameterofBinaryTree_543 {
    public int diameterOfBinaryTree(TreeNode root) {
        //Создали коробочку
        int[] d = new int[1];
        longestPath(root, d);
        return d[0];
    }

    private int longestPath(TreeNode node, int[] d) {
        if (node == null) {
            return 0;
        }
        //Посмотрели в листья и сли они есть вернули 1 (return Math.max(left, right) + 1;)
        int left = longestPath(node.left, d);
        int right = longestPath(node.right, d);

        //Обновили коробочку
        d[0] = Math.max(d[0], left + right);

        //Выбрали и Отдали в вызывающий метод по стеку самый длинный спуск либо слева либо справа и прибавили 1 для
        //подсчета текущего спуска т.е. этоко метода
        return Math.max(left, right) + 1;
    }
}
