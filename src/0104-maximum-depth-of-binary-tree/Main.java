/**
 * @author yuanweimin(aszed)
 * @title maximum depth of binary tree
 * @id #0104
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else {
            System.out.println(root.val);
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