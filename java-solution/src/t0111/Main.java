package t0111;

/**
 * @author yuanweimin(aszed)
 * @title minimum depth of binary tree
 * @id #0111
 */

/**
 * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 *
 * 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 */

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int leftMin = minDepth(root.left);
        int rightMin = minDepth(root.right);

        return (leftMin == 0 || rightMin == 0)
                ? leftMin + rightMin + 1
                : Math.min(leftMin, rightMin) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(9);
        System.out.println(solution.minDepth(root));
    }
}
