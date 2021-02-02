/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
import java.util.Collections;
class Solution {
    public String longestPalindrome(String s) {
        char[] chs = s.toCharArray();
        char[] rev_chs = chs.clone();
        Collections.reverse(rev_chs);


    }
}
// @lc code=end

