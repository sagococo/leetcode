import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(set.contains(diff)){
                for(int k = nums.length - 1; k>i; k--){
                    if(nums[k] == diff){
                        return new int[]{i, k};
                    }
                }
            }
        }
    return new int[]{0, 0};
    }
}
// @lc code=end

