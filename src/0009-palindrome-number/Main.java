/**
 * @author yuanweimin(aszed)
 * @title palindrome-number
 * @id #0009
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