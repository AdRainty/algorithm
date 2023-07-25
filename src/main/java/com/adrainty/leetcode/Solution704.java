package com.adrainty.leetcode;

/**
 * 704. 二分查找
 * @author AdRainty
 * @version V1.0.0
 * @since 2023/7/25 23:55
 */
public class Solution704 {

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int x = nums[mid];
            if (x == target) return mid;
            else if (x > target) {
                r = mid -1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

}
