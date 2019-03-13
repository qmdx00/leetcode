package t0200;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] map = {
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        };
        int res = solution.numIslands(map);
        System.out.println(res);
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != '0') {
                    count ++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    static void dfs(char[][] map, int x, int y) {
        if (x < 0 || x >= map.length) return;
        if (y < 0 || y >= map[0].length) return;
        if (map[x][y] == '0') return;

        map[x][y] = '0';

        dfs(map, x, y + 1);
        dfs(map, x, y - 1);
        dfs(map, x + 1, y);
        dfs(map, x - 1, y);
    }
}
