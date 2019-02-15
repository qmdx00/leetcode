import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yuanweimin(aszed)
 * @title two-sum
 * @id #0001
 */

/*
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
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp) && map.get(temp) != i) {
                return new int[]{i, map.get(temp)};
            }
        }
        return new int[0];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = { 2, 11, 7, 15 };
        System.out.println(Arrays.toString(solution.twoSum(nums, 9)));
    }
}