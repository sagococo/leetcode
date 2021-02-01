/*
 * @lc app=leetcode.cn id=1716 lang=java
 *
 * [1716] 计算力扣银行的钱
 */

// @lc code=start
class Solution {
    public int totalMoney(int n) {

        if(n <= 7){
            return (1+n)*n/2;
        }
        
        int w = n/7;
        int day = n%7;
        return (28+21+7*w)*w/2 + (w+w+day+1)*day/2;
    }
}
// @lc code=end

