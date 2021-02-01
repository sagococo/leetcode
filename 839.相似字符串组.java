/*
 * @lc app=leetcode.cn id=839 lang=java
 *
 * [839] 相似字符串组
 */

// @lc code=start
class Solution {
    public int numSimilarGroups(String[] strs) {
        int total = strs.length;
        for (int i = 1; i < strs.length; i++){
            for (int k = 0; k < i; k++){
                if (similar(strs[i], strs[k])){
                    total--;
                }
            }
        }
        return total;
    }

    boolean similar(String first, String second){
        int len = first.length();
        int one = -1;
        int two = -1;
        int count = 0;
        for (int i = 0;i < first.length(); i++){
            if (first.charAt(i) != second.charAt(i)){
                count++;
                if (count >= 3) return false;
                if (one == -1) one = i;
                else two = i;
            }
        }

        if (count == 0 || (count == 2)  && first.charAt(one)==second.charAt(two) && first.charAt(two) == second.charAt(one)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        String[] test = {"qihcochwmglyiggvsqqfgjjxu","gcgqxiysqfqugmjgwclhjhovi","gjhoggxvcqlcsyifmqgqujwhi","wqoijxciuqlyghcvjhgsqfmgg","qshcoghwmglygqgviiqfjcjxu","jgcxqfqhuyimjglgihvcqsgow","qshcoghwmggylqgviiqfjcjxu","wcoijxqiuqlyghcvjhgsqgmgf","qshcoghwmglyiqgvigqfjcjxu","qgsjggjuiyihlqcxfovchqmwg","wcoijxjiuqlyghcvqhgsqgmgf","sijgumvhqwqioclcggxgyhfjq","lhogcgfqqihjuqsyicxgwmvgj","ijhoggxvcqlcsygfmqgqujwhi","qshcojhwmglyiqgvigqfgcjxu","wcoijxqiuqlyghcvjhgsqfmgg","qshcojhwmglyiggviqqfgcjxu","lhogcgqqfihjuqsyicxgwmvgj","xscjjyfiuglqigmgqwqghcvho","lhggcgfqqihjuqsyicxgwmvoj","lhgocgfqqihjuqsyicxgwmvgj","qihcojhwmglyiggvsqqfgcjxu","ojjycmqshgglwicfqguxvihgq","sijvumghqwqioclcggxgyhfjq","gglhhifwvqgqcoyumcgjjisqx"};
        System.out.println(new Solution().numSimilarGroups(test));
    }
}
// @lc code=end

