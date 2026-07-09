// Last updated: 09/07/2026, 09:53:27
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //using fast slow 2 pts 
        ListNode slow = head;
        ListNode fast = head;

        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        if(fast == null) return head.next;
        //We moved exactly length of list
        //So node to remove = head (1) -> return from head(2) -> head.next

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}