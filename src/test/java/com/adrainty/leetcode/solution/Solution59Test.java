package com.adrainty.leetcode.solution;

import com.adrainty.leetcode.Solution59;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author AdRainty
 * @version V1.0.0
 * @since 2023/7/25 23:56
 */
@RunWith(Parameterized.class)
public class Solution59Test {

    Solution59 solution59 = new Solution59();

    private final int n;

    private final int[][] expect;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, new int[][]{new int[]{1, 2, 3}, new int[]{8, 9, 4}, new int[]{7, 6, 5}}},
                {1, new int[][]{new int[]{1}}}
        });
    }

    public Solution59Test(int n, int[][] expect) {
        this.n = n;
        this.expect = expect;
    }

    @Test
    public void testAll() {
        int[][] ans = solution59.generateMatrix(n);
        System.out.println("n: " + n);
        System.out.println("result: " + Arrays.deepToString(ans));
        System.out.println("expect: " + Arrays.deepToString(expect));
        Assert.assertArrayEquals(ans, expect);
    }

}
