package t0062;

/**
 * @author yuanweimin(aszed)
 * @title unique-paths
 * @id #0062
 */

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] map = new int[n][m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 || j == m - 1) {
                    map[i][j] = 1;
                } else {
                    map[i][j] = 0;
                }
            }
        }
        return dp(map);
    }

    static int dp(int[][] map) {
        for (int i = map.length - 2; i >= 0; i--) {
            for (int j = map[0].length - 2; j >= 0; j--) {
                map[i][j] = map[i + 1][j] + map[i][j + 1];
            }
        }
        return map[0][0];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.uniquePaths(7, 3);
    }
}
