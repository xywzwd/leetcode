/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
// key point: for loop: search from middle to two sides
// time: O(n^2) space: O(n)
class Solution {
    private int start, maxLen;
    public String longestPalindrome(String s) {
        String res = "";
        if (s == null || s.length() < 1) {
            return res;
        }
        
        for (int i = 0; i < s.length(); i++) {
            findPalindrome(s, i, i);
            findPalindrome(s, i, i + 1);
        }

        return res = s.substring(start, start + maxLen);
    }

    private void findPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() &&
        s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        if (maxLen < (right - left - 1)) {
            start = left + 1;
            maxLen = right - left - 1;
        }
    }
}
// @lc code=end

