/**
 * @author yuanweimin(aszed)
 * @title teemo-attacking
 * @id #0495
 */

/*
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int tim = 0;
        int len = timeSeries.length;
        if(len == 0) {
            return tim;
        }
        for (int i =0;i<len-1;i++) {
            int a1 = timeSeries[i];
            int a2 = timeSeries[i + 1];
            int s = a1 + duration;
            if(s>a2) {
                tim = tim + a2 - a1;
            } else {
                tim = tim + duration;
            }
        }
        return tim + duration;
    }
*/

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        int len = timeSeries.length;
        if (len < 1) return len == 0 ? 0 : duration;
        for (int i = 1; i < len; i++) {
            if (timeSeries[i-1] + duration -1 < timeSeries[i]) {
                sum += duration;
            } else {
                sum += timeSeries[i] - timeSeries[i-1];
            }
        }
        return sum + duration;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] timeSeries = { 1, 2 };
        int duration = 2;

        System.out.println(solution.findPoisonedDuration(timeSeries, duration));

    }
}