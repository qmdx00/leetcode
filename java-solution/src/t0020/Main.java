package t0020;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author yuanweimin(aszed)
 * @title valid-parentheses
 * @id #0020
 */

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
        for (Character ele : s.toCharArray()) {
            if (stack.size() == 0) {
                stack.push(ele);
            } else if (map.get(stack.peek()) == ele) {
                stack.pop();
            } else {
                stack.push(ele);
            }
        }
        return stack.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "()[]{}";
        System.out.println(solution.isValid(str));
    }
}
