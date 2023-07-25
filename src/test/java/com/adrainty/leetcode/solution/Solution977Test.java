package com.adrainty.leetcode.solution;

import com.adrainty.leetcode.Solution977;
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
public class Solution977Test {

    Solution977 solution704 = new Solution977();

    private final int[] nums;

    private final int[] expect;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{-4, -1, 0, 3, 10}, new int[]{0, 1, 9, 16, 100}},
                {new int[]{-7, -3, 2, 3, 11}, new int[]{4, 9, 9, 49, 121}}
        });
    }

    public Solution977Test(int[] nums, int[] expect) {
        this.nums = nums;
        this.expect = expect;
    }

    @Test
    public void testAll() {
        int[] ans = solution704.sortedSquares(nums);
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("result: " + Arrays.toString(ans));
        System.out.println("expect: " + Arrays.toString(expect));
        Assert.assertArrayEquals(ans, expect);
    }

}
