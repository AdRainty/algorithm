package com.adrainty.leetcode.solution;

import com.adrainty.leetcode.Solution209;
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
public class Solution209Test {

    Solution209 solution209 = new Solution209();

    private final int target;

    private final int[] nums;

    private final int expect;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 3, 1, 2, 4, 3}, 7, 2},
                {new int[]{1, 4, 4}, 4, 1},
                {new int[]{1, 1, 1, 1, 1, 1, 1, 1}, 11, 0}
        });
    }

    public Solution209Test(int[] nums, int target, int expect) {
        this.nums = nums;
        this.target = target;
        this.expect = expect;
    }

    @Test
    public void testAll() {
        int ans = solution209.minSubArrayLen(target, nums);
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("result: " + ans);
        System.out.println("expect: " + expect);
        Assert.assertEquals(ans, expect);
    }

}
