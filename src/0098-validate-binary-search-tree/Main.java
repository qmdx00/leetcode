import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanweimin(aszed)
 * @title validate-binary-search-tree
 * @id #0098
 */

class Solution {
    private List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        InOrder(root);
        for (int i = 1; i< list.size(); i++) {
            if (list.get(i-1) >= list.get(i))
                return false;
        }
        return true;
    }
    void InOrder(TreeNode root) {
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
    TreeNode(int x) { val = x; }
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