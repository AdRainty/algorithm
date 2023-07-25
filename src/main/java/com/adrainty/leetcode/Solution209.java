package com.adrainty.leetcode;

/**
 * 209. 长度最小的子数组
 * @author AdRainty
 * @version V1.0.0
 * @since 2023/7/26 0:20
 */
public class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int s = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            int x = nums[right];
            s += x;
            while (s - nums[left] >= target) {
                s -= nums[left++];
            }
            if (s >= target) ans = Math.min(ans, right - left + 1);
        }
        return ans <= n? ans: 0;
    }
}
