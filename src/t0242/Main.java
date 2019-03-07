package t0242;

/**
 * @author yuanweimin(aszed)
 * @title valid-anagram
 * @id #0242
 */

/**
 * https://leetcode-cn.com/problems/valid-anagram/
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 */

/*
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return new String(s1).equals(new String(t1));
    }
}
*/

/*
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sm = new HashMap();
        Map<Character, Integer> tm = new HashMap();
        for (Character ch : s.toCharArray()) {
            if (sm.get(ch) == null) {
                sm.put(ch, 1);
            } else {
                sm.put(ch, sm.get(ch) + 1);
            }
        }
        for (Character ch : t.toCharArray()) {
            if (tm.get(ch) == null) {
                tm.put(ch, 1);
            } else {
                tm.put(ch, tm.get(ch) + 1);
            }
        }
        return sm.equals(tm);
    }
}
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;

        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
            table[t.charAt(i) - 'a']--;
        }

        for (int ele : table)
            if (ele != 0) return false;
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(solution.isAnagram(s, t));
    }
}
