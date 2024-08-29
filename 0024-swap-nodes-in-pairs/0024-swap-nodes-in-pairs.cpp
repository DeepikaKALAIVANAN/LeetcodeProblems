class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        if (head == NULL || head->next == NULL) {
            return head;
        }
        ListNode* slow = head;
        ListNode* fast = head;
        ListNode* NewHead = NULL;
        ListNode* prev = NULL;
        
        while (fast != NULL && fast->next != NULL) {
            ListNode* temp = slow->next;
            fast = fast->next->next;
            slow->next = fast;
            temp->next = slow;
            if (prev != NULL) {
                prev->next = temp;
            }
            prev = slow;
            slow = fast;
            if (NewHead == NULL) {
                NewHead = temp;
            }
        }
        return NewHead;
    }
};