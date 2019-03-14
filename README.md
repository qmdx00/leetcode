# leetcode

### leetcode 刷题记录

| 编号 |                             题目                             |            实现             | 难度 |
| :--: | :----------------------------------------------------------: | :-------------------------: | :--: |
| 0001 |    [两数之和](https://leetcode-cn.com/problems/two-sum/)     | [Java](src/t0001/Main.java) | 简单 |
| 0002 | [两数相加](https://leetcode-cn.com/problems/add-two-numbers/) | [Java](src/t0002/Main.java) | 中等 |
| 0007 | [整数反转](https://leetcode-cn.com/problems/reverse-integer/) | [Java](src/t0007/Main.java) | 简单 |
| 0009 | [回文数](https://leetcode-cn.com/problems/palindrome-number/) | [Java](src/t0009/Main.java) | 简单 |
| 0020 | [有效的括号](https://leetcode-cn.com/problems/valid-parentheses/) | [Java](src/t0020/Main.java) | 简单 |
| 0024 | [两两交换链表中的节点](https://leetcode-cn.com/problems/swap-nodes-in-pairs/) | [Java](src/t0024/Main.java) | 中等 |
| 0050 |    [Pow(x, n)](https://leetcode-cn.com/problems/powx-n/)     | [Java](src/t0050/Main.java) | 中等 |
| 0098 | [验证二叉搜索树](https://leetcode-cn.com/problems/validate-binary-search-tree/) | [Java](src/t0098/Main.java) | 中等 |
|      |   [相同的树](https://leetcode-cn.com/problems/same-tree/)    | [Java](src/t0100/Main.java) | 简单 |
| 0104 | [二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/) | [Java](src/t0104/Main.java) | 简单 |
| 0111 | [二叉树的最小深度](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/) | [Java](src/t0111/Main.java) | 简单 |
| 0122 | [买卖股票的最佳时机II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/) | [Java](src/t0122/Main.java) | 简单 |
| 0141 | [环形链表](https://leetcode-cn.com/problems/linked-list-cycle/) | [Java](src/t0141/Main.java) | 简单 |
| 0169 | [求众数](https://leetcode-cn.com/problems/majority-element/) | [Java](src/t0169/Main.java) | 简单 |
| 0200 | [岛屿的个数](https://leetcode-cn.com/problems/number-of-islands/) | [Java](src/t0200/Main.java) | 中等 |
| 0206 | [反转链表](https://leetcode-cn.com/problems/reverse-linked-list/) | [Java](src/t0206/Main.java) | 简单 |
| 0239 | [滑动窗口最大值](https://leetcode-cn.com/problems/sliding-window-maximum/) | [Java](src/t0239/Main.java) | 困难 |
| 0242 | [有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/) | [Java](src/t0242/Main.java) | 简单 |
| 0495 | [提莫攻击](https://leetcode-cn.com/problems/teemo-attacking) | [Java](src/t0495/Main.java) | 中等 |
| 0703 | [数据流中的第k大元素](https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/) | [Java](src/t0703/Main.java) | 简单 |
| 0771 | [宝石与石头](https://leetcode-cn.com/problems/jewels-and-stones/) | [Java](src/t0771/Main.java) | 简单 |

### 递归模板

```Text
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