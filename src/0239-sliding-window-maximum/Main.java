import java.util.Arrays;

/**
 * @author yuanweimin(aszed)
 * @title sliding-window-maximum
 * @id #0239
 */

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        return new int[0];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = solution.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(res));
    }
}