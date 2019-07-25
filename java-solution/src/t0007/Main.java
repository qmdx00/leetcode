package t0007;

/**
 * @author yuanweimin(aszed)
 * @title reverse-integer
 * @id #0007
 */

/*
 * https://leetcode-cn.com/problems/reverse-integer/
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */

class Solution {
    public int reverse(int x) {
        StringBuffer sb = new StringBuffer();
        Boolean isNegative = x < 0 ? true : false;
        try {
            int res = Integer.parseInt(sb.append(Math.abs(x)).reverse().toString());
            return isNegative ? -res : res;
        } catch (Exception e) {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-120));
    }
}
