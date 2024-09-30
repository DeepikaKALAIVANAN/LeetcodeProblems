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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1){
            return head;
        }
        ListNode oHead = new ListNode(-1);
        ListNode oTail = oHead;
        ListNode tHead = null;
        ListNode tTail = null;
        int n = 0;
        ListNode fwd = null;
        ListNode curr = head;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        while(n>=k){
            int tempK = k;
            while(tempK-->0){
                fwd = curr.next;
                curr.next = null;
                if(tHead == null){
                    tHead = tTail = curr;
                }else{
                    curr.next = tHead;
                    tHead = curr;
                }
                curr = fwd;
            }
            if(oHead.next == null){
                oHead.next = tHead;
                oTail = tTail;
                tTail = null;
                tHead = null;

            }
            else{
                oTail.next = tHead;
                oTail = tTail;
                tHead = null;
                tHead = null;
            }
            n = n - k;
        } 
        oTail.next = curr;
        return oHead.next;
    }
}