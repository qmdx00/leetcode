package t0495;

/**
 * @author yuanweimin(aszed)
 * @title teemo-attacking
 * @id #0495
 */

/**
 * https://leetcode-cn.com/problems/teemo-attacking/
 *
 * 在《英雄联盟》的世界中，有一个叫 “提莫” 的英雄，他的攻击可以让敌方英雄
 * 艾希（编者注：寒冰射手）进入中毒状态。现在，给出提莫对艾希的攻击时间序列
 * 和提莫攻击的中毒持续时间，你需要输出艾希的中毒状态总时长。
 *
 * 你可以认为提莫在给定的时间点进行攻击，并立即使艾希处于中毒状态。
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