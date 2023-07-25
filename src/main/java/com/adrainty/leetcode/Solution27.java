package com.adrainty.leetcode;

/**
 * 27. 移除元素
 * @author AdRainty
 * @version V1.0.0
 * @since 2023/7/26 0:09
 */
public class Solution27 {

    public int removeElement(int[] nums, int val) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[ans++] = nums[i];
            }
        }
        return ans;
    }

}
