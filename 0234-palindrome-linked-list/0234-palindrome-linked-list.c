/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head){
        if(!head)   return false;
        if(!head->next) return true;

        struct ListNode *rev_head = NULL , *ptr = head;
        while(ptr != NULL)
        {
            struct ListNode *temp = (struct ListNode*)malloc(sizeof(struct ListNode));
            temp->val = ptr->val;
            temp->next = rev_head;
            rev_head = temp;
            ptr = ptr->next;
        }

        while(head && rev_head)
        {
            if(head->val != rev_head->val)  return false;
            else
            {
                head = head->next;
                rev_head = rev_head->next;
            }
        }
        return true;

}