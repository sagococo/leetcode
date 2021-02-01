/*
 * @lc app=leetcode.cn id=888 lang=java
 *
 * [888] 公平的糖果交换
 */

// @lc code=start
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA=0, sumB=0;
        for(int i = 0;i < A.length; i++){
            sumA+=A[i];
        }

        for(int i = 0;i < B.length; i++){
            sumB+=B[i];
        }
        

        int diff = sumA - sumB;

        for(int i = 0;i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                if(diff == 2*(A[i]-B[j])){
                    return new int[]{A[i], B[j]};
                }
            }
        }

        return new int[]{0, 0};
    }
}
// @lc code=end

