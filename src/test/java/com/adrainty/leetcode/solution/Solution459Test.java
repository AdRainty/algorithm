package com.adrainty.leetcode.solution;

import com.adrainty.leetcode.Solution459;
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
public class Solution459Test {

    Solution459 solution459 = new Solution459();

    private final String s;

    private final boolean expect;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"abab", true},
                {"aba", false},
                {"abcabcabcabc", true}
        });
    }

    public Solution459Test(String s, boolean expect) {
        this.s = s;
        this.expect = expect;
    }

    @Test
    public void testAll() {
        boolean ans = solution459.repeatedSubstringPattern(s);
        System.out.println("s: " + s);
        System.out.println("result: " + ans);
        System.out.println("expect: " + expect);
        Assert.assertEquals(ans, expect);
    }

}
