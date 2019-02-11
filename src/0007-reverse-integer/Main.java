/**
 * @author yuanweimin(aszed)
 * @title 整数反转
 * @id #0007
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