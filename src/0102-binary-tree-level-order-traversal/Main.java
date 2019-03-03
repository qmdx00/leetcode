import java.util.List;
import java.util.ArrayList;
/**
 * @author yuanweimin(aszed)
 * @title binary-tree-level-order-traversal
 * @id #0102
 */

 // Breadth-First-Search
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        int level = 0;
        bfs(root, level, new ArrayList<>());
        return null;
    }

    private List<List<Integer>> bfs(TreeNode root, int level, List<List<Integer>> result) {
        return null;
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

        System.out.println(solution.levelOrder(root));
    }
}