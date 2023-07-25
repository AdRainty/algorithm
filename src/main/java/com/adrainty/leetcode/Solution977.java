package com.adrainty.leetcode;

/**
 * 977. 有序数组的平方
 * @author AdRainty
 * @version V1.0.0
 * @since 2023/7/26 0:16
 */
public class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] ans = new int[nums.length];
        int tar = nums.length - 1;
        while (tar >= 0 && left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[tar--] = nums[left] * nums[left];
                left ++;
            } else {
                ans[tar--] = nums[right] * nums[right];
                right --;
            }
        }
        return ans;
    }
}
