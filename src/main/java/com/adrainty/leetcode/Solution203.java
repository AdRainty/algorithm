package com.adrainty.leetcode;

import com.adrainty.leetcode.base.ListNode;

/**
 * 203. 移除链表元素
 * @author AdRainty
 * @version V1.0.0
 * @since 2023/7/26 0:31
 */
public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(-1, head);
        ListNode cur = newHead;
        while (cur.next != null) {
            if (cur.next.val == val) cur.next = cur.next.next;
            else cur = cur.next;
        }
        return newHead.next;
    }
}

