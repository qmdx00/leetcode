package t0009;

/**
 * @author yuanweimin(aszed)
 * @title palindrome-number
 * @id #0009
 */

/**
 * https://leetcode-cn.com/problems/palindrome-number/
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */

class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder("" + Math.abs(x));
        boolean isNegative = x < 0;
        try {
            int rev = Integer.parseInt(sb.reverse().toString());
            return isNegative ? false : x == rev;
        } catch (Exception e) {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
    }
}