import org.graalvm.compiler.nodes.calc.NotNode;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        if (n==0) return 0;
        if (n==1) return 1;

        char[] chs = s.toCharArray();
        int left = 0;
        int right = 0;

        int max = -1;

        int[] freq = new int[128];
        while(right < n){
            if(freq[chs[right]] == 0){
                freq[chs[right]]++;
                right++;
                max = Math.max(max, right-left);
            }else{
                freq[chs[left]]--;
                left++;
            }
        }

        return max;
    }
}
// @lc code=end

