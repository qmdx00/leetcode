/**
 * @author yuanweimin(aszed)
 * @title powx-n
 * @id #0050
 */

/* timeout
class Solution {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 1 / myPow(x, -n);
        if (n % 2 != 0)
            return x * myPow(x, n - 1);
        return myPow(x * x, n / 2);
    }
}
*/

class Solution {
    public double myPow(double x, int n) {
        double res = 1.0;
        for (int i = n; i != 0; i /= 2) {
            if (i % 2 != 0)
                res *= x;
            x *= x;
        }
        return n < 0 ? 1 / res : res;
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