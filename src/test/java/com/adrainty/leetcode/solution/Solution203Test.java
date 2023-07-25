package com.adrainty.leetcode.solution;

import com.adrainty.leetcode.LeetcodeUtils;
import com.adrainty.leetcode.Solution203;
import com.adrainty.leetcode.base.ListNode;
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
public class Solution203Test {

    Solution203 solution203 = new Solution203();

    private final int val;

    private final ListNode head;

    private final ListNode expect;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {LeetcodeUtils.numsToListNode(new int[]{1, 2, 6, 3, 4, 5, 6}), 6, LeetcodeUtils.numsToListNode(new int[]{1, 2, 3, 4, 5})},
                {LeetcodeUtils.numsToListNode(new int[]{}), 1, LeetcodeUtils.numsToListNode(new int[]{})},
                {LeetcodeUtils.numsToListNode(new int[]{7, 7, 7, 7}), 7, LeetcodeUtils.numsToListNode(new int[]{})}
        });
    }

    public Solution203Test(ListNode head, int val, ListNode expect) {
        this.head = head;
        this.val = val;
        this.expect = expect;
    }

    @Test
    public void testAll() {
        ListNode ans = solution203.removeElements(head, val);
        int[] ansList = LeetcodeUtils.listNodeToNums(ans);
        int[] expectList = LeetcodeUtils.listNodeToNums(expect);
        System.out.println("nums: " + Arrays.toString(LeetcodeUtils.listNodeToNums(head)));
        System.out.println("val: " + val);
        System.out.println("result: " + Arrays.toString(ansList));
        System.out.println("expect: " + Arrays.toString(expectList));
        Assert.assertArrayEquals(ansList, expectList);
    }

}
