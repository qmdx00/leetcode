package t0098;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanweimin(aszed)
 * @title validate-binary-search-tree
 * @id #0098
 */

/*
 * https://leetcode-cn.com/problems/validate-binary-search-tree/
 *
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 */

class Solution {
    private List<Integer> list = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        InOrder(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) >= list.get(i))
                return false;
        }
        return true;
    }

    void InOrder(TreeNode root) {
        if (root == null)
            return;
        if (root.left != null)
            InOrder(root.left);
        list.add(root.val);
        if (root.right != null)
            InOrder(root.right);
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

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = null;
        root.left.right = null;
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        System.out.println(solution.isValidBST(root));
    }
}
