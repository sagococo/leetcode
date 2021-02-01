/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start

//Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null;
        ListNode current = null;
        int plus = 0;
        while(l1!=null || l2!=null){
            int one;
            int two;

            if(l1 == null) one = 0;
            else {
                one = l1.val;
                l1 = l1.next;
            }
            if(l2 == null) two = 0;
            else {
                two = l2.val;
                l2 = l2.next;
            }
            

            if(ans == null){
                ans = new ListNode((one+two+plus)%10);
                plus = (one+two+plus)/10;
                current = ans;
            }else{
                current.next = new ListNode((one+two+plus)%10);
                plus = (one+two+plus)/10;
                current = current.next;
            }
        }

        if(plus > 0){
            current.next = new ListNode(plus);
        }

        return ans;
    }
}
// @lc code=end

