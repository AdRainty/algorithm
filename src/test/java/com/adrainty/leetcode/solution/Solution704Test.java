package com.adrainty.leetcode.solution;

import com.adrainty.leetcode.Solution704;
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
public class Solution704Test {

    Solution704 solution704 = new Solution704();

    private final int target;

    private final int[] nums;

    private final int expect;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { new int[]{ -1, 0, 3, 5, 9, 12 }, 9, 4 },
            { new int[]{ -1, 0, 3, 5, 9, 12 }, 2, -1 }
        });
    }

    public Solution704Test(int[] nums, int target, int expect) {
        this.nums = nums;
        this.target = target;
        this.expect = expect;
    }

    @Test
    public void testAll() {
        int ans = solution704.search(nums, target);
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("target: " + target);
        System.out.println("result: " + ans);
        System.out.println("expect: " + expect);
        Assert.assertEquals(ans, expect);
    }

}
