package t0687;

/**
 * @author yuanweimin(aszed)
 * @title longest-univalue-path
 * @id #0687
 */

/**
 * https://leetcode-cn.com/problems/longest-univalue-path/
 *
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。
 * 这条路径可以经过也可以不经过根节点。
 *
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 */

class Solution {
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        return getLongest(root, root.val);
    }
    private static int getLongest(TreeNode root, int val) {
        if (root == null) return 0;

        int left = getLongest(root.left, root.val);
        int right = getLongest(root.right, root.val);

        System.out.println(root.val);
//        if (root.val == val) {
//            System.out.println(left + "  " + right);
//            return Math.max(left, right) + 1;
//        }
        return 0;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int x) {
        val = x;
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println(new Solution().longestUnivaluePath(root));
    }
}
