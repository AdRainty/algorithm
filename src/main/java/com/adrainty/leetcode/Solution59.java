package com.adrainty.leetcode;

/**
 * 59. 螺旋矩阵 II
 * @author AdRainty
 * @version V1.0.0
 * @since 2023/7/26 0:25
 */
public class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int dx = 0, dy = 1;
        int x = 0, y = 0;
        for (int i = 1; i <= n * n ; i++) {
            ans[x][y] = i;
            if (ans[(x + dx + n) % n][(y + dy + n) % n] != 0) {
                int tmp = dy;
                dy = -dx;
                dx = tmp;
            }
            x += dx;
            y += dy;
        }
        return ans;
    }
}
