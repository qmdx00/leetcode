package t0104;

/**
 * @author yuanweimin(aszed)
 * @title maximum depth of binary tree
 * @id #0104
 */

/**
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 *
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
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
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(10);
        System.out.println(solution.maxDepth(root));
    }
}