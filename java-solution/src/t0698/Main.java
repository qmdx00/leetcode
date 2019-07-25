package t0698;

/**
 * @author yuanweimin(aszed)
 * @title partition-to-k-equal-sum-subsets
 * @id #0698
 */

/*
 * https://leetcode-cn.com/problems/partition-to-k-equal-sum-subsets/
 *
 * 给定一个整数数组  nums 和一个正整数 k，找出是否有可能把这个数组分成 k 个非空子集，其总和都相等。
 */

class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {

        return false;
    }

    static void recursive() {

    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        System.out.println(solution.canPartitionKSubsets(nums, k));
    }
}
