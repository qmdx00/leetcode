import java.util.Arrays;

/**
 * @author yuanweimin(aszed)
 * @title two-sum
 * @id #0001
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = { 2, 11, 7, 15 };
        System.out.println(Arrays.toString(solution.twoSum(nums, 9)));
    }
}