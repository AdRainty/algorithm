package com.adrainty.leetcode;

/**
 * 459. 重复的子字符串
 * @author AdRainty
 * @version V1.0.0
 * @since 2023/7/26 0:59
 */
public class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        int[] next = new int[s.length()];
        getNext(next, s);
        return next[len - 1] > 0 && len % (len - next[len - 1]) == 0;
    }

    private void getNext(int[] next, String s) {
        int j = 0;
        next[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = next[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) j++;
            next[i] = j;
        }
    }
}
