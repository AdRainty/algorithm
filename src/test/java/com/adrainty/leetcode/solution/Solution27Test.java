package com.adrainty.leetcode.solution;

import com.adrainty.leetcode.Solution27;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author AdRainty
 * @version V1.0.0
 * @since 2023/7/26 0:10
 */
@RunWith(Parameterized.class)
public class Solution27Test {

    Solution27 solution27 = new Solution27();

    private final int val;

    private final int[] nums;

    private final int[] expect;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{3, 2, 2, 3}, 3, new int[]{2, 2}},
                {new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 1, 3, 0, 4}}
        });
    }

    public Solution27Test(int[] nums, int val, int[] expect) {
        this.nums = nums;
        this.val = val;
        this.expect = expect;
    }

    @Test
    public void testAll() {
        int size = solution27.removeElement(nums, val);
        int[] ans = Arrays.copyOfRange(nums, 0, size);
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("val: " + val);
        System.out.println("result: " + Arrays.toString(ans));
        System.out.println("expect: " + Arrays.toString(expect));
        Assert.assertArrayEquals(ans, expect);
    }

}
