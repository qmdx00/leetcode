### Pow(x, n)

描述： [https://leetcode-cn.com/problems/powx-n/](https://leetcode-cn.com/problems/powx-n/)
难度： 中等

#### 解题

##### 方法一

> 循环

```java
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
```

##### 方法二

> 递归(timeout)

```java
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
```

