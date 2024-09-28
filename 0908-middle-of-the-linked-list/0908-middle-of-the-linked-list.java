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
    public ListNode middleNode(ListNode head) {
        // using two pointer slow and fast 
        ListNode slow = head; // slow moves one by one
        ListNode fast = head; // fast skips one and moves to next
        // slow is moved to half the length of fast
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
    }
        return slow;
    }
}