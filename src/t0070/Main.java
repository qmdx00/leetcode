package t0070;

/**
 * @author yuanweimin(aszed)
 * @title climbing-stairs
 * @id #0070
 */

/**
 * https://leetcode-cn.com/problems/climbing-stairs/comments/
 * <p>
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 */

class Solution {
    public int climbStairs(int n) {
        int[] F = new int[n + 2];
        F[1] = 1;
        F[2] = 2;
        if (n >= 3) {
            for (int i = 3; i <= n; i++) {
                F[i] = F[i - 1] + F[i - 2];
            }
        }
        return F[n];
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(1));
    }
}
