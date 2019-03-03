# leetcode

### leetcode 刷题记录

| 编号 |                             题目                             |                             实现                             | 难度 |
| :--: | :----------------------------------------------------------: | :----------------------------------------------------------: | :--: |
| 0001 |    [两数之和](https://leetcode-cn.com/problems/two-sum/)     |              [Java](src/0001-two-sum/Main.java)              | 简单 |
| 0002 | [两数相加](https://leetcode-cn.com/problems/add-two-numbers/) |          [Java](src/0002-add-two-numbers/Main.java)          | 中等 |
| 0003 | [无重复字符的最长子串](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/) | [Java](src/0003-longest-substring-without-repeating-characters/Main.java) | 中等 |
| 0007 | [整数反转](https://leetcode-cn.com/problems/reverse-integer/) |          [Java](src/0007-reverse-integer/Main.java)          | 简单 |
| 0009 | [回文数](https://leetcode-cn.com/problems/palindrome-number/) |         [Java](src/0009-palindrome-number/Main.java)         | 简单 |
| 0020 | [有效的括号](https://leetcode-cn.com/problems/valid-parentheses/) |         [Java](src/0020-valid-parentheses/Main.java)         | 简单 |
| 0024 | [两两交换链表中的节点](https://leetcode-cn.com/problems/swap-nodes-in-pairs/) |        [Java](src/0024-swap-nodes-in-pairs/Main.java)        | 中等 |
| 0050 |    [Pow(x, n)](https://leetcode-cn.com/problems/powx-n/)     |              [Java](src/0050-powx-n/Main.java)               | 中等 |
| 0098 | [验证二叉搜索树](https://leetcode-cn.com/problems/validate-binary-search-tree/) |    [Java](src/0098-validate-binary-search-tree/Main.java)    | 中等 |
| 0122 | [买卖股票的最佳时机II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/) | [Java](src/0122-best-time-to-buy-and-sell-stock-ii/Main.java) | 简单 |
| 0141 | [环形链表](https://leetcode-cn.com/problems/linked-list-cycle/) |         [Java](src/0141-linked-list-cycle/Main.java)         | 简单 |
| 0169 | [求众数](https://leetcode-cn.com/problems/majority-element/) |         [Java](src/0169-majority-element/Main.java)          | 简单 |
| 0206 | [反转链表](https://leetcode-cn.com/problems/reverse-linked-list/) |        [Java](src/0206-reverse-linked-list/Main.java)        | 简单 |
| 0239 | [滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum/) |      [Java](src/0239-sliding-window-maximum/Main.java)       | 困难 |
| 0242 | [有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/) |           [Java](src/0242-valid-anagram/Main.java)           | 简单 |
| 0495 | [提莫攻击](https://leetcode-cn.com/problems/teemo-attacking) |          [Java](src/0495-teemo-attacking/Main.java)          | 中等 |
| 0703 | [数据流中的第k大元素](https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/) |  [Java](src/0703-kth-largest-element-in-a-stream/Main.java)  | 简单 |
| 0771 | [宝石与石头](https://leetcode-cn.com/problems/jewels-and-stones/) |         [Java](src/0771-jewels-and-stones/Main.java)         | 简单 |

### 递归模板

```java
void recursion(int level, int... params) {
    // recursion terminator
    if (level > MAX_LEVEL) {
        print_result();
    	return;
    }
    
    // process logic in current level
    process_data(level, data ...);
    
    // drill down
    recursion(level + 1, p1, ...);
    
    // reverse the current level status if needed
    reverse_state(level);
}
```

### asciinema

[![asciicast](https://asciinema.org/a/Sq7D2TDIFHvFY2mcHDY9qSVwz.svg)](https://asciinema.org/a/Sq7D2TDIFHvFY2mcHDY9qSVwz)