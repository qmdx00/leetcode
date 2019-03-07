package t0001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yuanweimin(aszed)
 * @title two-sum
 * @id #0001
 */

/**
 * https://leetcode-cn.com/problems/two-sum/
 *
 * 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那两个整数，
 * 并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，
 * 你不能重复利用这个数组中同样的元素。
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
            int temp = target - nums[i];
            if (map.containsKey(temp) && map.get(temp) != i) {
                return new int[]{i, map.get(temp)};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {2, 11, 7, 15};
        System.out.println(Arrays.toString(solution.twoSum(nums, 9)));
    }
}