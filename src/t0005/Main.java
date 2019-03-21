package t0005;

import java.util.*;

/**
 * @author yuanweimin(aszed)
 * @title longest-palindromic-substring
 * @id #0005
 */

/**
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 */

/**
 class Solution {
 // 理解错了题意，看成了最长重复字串问题，这个是求最重复字串的代码。
 public String longestPalindrome(String s) {
 int len = s.length();
 char[] size = new char[len + 1];
 Stack<Character> tmp = new Stack<>();
 for (int i = 0; i < len; i++) {
 if (tmp.size() == 0) {
 tmp.push(s.charAt(i));
 } else if (tmp.peek() == s.charAt(i)) {
 tmp.push(s.charAt(i));
 } else {
 size[tmp.size()] = tmp.peek();
 tmp.clear();
 tmp.push(s.charAt(i));
 }
 }

 StringBuffer sb = new StringBuffer();
 for (int i = size.length - 1; i >= 0; i--) {
 if (size[i] != 0) {
 for (int j = 0; j < i; j++) {
 sb.append(size[i]);
 }
 break;
 }
 }

 return sb.toString();
 }
 }
 */

class Solution {
    public String longestPalindrome(String s) {

        return "";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(s));
        sc.close();
    }
}

