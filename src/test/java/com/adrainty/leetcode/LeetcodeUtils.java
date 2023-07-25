package com.adrainty.leetcode;

import com.adrainty.leetcode.base.ListNode;

import java.util.*;

/**
 * 力扣工具类
 *
 * @author AdRainty
 * @version V1.0.0
 * @since 2023/7/25 23:53
 */
@SuppressWarnings("unused")
public class LeetcodeUtils {

    private LeetcodeUtils() {
    }

    public static ListNode numsToListNode(int[] nums) {
        if (nums.length == 0) return null;
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for (int i = 1; i < nums.length; i++) {
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
        return head;
    }

    public static int[] listNodeToNums(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            ans.add(cur.val);
            cur = cur.next;
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] stringToList(String listString) {
        return Arrays.stream(listString.substring(1, listString.length() - 1).split(","))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();
    }

}
