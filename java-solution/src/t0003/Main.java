package t0003;

/**
 * @author yuanweimin(aszed)
 * @title longest-substring-without-repeating-characters
 * @id #0003
 */

import scala.Char;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}

//class Solution {
//    private int max = 0;
//    private Queue<Character> queue = new LinkedList<>();
//
//    public int lengthOfLongestSubstring(String s) {
//        for (int i = 0; i < s.length(); i++) {
//            queue.clear();
//            queue.add(s.charAt(i));
//            for (int j = i + 1; j < s.length(); j++) {
//                if (!queue.contains(s.charAt(j))) {
//                    queue.add(s.charAt(j));
//                } else break;
//            }
//            if (max < queue.size()) max = queue.size();
//            System.out.println(queue);
//        }
//        return max;
//    }
//}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        char[] chars = s.toCharArray();
        int pos = 0;
        int max = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = pos; j < i; j++) {
                if (chars[i] == chars[j]) {
                    pos = j + 1;
                    break;
                }
            }
            if (max < i - pos + 1) max = i - pos + 1;
        }
        return max;
    }
}

// 滑动窗口
//@Todo
//class Solution {
//    private Queue<Character> queue = new LinkedList<>();
//    public int lengthOfLongestSubstring(String s) {
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//
//        }
//    }
//}
