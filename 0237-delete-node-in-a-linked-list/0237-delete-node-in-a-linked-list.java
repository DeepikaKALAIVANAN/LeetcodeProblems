/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // copying the value of next node to the node and pushing it to back
        node.val = node.next.val;
        node.next = node.next.next;
    }
}