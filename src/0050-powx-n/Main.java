/**
 * @author yuanweimin(aszed)
 * @title powx-n
 * @id #0050
 */

class Solution {
    public double myPow(double x, int n) {
        double res = 1.0;
        if (n > 0) {
            for (int i = 0; i < n; i++)
                res *= x;
        } else if (n < 0) {
            for (int i = 0; i < -n; i++) {
                res *= 1.0 / x;
            }
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        double x = 2.00000;
        int n = -2;
        System.out.println(solution.myPow(x, n));
    }
}