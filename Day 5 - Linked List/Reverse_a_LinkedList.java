/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null)return head;
        ListNode left = null, right = head;
        while(head != null){
            right = head.next;
            head.next = left;
            left = head;
            head = right;
        }   
        return left;
    }
}