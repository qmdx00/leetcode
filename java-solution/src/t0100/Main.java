package t0100;

/**
 * @author yuanweimin(aszed)
 * @title same-tree
 * @id #0100
 */

/**
 * https://leetcode-cn.com/problems/same-tree/
 *
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */

class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if (p == null || q == null || p.val != q.val) return false;
        else {
            System.out.println(p.val + "==========" + q.val);
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(solution.isSameTree(p, q));
    }
}
